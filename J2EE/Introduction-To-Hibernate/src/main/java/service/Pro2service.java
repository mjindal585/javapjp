package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Pro2;

public class Pro2service {
public static void main(String [] args) {
	Configuration cfg=new Configuration().configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tr=ses.beginTransaction();
	Pro2 f=new Pro2("001","Rose","Red",10);
	ses.save(f);
	tr.commit();
	System.out.println("Record Inserted");
	System.out.println(f);
	ses.close();
}
}
