package com.dailycodebuffer.sprinboot.tutorial.service;

import com.dailycodebuffer.sprinboot.tutorial.entity.Department;
import com.dailycodebuffer.sprinboot.tutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    // TO-DO 2:26:15
}
