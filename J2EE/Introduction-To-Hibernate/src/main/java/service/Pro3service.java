package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Pro3;

public class Pro3service {
public static void main(String [] args) {
	
	Configuration cfg=new Configuration().configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction tr=ses.beginTransaction();
	
	Pro3 e=new Pro3("emp1","PE",100000.07); 
	ses.save(e);
	 
	tr.commit();
	
	
	//System.out.println("Record Deleted!!");
	System.out.println("Record Inserted!!");
	System.out.println(e);
	
	e=new Pro3("emp2","PE",100000.07); 
	ses.save(e);
	 
	tr.commit();
	//System.out.println("Record Deleted!!");
		System.out.println("Record Inserted!!");
		System.out.println(e);
		
	e=new Pro3("emp3","PE",100000.07); 
	ses.persist(e);
	 
	tr.commit();
	
	//System.out.println("Record Deleted!!");
		System.out.println("Record Inserted!!");
		System.out.println(e);
		
		e=new Pro3("emp4","PE",100000.07); 
		ses.save(e);
		 
		tr.commit();
		
		//System.out.println("Record Deleted!!");
			System.out.println("Record Inserted!!");
			System.out.println(e);
			
			e=new Pro3("emp5","PE",100000.07); 
			ses.save(e);
			 
			tr.commit();
			
			//System.out.println("Record Deleted!!");
				System.out.println("Record Inserted!!");
				System.out.println(e);
		
	ses.close();

}
}
