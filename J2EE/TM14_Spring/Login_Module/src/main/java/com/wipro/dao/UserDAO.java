package com.wipro.dao;

import java.util.List;


import com.wipro.bean.UserDetails;

public interface UserDAO {
	
	public void addPerson(UserDetails p);
	public void updatePerson(UserDetails p);
	public List<UserDetails> listPersons();
	public UserDetails getPersonById(String id);
	public void removePerson(String id);
	public boolean getCustomer(String cid,String pswd);

}
