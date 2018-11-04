package com.marcomm.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.jpa.criteria.compile.CriteriaInterpretation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marcomm.model.MasterSouvenir;

@Repository
public class MasterSouvenirDaoImpl implements MasterSouvenirDao{
	
	@Autowired
	SessionFactory sessionFactory;

	
	public void save(MasterSouvenir masterSouvenir) {
		Session  session= sessionFactory.getCurrentSession();
		session.save(masterSouvenir);
		
	}


	public String getCodeById() {
		// TODO Auto-generated method stub
		String hql = "from MasterSouvenir ORDER BY id DESC";
		Session session = sessionFactory.getCurrentSession();
		MasterSouvenir masterSouvenir = (MasterSouvenir) session.createQuery(hql).setMaxResults(1).uniqueResult();
		if (masterSouvenir==null) {
			return "SV0001";
		}
		else {
			String codeHuruf = masterSouvenir.getCode().substring(0, 2);
			String codeAngka = masterSouvenir.getCode().substring(2);
			int increment = Integer.valueOf(codeAngka)+1;
			String endCode = codeHuruf+String.format("%04d", increment);
			return endCode;
		}
	}


	public List<MasterSouvenir> gelAllSouvenir() {
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(MasterSouvenir.class);
		//@SuppressWarnings("unchecked")
		List<MasterSouvenir> ListSouvenir=cr.add(Restrictions.eq("isDeleted", false)).addOrder(Order.asc("id")).list();
		
		return ListSouvenir;
	}


	public MasterSouvenir getSouvenirById(int id) {
		Session session=sessionFactory.getCurrentSession();
		MasterSouvenir souvenir= session.get(MasterSouvenir.class, id);
		return souvenir;
	}


	public void update(MasterSouvenir masterSouvenir) {
		Session session= sessionFactory.getCurrentSession();
		session.update(masterSouvenir);
		
	}


	public void updateDelete(MasterSouvenir masterSouvenir) {
		Session session= sessionFactory.getCurrentSession();
		session.update(masterSouvenir);
		
	}


	public List<MasterSouvenir> getByName(String name) {
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(MasterSouvenir.class);

		Criterion criterionAnd = Restrictions.and(Restrictions.ilike("name", name+" %"), Restrictions.eq("isDeleted", false));
		Criterion criterionOr= Restrictions.or(criterionAnd, Restrictions.ilike("name", name));
		List<MasterSouvenir> nameSouvenir = cr.add(criterionOr).list();
		return nameSouvenir;
	}

}
