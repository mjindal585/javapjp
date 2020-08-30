package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Pro4;

public class Pro4service {
public static void main(String [] args) {
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tr=ses.beginTransaction();
	
	ses.save(new Pro4("Milk",28.90));
	ses.save(new Pro4("Pen",25));
	ses.save(new Pro4("5-Star",10.90));
	tr.commit();
	System.out.println("Record inserted!!");
	System.out.println();
	ses.close();
}
}
