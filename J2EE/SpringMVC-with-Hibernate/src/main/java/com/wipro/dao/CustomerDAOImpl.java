package com.wipro.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.wipro.bean.Coupon;
import com.wipro.bean.Customer;

@SuppressWarnings({ "deprecation", "unused" })
@Repository
@Transactional
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	SessionFactory sf;
	
	
	@SuppressWarnings({ "unchecked" })
	public double getCustomer(String CustomerID,String pswd) {
		
		String password=null;
		Session s=sf.openSession();
		String hql="SELECT Password FROM Customer WHERE CustomerID=:CustomerID";
		Query<Customer> q=s.createQuery(hql);
		q.setParameter("CustomerID", CustomerID);
		hql="SELECT Balance FROM Customer WHERE CustomerID=:CustomerID";
		Query<Customer> q1=s.createQuery(hql);
		q1.setParameter("CustomerID", CustomerID);
		List<Customer> l1=q.getResultList();
		List<Customer> l2=q1.getResultList();
		System.out.println(l1.size());
		if(l1!=null && l1.size()>0)
		{
			Object obj1=l1.get(0);
			Object obj2=l2.get(0);
			if(pswd.equals(obj1))
				return (double)obj2;
		}
		return 0;
		
	}
	
	
	@SuppressWarnings("unchecked")
	public float getCoupon(String CouponCode) {
		
		Session s=sf.openSession();
		String hql="SELECT OfferPercentage FROM Coupon WHERE CouponCode=:CouponCode";
		Query<Customer> q=s.createQuery(hql);
		q.setParameter("CouponCode", CouponCode);
		List<Customer> l=q.list();
		if(l!=null && l.size()>0)
		{
			Object obj=l.get(0);
			return (float)obj;
		}

		return 0;
		
		
	}

	@Override
	public Customer UpdateCustomer(Customer c) {
	    sf.getCurrentSession().update(c);
        return c;
	}


	@Override
	public void AddCustomer(Customer c) {
		sf.getCurrentSession().saveOrUpdate(c);
	}
	
	@Override
	public void AddCoupon(Coupon c) {
		sf.getCurrentSession().saveOrUpdate(c);
	}

}
