package com.wipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.bean.Employee;
import com.wipro.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO dao;

	public EmployeeDAO getDao() {
		return dao;
	}

	 @Autowired
	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}
	 	
	 	@Override
		@Transactional
		public void addPerson(Employee p) {
			this.dao.addPerson(p);
		}

		@Override
		@Transactional
		public void updatePerson(Employee p) {
			this.dao.updatePerson(p);
		}

		@Override
		@Transactional
		public List<Employee> listPersons() {
			return this.dao.listPersons();
		}

		@Override
		@Transactional
		public List<Employee> getPersonById(int id) {
			return this.dao.getPersonById(id);
		}

		@Override
		@Transactional
		public void removePerson(int id) {
			this.dao.removePerson(id);
		}

		@Override
		public boolean getCustomer(String cid, String pswd) {
			return this.dao.getCustomer(cid, pswd);
		}

	}