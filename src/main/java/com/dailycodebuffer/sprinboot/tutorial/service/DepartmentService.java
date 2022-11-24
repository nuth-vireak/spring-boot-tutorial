package com.dailycodebuffer.sprinboot.tutorial.service;

import com.dailycodebuffer.sprinboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId);
}
