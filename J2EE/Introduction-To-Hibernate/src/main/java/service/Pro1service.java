package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Pro1;

public class Pro1service {

	
	public static void main(String [] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tr= ses.beginTransaction();
		
		Pro1 e = new Pro1(104,"Madan",10050);
		
		
		
		ses.save(e);
		
		tr.commit();
		
		
		System.out.println("Record Inserted!!");
		System.out.println(e);
		ses.close();
	}
}
