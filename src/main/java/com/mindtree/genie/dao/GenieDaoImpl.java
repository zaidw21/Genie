package com.mindtree.genie.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mindtree.genie.entities.GenieForm;
import com.mindtree.genie.entities.UserDetails;

public class GenieDaoImpl implements GenieDao {

	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public UserDetails validateUser(UserDetails userdetails) {
		UserDetails user=null;
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		user=(UserDetails) session.get(UserDetails.class, userdetails.getEmail());
		session.getTransaction().commit();
		session.close();
		return user;
		
	}

	@Override
	public String saveGenie(GenieForm genieForm) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(genieForm);
		session.getTransaction().commit();
		session.close();
		return "success";
	}

	@Override
	public List<UserDetails> getAllAssignedGenie(String mid) {
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		Query query=session.createQuery("from userDetails u where u.assignedTo=? ");
		query.setParameter(1,mid);
		@SuppressWarnings("unchecked")
		List<UserDetails> list=query.list();
		return list;
	}

}
