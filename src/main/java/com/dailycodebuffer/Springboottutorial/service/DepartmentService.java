package com.dailycodebuffer.Springboottutorial.service;

import com.dailycodebuffer.Springboottutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);
    public List fetchData();


    public Department fetchDepartmentById(Integer id);

    public void deleteDepartmentById(Integer id);
    public Department updateDepartment(Long id, Department department);

    Department fetchDepartmentByName(String id);
}
