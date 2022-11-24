package com.dailycodebuffer.sprinboot.tutorial.repository;

import com.dailycodebuffer.sprinboot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}