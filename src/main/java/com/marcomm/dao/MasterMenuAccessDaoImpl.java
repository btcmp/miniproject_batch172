package com.marcomm.dao;

import java.util.Date;
import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.marcomm.model.MasterMenu;
import com.marcomm.model.MasterMenuAccess;
import com.marcomm.model.MasterRole;

@Repository
public class MasterMenuAccessDaoImpl implements MasterMenuAccessDao{

	@Autowired
	SessionFactory sessionFactory;

	public void save(MasterMenuAccess menuAccess) {
		// TODO Auto-generated method stub
		Date now=new Date();
		menuAccess.setCreatedDate(now);
		menuAccess.setUpdatedDate(now);
		menuAccess.setDelete(false);
		menuAccess.setCreatedBy("admin");
		menuAccess.setUpdatedBy("admin");
		Session session=sessionFactory.getCurrentSession();
		session.save(menuAccess);
	}

	public MasterMenuAccess getId(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		MasterMenuAccess menuAccess=session.get(MasterMenuAccess.class, id);
		return menuAccess;
	}

	public List<MasterMenuAccess> getAll() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Criteria cr=session.createCriteria(MasterMenuAccess.class);
		List<MasterMenuAccess> listAccess=cr.add(Restrictions.eq("isDelete", false)).addOrder(Order.asc("id")).list();
		return listAccess;
	}

	public String getCode() {
		// TODO Auto-generated method stub
		/*String hql="from MasterMenuAccess ORDER BY id DESC";
		Session session=sessionFactory.getCurrentSession();
		MasterMenuAccess menuAccess=(MasterMenuAccess) session.createQuery(hql).setMaxResults(1).uniqueResult();
		if(menuAccess==null) {
			return"RO0001";
		}else {
			String prefix=menuAccess.getmRoleId().substring(0, 2);
			String no=menuAccess.getmRoleId().substring(2);
			int tambah=Integer.valueOf(no)+1;
			String endCode=prefix+String.format("%04d", tambah);*/
			return null;
		
		
	}

	public void update(MasterMenuAccess menu) {
		// TODO Auto-generated method stub
	/*	Date now=new Date();
		menu.setCreatedDate(now);
		menu.setUpdatedDate(now);
		menu.setDelete(false);
		menu.setCreatedBy("admin");
		menu.setmRoleId(getCode());*/
		Session session=sessionFactory.getCurrentSession();
		session.update(menu);
		
	}

	public void delete(MasterMenuAccess menuAccess) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.delete(menuAccess);
	}
	/*public List<MasterMenu> getMenuByMenuAccess(MasterMenuAccess access){
		Session session = sessionFactory.getCurrentSession();
		String hql="select menu from MasterMenu menu JOIN menu.access access where M_MENU_ACCESS= :mMenuId";
		Query query = session.createQuery(hql);
		query.setParameter("theAccess",access);
		List<MasterMenu> menus=query.list();
		return menus;
	}*/

	public List<MasterMenu> getMenu() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql="from MasterMenu";
		Query query = session.createQuery(hql);
		/*query.setParameter("mMenuId",access);*/
		List<MasterMenu> menus=query.list();
		return menus;
	}

	 
	public List<MasterRole> getRole() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		String hql="from MasterRole";
		Query query=session.createQuery(hql);
		List<MasterRole> roles=query.list();
		return roles;
	}
}
