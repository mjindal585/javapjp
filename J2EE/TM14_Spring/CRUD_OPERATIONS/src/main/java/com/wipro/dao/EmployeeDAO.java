package com.wipro.dao;

import java.util.List;

import com.wipro.bean.Employee;

public interface EmployeeDAO {
	
	public void addPerson(Employee p);
	public void updatePerson(Employee p);
	public List<Employee> listPersons();
	public List<Employee> getPersonById(int id);
	public void removePerson(int id);
	public boolean getCustomer(String cid,String pswd);

}
