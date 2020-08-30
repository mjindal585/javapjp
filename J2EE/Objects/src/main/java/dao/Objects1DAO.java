package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import bean.Objects1;

public class Objects1DAO {
	SessionFactory sf;
	public Objects1DAO() {
		Configuration cfg=new Configuration().configure();
		sf=cfg.buildSessionFactory();
	}
	
	public String InsertObjects1(Objects1 o)
	{
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.save(o);
		tr.commit();
		ses.close();
		return "Success";

	}
	public String UpdateObjects1(Objects1 o)
	{
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.update(o);
		tr.commit();
		ses.close();
		return "Sucess";
	}
	
	public String DeleteObjects1(Objects1 o)
	{
		Session ses = sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.delete(o);
		tr.commit();
		ses.close();
		return "Sucess";
	}
	@SuppressWarnings("deprecation")
	public Objects1 getObjects1(int FlowerID) {
		Session ses =sf.openSession();
		Objects1 o=new Objects1();
		o=ses.get(Objects1.class, new Integer( FlowerID));
		ses.close();
		//System.out.println("Records::"+o);
		return o;
	}
	@SuppressWarnings("deprecation")
	public Objects1 loadObjects1(int FlowerID) {
		Session ses=sf.openSession();
		Objects1 o=new Objects1();
		o=ses.load(Objects1.class,new Integer( FlowerID));
		ses.close();
		//System.out.println("Records::"+o);
		return o;
	}

}
