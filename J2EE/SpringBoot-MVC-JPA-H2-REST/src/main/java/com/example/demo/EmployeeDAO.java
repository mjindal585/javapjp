package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeDAO extends JpaRepository<Employee, Integer> {

	
}
