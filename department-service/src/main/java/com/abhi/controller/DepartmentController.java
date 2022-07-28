package com.abhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.entity.Department;
import com.abhi.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/")
	public String test() {
		
		return "Abhijeet Gupta!!!";
	}
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		
		return departmentService.saveDepartment(department);
		
	}
	
	@GetMapping("/{id}")
	public Department getDepartmentById(@PathVariable("id") Long departmentId) {
		
		return departmentService.getDepartmentById(departmentId);
	}

}
