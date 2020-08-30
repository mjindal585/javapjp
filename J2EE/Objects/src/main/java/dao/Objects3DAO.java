package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Objects3;

public class Objects3DAO {
	SessionFactory sf;
	public Objects3DAO() {
		Configuration cfg=new Configuration().configure();
		sf=cfg.buildSessionFactory();
	}
	
	public String InsertObjects3(Objects3 o)
	{
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.save(o);
		tr.commit();
		ses.close();
		return "Success";

	}
	public String UpdateObjects3(Objects3 o)
	{
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.update(o);
		tr.commit();
		ses.close();
		return "Success";
	}
	
	public String DeleteObjects3(Objects3 o)
	{
		Session ses = sf.openSession();
		Transaction tr=ses.beginTransaction();
		ses.delete(o);
		tr.commit();
		ses.close();
		return "Success";
	}
	public Objects3 getObjects3(int FlowerID) {
		Session ses =sf.openSession();
		Objects3 o=new Objects3();
		o=ses.get(Objects3.class, new Integer( FlowerID));
		ses.close();
		//System.out.println("Records::"+o);
		return o;
	}
	public Objects3 loadObjects3(int FlowerID) {
		Session ses=sf.openSession();
		Objects3 o=new Objects3();
		o=ses.load(Objects3.class,new Integer( FlowerID));
		ses.close();
		//System.out.println("Records::"+o);
		return o;
	}
}
