package com.abhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.entity.Department;
import com.abhi.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department getDepartmentById(Long departmentId) {
		
		return departmentRepository.findByDepartmentId(departmentId);
	}

	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}
}
