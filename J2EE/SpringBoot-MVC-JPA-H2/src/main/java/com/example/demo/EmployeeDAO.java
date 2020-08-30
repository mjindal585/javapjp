package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

}
