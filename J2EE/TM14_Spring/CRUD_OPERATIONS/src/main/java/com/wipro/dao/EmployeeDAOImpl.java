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

import com.wipro.bean.Employee;

@SuppressWarnings("deprecation")
@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

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
	public void addPerson(Employee p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		System.out.println(p);
		logger.info("Person saved successfully, Person Details="+p);
	}

	@Override
	public void updatePerson(Employee p) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		System.out.println(p);
		logger.info("Person updated successfully, Person Details="+p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> listPersons() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Employee> personsList = session.createQuery("from Employee").list();
		for(Employee p : personsList){
			logger.info("Person List::"+p);
		}
		System.out.println(personsList);
		return personsList;
	}

	@Override
	public List<Employee> getPersonById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Query q = session.createQuery("From Employee where id=:id");
		q.setParameter("id", id);
		List<Employee> p=q.getResultList();
		logger.info("Person loaded successfully, Person details="+p);
		System.out.println(p);
		return p;
	}

	@Override
	public void removePerson(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee p = (Employee) session.load(Employee.class, new Integer(id));
		if(null != p){
			session.delete(p);
		}
		logger.info("Person deleted successfully, person details="+p);
		System.out.println(p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean getCustomer(String cid, String pswd) {
		Session s=sessionFactory.openSession();
		String hql="SELECT Password FROM Employee WHERE Username=:cid";
		Query<Employee> q=s.createQuery(hql);
		q.setParameter("cid", cid);
		List<Employee> l1=q.getResultList();
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
