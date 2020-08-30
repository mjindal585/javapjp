package com.wipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.bean.UserDetails;
import com.wipro.dao.UserDAO;



@Service
public class UserServiceImpl implements UserService {
	
	UserDAO dao;
	public UserDAO getUserDAO() {
        return dao;
    }

    @Autowired
    public void setUserDAO(UserDAO userDAO) {
        this.dao = userDAO;
    }

	@Override
	@Transactional
	public void addPerson(UserDetails p) {
		this.dao.addPerson(p);
	}

	@Override
	@Transactional
	public void updatePerson(UserDetails p) {
		this.dao.updatePerson(p);
	}

	@Override
	@Transactional
	public List<UserDetails> listPersons() {
		return this.dao.listPersons();
	}

	@Override
	@Transactional
	public UserDetails getPersonById(String id) {
		return this.dao.getPersonById(id);
	}

	@Override
	@Transactional
	public void removePerson(String id) {
		this.dao.removePerson(id);
	}

	@Override
	public boolean getCustomer(String cid, String pswd) {
		return this.dao.getCustomer(cid, pswd);
	}

}