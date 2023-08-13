package com.dailycodebuffer.Springboottutorial.repository;

import com.dailycodebuffer.Springboottutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.function.Supplier;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentName(String s);
    public Department findByDepartmentNameIgnoreCase(String s);

}
