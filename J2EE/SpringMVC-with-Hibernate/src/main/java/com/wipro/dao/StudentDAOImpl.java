package com.wipro.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.bean.Student;

import java.util.List;

@SuppressWarnings("deprecation")
@Repository
public class StudentDAOImpl implements StudentDAO {


	 @Autowired
	    private SessionFactory sessionFactory;
	 
	    public boolean addStudent(Student student) {
	        sessionFactory.getCurrentSession().saveOrUpdate(student);
	        return true;
	 
	    }
	 
	    @SuppressWarnings("unchecked")
	    public List<Student> getAllStudent() {
	 
	        return sessionFactory.getCurrentSession().createQuery("from Student")
	                .list();
	    }
	    
	    @SuppressWarnings({ "unchecked" })
		@Override
	    public int getStudentId() {
	    	int id=0;
	    	Session s=sessionFactory.openSession();
	    	Query<Student> q=s.createQuery("Select max(Studentid) from Student");
	    	List<Student> l=q.getResultList();
	    	if(l!=null&&l.size()>0)
	    	{
	    		Object obj=l.get(0);
	    		if(obj!=null)
	    			id=(Integer)obj+1;
	    	}
			return id;
	    	
	    }
	 
	    @Override
	    public void deleteStudent(Integer StudentId) {
	    	Student employee = sessionFactory.getCurrentSession().load(
	    			Student.class, StudentId);
	        if (null != employee) {
	            this.sessionFactory.getCurrentSession().delete(employee);
	        }
	 
	    }
	 
	    public Student getStudent(int StudentId) {
	        return sessionFactory.getCurrentSession().get(
	        		Student.class, StudentId);
	    }
	 
	    @Override
	    public Student updateStudent(Student student) {
	        sessionFactory.getCurrentSession().update(student);
	        return student;
	    }
	 
	}