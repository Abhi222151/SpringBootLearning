package com.abhi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abhi.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

	Department findByDepartmentId(Long departmentId);

}
