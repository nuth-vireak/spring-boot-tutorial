package com.dailycodebuffer.sprinboot.tutorial.service;

import com.dailycodebuffer.sprinboot.tutorial.entity.Department;
import com.dailycodebuffer.sprinboot.tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartmentById(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
