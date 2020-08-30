package service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import bean.SpringBasics1;
import bean.SpringBasics2;

@SuppressWarnings({ "unused", "deprecation" })
public class SpringBasicsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  Resource res=new FileSystemResource("src/main/resources/beans.xml");
		  BeanFactory bf=new XmlBeanFactory(res); 
		  SpringBasics1 sb1 = bf.getBean(SpringBasics1.class); 
		  System.out.println(sb1.toString());
		  
		  
		  
		  @SuppressWarnings("resource")
		ApplicationContext cxt=new ClassPathXmlApplicationContext("beans.xml");
		  SpringBasics1 sb11=cxt.getBean(SpringBasics1.class);
		  System.out.println(sb11.toString());
		*/ 
		
		  ApplicationContext cxt=new ClassPathXmlApplicationContext("beans.xml"); 
		  SpringBasics2 sb2=cxt.getBean(SpringBasics2.class); 
		  System.out.println(sb2.toString());
		 
		
	}

}
