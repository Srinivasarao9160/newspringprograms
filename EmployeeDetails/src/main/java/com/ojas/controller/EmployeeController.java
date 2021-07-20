package com.ojas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ojas.model.Employee;
import com.ojas.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	public EmployeeService empService;
	
	@RequestMapping("/")
	public String addEmployee(ModelMap map) {
		Employee employee= new Employee();
		map.addAttribute("emps",employee);
		return "addemp";
	}
	@RequestMapping("/saveemployee")
	public String addEmployees(@ModelAttribute Employee emp, ModelMap map) {
		empService.saveEmp(emp);
		map.addAttribute("einfo", emp);
		return "empinfo";
	}
	@GetMapping("/allemps")
	public String showEmps(ModelMap map) {
		Iterable<Employee> employe = empService.findAll();
		map.addAttribute("emplist",employe);
		return "getemp";
	}
		
	
	//  delete
	@GetMapping("/deleteemp")
	public String deleteEmp(@RequestParam("eid") Integer eid){
	empService.deleteEmployee(eid);
	return "redirect:/allemps";
	}
	
	@GetMapping("/edit/{eid}")
    public String showUpdateForm(@PathVariable Integer eid, Model model) {
        Employee e = empService.findById(eid);
        model.addAttribute("emmp", e);
        return "update-emp";
    }
    @PostMapping("/update/{eid}")
    public String updateUser(@PathVariable Integer eid, Employee emp, BindingResult result, Model model) {
        if (result.hasErrors()) {
            emp.setEid(eid);
            return "update-emp";
        }
        empService.saveEmp(emp);
        return "redirect:/allemps";
    }
	

}
