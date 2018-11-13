package com.marcomm.dao;

import java.util.Date;
import java.util.List;

import org.bouncycastle.asn1.isismtt.x509.Restriction;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.marcomm.model.MasterEmployee;
import com.marcomm.model.MasterProduct;
import com.marcomm.model.MasterRole;
import com.marcomm.model.MasterUser;
import com.marcomm.service.FungsiService;
import com.marcomm.service.InitDBMarcom;

@Repository
public class MasterUserDaoImpl implements MasterUserDao {

	@Autowired
	SessionFactory sessionFactory;

	public void save(MasterUser masterUser) {
		// TODO Auto-generated method stub
		Date date = new Date();
		masterUser.setUpdatedDate(date);
		masterUser.setCreatedDate(date);
		masterUser.setCreatedBy("admin");
		masterUser.setUpdatedBy("admin");
		masterUser.setIsDelete(1);
		masterUser.setPassword(InitDBMarcom.encodePassword(masterUser.getPassword()));
		Session session = sessionFactory.getCurrentSession();
		session.save(masterUser);
	}

	public List<MasterUser> getAll() {
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(MasterUser.class);
		List<MasterUser> listUser = cr.add(Restrictions.eq("isDelete", 1)).addOrder(Order.asc("id")).list();
		return listUser;
	}

	public MasterUser getById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(MasterUser.class, id);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		MasterUser masterUser = new MasterUser();
		masterUser = getById(id);
		masterUser.setIsDelete(0);
		Date date = new Date();
		masterUser.setUpdatedDate(date);
		Session session = sessionFactory.getCurrentSession();
		session.update(masterUser);

	}

	public void update(MasterUser masterUser) {
		// TODO Auto-generated method stub

		Date date = new Date();
		masterUser.setUpdatedDate(date);
		masterUser.setCreatedDate(date);
		masterUser.setUpdatedBy("admin");
		masterUser.setIsDelete(1);
		masterUser.setPassword(InitDBMarcom.encodePassword(masterUser.getPassword()));
		Session session = sessionFactory.getCurrentSession();
		session.update(masterUser);
	}

	@SuppressWarnings("unchecked")
	public List<MasterRole> getAllRole() {
		Session session = sessionFactory.getCurrentSession(); 
		List<MasterRole> listRole = session.createCriteria(MasterRole.class).list();
		return listRole;
	}

	public List<MasterEmployee> getAllEmployee() {
		Session session = sessionFactory.getCurrentSession();
		List<MasterEmployee> listEmployee = session.createCriteria(MasterEmployee.class).list();
		return listEmployee;
	}

	public List<MasterUser> getByName(String username) { 
			// TODO get name
			Session session = sessionFactory.getCurrentSession();
			Criteria cr = session.createCriteria(MasterUser.class);
				Criterion crAnd1 = Restrictions.and(Restrictions.ilike("username", username+" %"),Restrictions.eq("isDelete", 1));
				Criterion crAnd2 = Restrictions.and(Restrictions.ilike("username", username),Restrictions.eq("isDelete", 1));
				Criterion crOr = Restrictions.or(crAnd1,crAnd2);
				List<MasterUser> usernames = cr.add(crOr).list();
				return usernames;
		
	}

	public String getRole() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String userLog=	FungsiService.getUserLog();
 
		
		Query query = session.createQuery("select mRole from MasterUser where username = :name ");
		query.setParameter("name", userLog);
		MasterRole role= (MasterRole) query.uniqueResult();
		
		return role.getRoleName();
	}

	//FUNGSI YANG DITAMBAH DIAZ
	public MasterUser getUserByUserLog() {
		Session session = sessionFactory.getCurrentSession();
		String userLog = FungsiService.getUserLog();
		Query qr = session.createQuery("select mu from MasterUser mu where mu.username = :userName");
		qr.setParameter("userName", userLog);
		MasterUser user = (MasterUser) qr.uniqueResult();
		return user;
	}
	//FUNGSI YANG DITAMBAH DIAZ
}
