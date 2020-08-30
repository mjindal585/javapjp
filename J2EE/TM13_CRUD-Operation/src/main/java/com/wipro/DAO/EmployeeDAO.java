package com.wipro.DAO;

import org.hibernate.Transaction;

import java.util.*;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.wipro.bean.Employee;


public class EmployeeDAO {
	SessionFactory sf;
	public EmployeeDAO() {
		Configuration cfg=new Configuration().configure();
		sf=cfg.buildSessionFactory();
	}
	public String AddEmployee(Employee e)
	{
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.persist(e);
		tr.commit();
		ses.close();
		return "Successfully Added";
	}
	public String DeleteEmployee(int id)
	{
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		Employee m=ses.get(Employee.class, id);
		ses.delete(m);
		tr.commit();
		ses.close();
		return "Successfully Deleted";
		
	}
	public String ModifyEmployee(int id,String name,String Gender,String City,String Desg,String Email,double sal,long phone)
	{
		 Session session = sf.openSession();
	      Transaction tx = null;
	      String r = null;
	      try {
	         tx = session.beginTransaction();
	         Employee employee = (Employee)session.get(Employee.class, id); 
	         employee.setCity(City);
	         employee.setDesignation(Desg);
	         employee.setEmail(Email);
	         employee.setGender(Gender);
	         employee.setName(name);
	         employee.setPhone(phone);
	         employee.setSalary(sal);
	         session.update(employee);
	         tx.commit();
	         r="Successfully Updated";
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
return r;
	}
	public List<?> DisplayEmployeeByID(int id)
	{
		Session session = sf.openSession();
	      Transaction tx = null;
	      List<?> employees = null;
	      try {
	         tx = session.beginTransaction();
	         Query q=session.createQuery("FROM Employee WHERE id=:id");
	         q.setParameter("id", id);
	         employees = q.getResultList(); 
				/*
				 * for (java.util.Iterator<?> iterator = employees.iterator();
				 * iterator.hasNext();){ Employee employee = (Employee)iterator.next();
				 * System.out.println("EmployeeID: " + employee.getId());
				 * System.out.println(" Name: " + employee.getName());
				 * System.out.println("  Gender: " + employee.getGender());
				 * System.out.println("  Designation: " + employee.getDesignation());
				 * System.out.println("  City: " + employee.getCity());
				 * System.out.println("  Email: " + employee.getEmail());
				 * System.out.println("  Salary: " + employee.getSalary());
				 * System.out.println("  Phone: " + employee.getPhone()); }
				 */
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return employees;
	}
	@SuppressWarnings("unchecked")
	public ArrayList<Employee> DisplayAllEmployee() {
		Session session = sf.openSession();
	      Transaction tx = null;
	      ArrayList<Employee> employees = null;
	      try {
	         tx = session.beginTransaction();
	         employees =(ArrayList<Employee>) session.createQuery("FROM Employee").getResultList(); 
	 			/*
				 * for (java.util.Iterator<?> iterator = employees.iterator();
				 * iterator.hasNext();){ Employee employee = (Employee)iterator.next();
				 * System.out.println("EmployeeID: " + employee.getId());
				 * System.out.println(" Name: " + employee.getName());
				 * System.out.println("  Gender: " + employee.getGender());
				 * System.out.println("  Designation: " + employee.getDesignation());
				 * System.out.println("  City: " + employee.getCity());
				 * System.out.println("  Email: " + employee.getEmail());
				 * System.out.println("  Salary: " + employee.getSalary());
				 * System.out.println("  Phone: " + employee.getPhone()); }
				 */
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return employees;
	}
}
