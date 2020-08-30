package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Objects2;

public class Objects2DAO {
	SessionFactory sf;
	public Objects2DAO() {
		Configuration cfg=new Configuration().configure();
		sf=cfg.buildSessionFactory();
	}
	
	public String InsertObjects2(Objects2 o)
	{
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.save(o);
		tr.commit();
		ses.close();
		return "Success";

	}
	public String UpdateObjects2(Objects2 o)
	{
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.update(o);
		tr.commit();
		ses.close();
		return "Success";
	}
	
	public String DeleteObjects2(Objects2 o)
	{
		Session ses = sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.delete(o);
		tr.commit();
		ses.close();
		return "Success";
	}
	@SuppressWarnings("deprecation")
	public Objects2 getObjects2(int FlowerID) {
		Session ses =sf.openSession();
		Objects2 o=new Objects2();
		o=ses.get(Objects2.class, new Integer( FlowerID));
		ses.close();
		//System.out.println("Records::"+o);
		return o;
	}
	@SuppressWarnings("deprecation")
	public Objects2 loadObjects2(int FlowerID) {
		Session ses=sf.openSession();
		Objects2 o=new Objects2();
		o=ses.load(Objects2.class,new Integer( FlowerID));
		ses.close();
		//System.out.println("Records::"+o);
		return o;
	}

}
