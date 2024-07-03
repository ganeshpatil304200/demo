package com.demo.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.demo.model.Employee;

public interface EmployeeService {
	Employee save(Employee e);
	int deleteByEid(int id);
	Employee findByEname(String ename);
	List<Employee> findAll();
	List<Employee> getByEdesignation(String edesignation);
	  List<Employee> findByEdesignationAndEcompany(String edesignation,String ecompany);
	  Employee findByEid(int eid);
	  Employee m1(int eid);
	  Employee m2(int eid,String ename);
	  
	  Employee m3( int eid, String ename);
	  
	  
	  
}
