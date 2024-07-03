/*
package com.demo;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@SpringBootApplication
public class Sbhibernate1Application {

	public static void main(String[] args) {
	ApplicationContext context =
	SpringApplication.run(Sbhibernate1Application.class, args);
	EmployeeService es = context.getBean(EmployeeService.class);
	/*
	Employee e = new Employee();
	e.setEname("yogesh katole");
	e.setEcompany("IBM");
	e.setEdesignation("sql developer");
	e.setEsalary(450000);
	System.out.println(es.save(e));
	*/
	 //System.out.println(es.deleteByEid(2));
	//System.out.println(es.findByEname("kishan patil"));
	/*   
	String designation[] = {"java developer","ui developer","software engineer",
			"software tester","software trainee","sql developer","hr",
			"projrct manager","data anlyst","business analyst"};
	
	String company[] = {"tcs","cts","tech mahindra","infosys","persistence","wipro",
			"capgemini","mahindra","acceture","xoriant","ptc","pubmatic","cybage"};
	for(int i=0;i<1000;i++)
	{
		Employee e = new Employee();
		StringBuilder sb = new StringBuilder();
		for(int j=1;j<=15;j++)
			sb.append((char)(new Random().nextInt(26)+65));
			e.setEname(sb.toString());
			e.setEcompany(company[new Random().nextInt(company.length)]);
			e.setEdesignation(designation[new Random().nextInt(designation.length)]);
			e.setEsalary(new Random().nextDouble()*1000000);
			System.out.println(es.save(e));
			}
			*/
		
		
	//es.findAll().forEach(e->System.out.println(e));
	//es.getByEdesignation("java developer").forEach(e->System.out.println(e));
	
	//es.findByEdesignationAndEcompany("java developer", "tcs").forEach(e->System.out.println(e));

	//System.out.println(es.findByEid(1200));
	//System.out.println(es.m1(2));
	
	//System.out.println(es.m2(20, "WRBKWIBQXDWYUHB"));
	
    // System.out.println(es.m3(19,"WRBKWIBQXDWYUHB"));
	//}
//}


