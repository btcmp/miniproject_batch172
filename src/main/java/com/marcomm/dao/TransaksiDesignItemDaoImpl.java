package com.marcomm.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marcomm.model.DesignItemFile;
import com.marcomm.model.TransaksiDesign;
import com.marcomm.model.TransaksiDesignItem;

@Repository
public class TransaksiDesignItemDaoImpl implements TransaksiDesignItemDao {

	@Autowired
	SessionFactory sessionFactory;

	public void save(TransaksiDesignItem transaksiDesignItem) {
		Session session = sessionFactory.getCurrentSession();
		session.save(transaksiDesignItem);
	}
	
	public List<TransaksiDesignItem> getAll() {
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(TransaksiDesignItem.class);
		@SuppressWarnings("unchecked")
		List<TransaksiDesignItem>  ListDesignItem = cr.add(Restrictions.eq("isDelete", false)).list();
		return ListDesignItem;
	}
	
	public TransaksiDesignItem getById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(TransaksiDesignItem.class, id);
	}
	public List<TransaksiDesignItem> getItemByDesign(TransaksiDesign transaksiDesign) {
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(TransaksiDesignItem.class);
		cr.add(Restrictions.and(Restrictions.eq("transaksiDesign", transaksiDesign),Restrictions.eq("isDelete", false)));
		/*cr.add(Restrictions.eq("isDelete", false);*/
		List<TransaksiDesignItem> transaksiDesignItem = cr.list();
		return transaksiDesignItem;
	}
	public void closeDesignUpdate(TransaksiDesignItem transaksiDesignItem) {
		Session session = sessionFactory.getCurrentSession();
		session.update(transaksiDesignItem);
	}
//KOLOM ANGGI
	public void update(TransaksiDesignItem itemLama) {
		Session session=sessionFactory.getCurrentSession();
		session.update(itemLama);	 	
	}
	public void saveUpload(DesignItemFile designItemFile) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(designItemFile);	 	
	}
}
