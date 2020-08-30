package com.wipro.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.bean.UserDetails;


@SuppressWarnings("deprecation")
@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addPerson(UserDetails p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		System.out.println(p);
		logger.info("Person saved successfully, Person Details="+p);
	}

	@Override
	public void updatePerson(UserDetails p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		System.out.println(p);
		logger.info("Person updated successfully, Person Details="+p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserDetails> listPersons() {
		Session session = this.sessionFactory.getCurrentSession();
		List<UserDetails> personsList = session.createQuery("from UserDetails").list();
		for(UserDetails p : personsList){
			logger.info("Person List::"+p);
		}
		System.out.println(personsList);
		return personsList;
	}

	@Override
	public UserDetails getPersonById(String id) {
		Session session = this.sessionFactory.getCurrentSession();		
		UserDetails p = (UserDetails) session.load(UserDetails.class, new String(id));
		logger.info("Person loaded successfully, Person details="+p);
		System.out.println(p);
		return p;
	}

	@Override
	public void removePerson(String id) {
		Session session = this.sessionFactory.getCurrentSession();
		UserDetails p = (UserDetails) session.load(UserDetails.class, new String(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Person deleted successfully, person details="+p);
		System.out.println(p);
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public boolean getCustomer(String cid, String pswd) {
		Session s=sessionFactory.openSession();
		String hql="SELECT Password FROM UserDetails WHERE Username=:cid";
		Query<UserDetails> q=s.createQuery(hql);
		q.setParameter("cid", cid);
		List<UserDetails> l1=q.getResultList();
		System.out.println(l1.size());
		if(l1!=null && l1.size()>0)
		{
			Object obj1=l1.get(0);
			if(pswd.equals(obj1))
				return true;
		}
		return false;
	}

}