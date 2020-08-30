package service;

import dao.*;

import java.util.Scanner;

import bean.*;

public class ObjectsMainAdmin {

	public static void main(String[] args) {
		//Object1 class operations
		  Objects1DAO dao=new Objects1DAO();
		 
		  //Insert into table
		  
		 // Objects1 o1=new Objects1("Rose","Red",10); String
		  //result=dao.InsertObjects1(o1); System.out.println(result); Objects1 o2=new
		  //Objects1("Carnation","White",15); result=dao.InsertObjects1(o2);
		  //System.out.println(result);
		  
		  //System.out.println(dao.getObjects1(2).toString());
		 
		
		 //Object2 class operations
		  //Objects2DAO dao1=new Objects2DAO(); 
		  //Objects2 o=new Objects2("Rose","Red",10);
		  //o.setFlowerID(3); 
		  //System.out.println(dao1.DeleteObjects2(o));
		 
		
		//Object3 class operations
		Objects3DAO dao1=new Objects3DAO();
		
		Objects3 o2=new Objects3("Rose","Red",10); 
		String result=dao1.InsertObjects3(o2); 
		System.out.println(result);
		
		Objects3 o3=new  Objects3("Carnation","White",15); 
		result=dao1.InsertObjects3(o3);
		System.out.println(result);
		  
		  Scanner in=new Scanner(System.in);
		  System.out.println("Enter flower ID:");
		  int id=in.nextInt();
		  System.out.println("Enter flower price to update:");
		  double p=in.nextDouble();
		  
		Objects3 o1=new Objects3();
		o1.setFlowerID(id);
		  
		  String fn=dao1.getObjects3(id).getFlowerName();
		  String fc=dao1.getObjects3(id).getColor();
		  
		Objects3 o=new Objects3(fn,fc,p);
		o.setFlowerID(id);
		System.out.println(dao1.UpdateObjects3(o));

		  in.close();
	
		
	}

}
