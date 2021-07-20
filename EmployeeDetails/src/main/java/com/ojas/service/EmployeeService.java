package com.ojas.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.dao.EmployeeDao;
import com.ojas.exception.EmpIdNotFoundException;
import com.ojas.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeerepo;
	
	public Employee saveEmp(Employee emp) {
		return employeerepo.save(emp);
	}
	
	public Iterable<Employee> findAll(){
		return employeerepo.findAll();
	}
	
	public String deleteEmployee(Integer eid) {
		employeerepo.deleteById(eid);
		return eid + " " + "deleted";
	}


	public Employee findById(Integer eid) {
		return employeerepo.findById(eid).orElse(new Employee());
	}
	
	
	
	

}
