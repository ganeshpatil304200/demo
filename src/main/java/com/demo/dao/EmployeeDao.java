package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer>{
   int deleteByEid(int id);
   
  //jby using JPQL
   Employee findByEname(String ename);
  List<Employee> getByEdesignation(String edesignation);
  List<Employee> findByEdesignationAndEcompany(String edesignation,String ecompany);
  Employee findByEname
  Employee findByEid(int eid);
  
  @Query(value = "from Employee where eid=:a")
  Employee m1(@Param("a") int eid);
  
  
  // by using hql
  @Query(value = "from Employee where eid=:a and ename=:b")
  Employee m2(@Param("a") int eid,@Param("b") String ename);
 
  //by using sql
  @Query(value = "select eid,ename,edesignation,ecompany,esalary from employee where eid=:a and ename=:b",nativeQuery = true)
  Employee m3(@Param("a") int eid,@Param("b") String ename);
  
  Employee m4(int eid,String ename);
}
