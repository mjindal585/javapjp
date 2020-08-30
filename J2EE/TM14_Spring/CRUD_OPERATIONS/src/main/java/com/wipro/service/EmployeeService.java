package com.wipro.service;

import java.util.List;

import com.wipro.bean.Employee;

public interface EmployeeService {
	public void addPerson(Employee p);
	public void updatePerson(Employee p);
	public List<Employee> listPersons();
	public List<Employee> getPersonById(int eid);
	public void removePerson(int eid);
	public boolean getCustomer(String cid,String pswd);

}
