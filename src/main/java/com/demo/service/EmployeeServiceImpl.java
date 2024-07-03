package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao ed;

	@Override
	public Employee save(Employee e) {
		
		return ed.save(e);
	}

	@Override
	public int deleteByEid(int id) {
		return ed.deleteByEid(id);
	}

	@Override
	public Employee findByEname(String ename) {
		return ed.findByEname(ename);
	}

	@Override
	public List<Employee> findAll(){
		return ed.findAll();
	}

	@Override
	public List<Employee> getByEdesignation(String edesignation) {
		return ed.getByEdesignation(edesignation);
	}

	@Override
	public List<Employee> findByEdesignationAndEcompany(String edesignation, String ecompany) {
		return ed.findByEdesignationAndEcompany(edesignation, ecompany);
	}

	@Override
	public Employee findByEid(int eid) {
		return ed.findByEid(eid);
	}

	@Override
	public Employee m1(int eid) {
		return ed.m1(eid);
	}

	@Override
	public Employee m2(int eid, String ename) {
		return ed.m2(eid, ename);
	}

	@Override
	public Employee m3(int eid, String ename) {
		return ed.m3(eid, ename);
	}

	
	}

	

