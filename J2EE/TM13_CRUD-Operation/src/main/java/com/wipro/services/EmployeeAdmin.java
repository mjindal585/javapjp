package com.wipro.services;

import java.util.Scanner;

import com.wipro.DAO.EmployeeDAO;
import com.wipro.bean.Employee;

public class EmployeeAdmin {
	static Scanner in=new Scanner(System.in);
	static EmployeeDAO dao=new EmployeeDAO();
	public static void Add() {
		System.out.println("Enter name:");
		String name=in.next();
		System.out.println("Enter Designation:");
		String desg=in.next();
		System.out.println("Enter Gender:");
		String gender=in.next();
		System.out.println("Enter city:");
		String city=in.next();
		System.out.println("Enter Email:");
		String email=in.next();
		System.out.println("Enter phone:");
		long phone=in.nextLong();
		System.out.println("Enter Salary:");
		double sal=in.nextDouble();
		
		Employee e=new Employee(name,gender,city,desg,email,sal,phone);
		System.out.println(dao.AddEmployee(e));
	}
	public static void Delete() {
		System.out.println("Enter employee id to delete:");
		int id=in.nextInt();
		System.out.println(dao.DeleteEmployee(id));
	}
	public static void Modify() {
		System.out.println("Enter the Employee Id to Modify:");
		int id=in.nextInt();
		dao.DisplayEmployeeByID(id);
		System.out.println("Enter the details to modify:");
		System.out.println("Enter name:");
		String name=in.next();
		System.out.println("Enter Designation:");
		String desg=in.next();
		System.out.println("Enter Gender:");
		String gender=in.next();
		System.out.println("Enter city:");
		String city=in.next();
		System.out.println("Enter Email:");
		String email=in.next();
		System.out.println("Enter phone:");
		long phone=in.nextLong();
		System.out.println("Enter Salary:");
		double sal=in.nextDouble();
		dao.ModifyEmployee(id, name, gender, city, desg, email,sal, phone);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter a choice:");
		System.out.println("1.ADD Employee\n2.Delete Employee\n3.Modify Employee\n4.Display one Employee\n5.Display All Employee\n");
		int n=in.nextInt();
		switch(n)
		{
		case 1: Add();
		break;
		case 2: Delete();
		break;
		case 3:Modify();
		break;
		case 4:DisplayOne();
		break;
		case 5:DisplayAll();
		break;
		default:System.out.println("Invalid Input");
		break;
		}
		
		
		in.close();
	}
	private static void DisplayAll() {
		// TODO Auto-generated method stub
		dao.DisplayAllEmployee();
	}
	private static void DisplayOne() {
		// TODO Auto-generated method stub
		System.out.println("Enter employee id to delete:");
		int id=in.nextInt();
		dao.DisplayEmployeeByID(id);
	}

}
