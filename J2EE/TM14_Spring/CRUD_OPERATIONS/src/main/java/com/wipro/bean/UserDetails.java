package com.wipro.bean;

import javax.persistence.*;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
 

@Entity
@Table(name="UserDetails")
public class UserDetails {
	
	@NotEmpty
	@Pattern(regexp="[A-Za-z][0-9]{4}",message="The Employee ID must have 1 alphabet followed by 4 digits.")
	@Id
	private String EmployeeID;
	
	private String Username;
	
	@NotEmpty
	@Size(min=6,max=6,message="Enter the Password with Exactly 6 Characters.")
	private String Password;
	
	@NotEmpty
	@Email(message="Enter the correct format.")
	private String Email;

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetails(String employeeID, String username, String password, String email) {
		super();
		EmployeeID = employeeID;
		Username = username;
		Password = password;
		Email = email;
	}

	public String getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "UserDetails [EmployeeID=" + EmployeeID + ", Username=" + Username + ", Password=" + Password
				+ ", Email=" + Email + "]";
	}
	
}
