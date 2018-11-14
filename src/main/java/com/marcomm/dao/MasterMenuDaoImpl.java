package com.marcomm.dao;

import java.util.Date;
import java.util.List;

import org.bouncycastle.asn1.isismtt.x509.Restriction;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marcomm.model.MasterMenu;

@Repository
public class MasterMenuDaoImpl implements MasterMenuDao{

	@Autowired
	SessionFactory sessionFactory;

	public void save(MasterMenu masterMenu) {
		// TODO Auto-generated method stub
		Date now=new Date();
		masterMenu.setCreatedDate(now);
		masterMenu.setUpdatedDate(now);
		masterMenu.setCode(getCode());
		masterMenu.setDelete(false);
		masterMenu.setCreatedBy("Administrator");
		masterMenu.setUpdatedBy("admin");
		Session session=sessionFactory.getCurrentSession();
		session.save(masterMenu);
	}

	public MasterMenu getCodeId(int id) {
		// TODO get code by id
		Session session=sessionFactory.getCurrentSession();
		MasterMenu masterMenu=session.get(MasterMenu.class, id);
		return masterMenu;
	}

	public List<MasterMenu> getAll() {
		// TODO get all data
		Session session=sessionFactory.getCurrentSession();
		Criteria cr=session.createCriteria(MasterMenu.class);
		List<MasterMenu> listMenu=cr.add(Restrictions.eq("isDelete", false)).addOrder(Order.asc("id")).list();
			return listMenu;
	}

	public void delete(MasterMenu masterMenu) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.delete(masterMenu);
	}

	public MasterMenu getId(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		MasterMenu masterMenu=session.get(MasterMenu.class, id);
		return masterMenu;
	}
	public void update(MasterMenu menu) {
		// TODO Auto-generated method stub
		Date now=new Date();
		menu.setCreatedDate(now);
		menu.setUpdatedDate(now);
		menu.setDelete(false);
		menu.setCreatedBy("admin");
		menu.setUpdatedBy("admin");
		Session session=sessionFactory.getCurrentSession();
		session.update(menu);
	}

	public String getCode() {
		// TODO Auto-generated method stub
		String hql= "from MasterMenu ORDER BY id DESC";
		Session session=sessionFactory.getCurrentSession();
		MasterMenu masterMenu=(MasterMenu) session.createQuery(hql).setMaxResults(1).uniqueResult();
		if(masterMenu==null) {
			return "ME0001";
		}else {
			String prefix=masterMenu.getCode().substring(0, 2);
			String no=masterMenu.getCode().substring(2);
			int tambah=Integer.valueOf(no)+1;
			String endCode=prefix+String.format("%04d", tambah);
			return endCode;
		}
	}
}
