package com.wipro.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Studentid;
	private String StudentName;
	private String Address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String address) {
		super();
		Studentid = studentId;
		StudentName = studentName;
		Address = address;
	}
	public int getStudentId() {
		return Studentid;
	}
	public void setStudentId(int studentId) {
		Studentid = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + Studentid + ", StudentName=" + StudentName + ", Address=" + Address + "]";
	}
}
