package main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.*;


@SuppressWarnings("unused")
public class SpringIOCMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * SpringIOC1
		ApplicationContext cxt=new ClassPathXmlApplicationContext("beans.xml");
		SpringIOC1 s1=cxt.getBean(SpringIOC1.class);
		System.out.println(s1.toString());
		*/
		
		/*
		 * SpringIOC2 
		 * ApplicationContext cxt=new
		 * ClassPathXmlApplicationContext("beans.xml"); SpringIOC2
		 * s2=cxt.getBean(SpringIOC2.class); System.out.println(s2.toString());
		 */
		
		/*
		 * SpringIOC3 
		 * ApplicationContext cxt=new
		 * ClassPathXmlApplicationContext("beans.xml"); SpringIOC3
		 * s3=cxt.getBean(SpringIOC3.class); System.out.println(s3.toString());
		 */	
		
		/*
		 * SpringIOC4
		 * ApplicationContext cxt=new ClassPathXmlApplicationContext("beans.xml");
		 * SpringIOC4 s4=cxt.getBean(SpringIOC4.class); 
		 * System.out.println(s4);
		 */
		
		
		 List<String> cn = null;
		  @SuppressWarnings("resource")
		ApplicationContext cxt=new ClassPathXmlApplicationContext("beans.xml");
		  SpringIOC5 s5=cxt.getBean(SpringIOC5.class); 
		  System.out.println(s5);

		  System.out.println(s5.getCountry());
		
		
	}

}
