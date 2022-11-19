package com.dailycodebuffer.sprinboot.tutorial.service;

import com.dailycodebuffer.sprinboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();
}
