package com.dailycodebuffer.Springboottutorial.service;

import com.dailycodebuffer.Springboottutorial.entity.Department;
import com.dailycodebuffer.Springboottutorial.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class DepartmenServiceImpl implements DepartmentService{
    static List<Department> arrayList;
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List fetchData() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Integer id) {
        Long newId= Long.valueOf(id);

       return departmentRepository.findById(newId).get();
    }

    @Override
    public void deleteDepartmentById(Integer id) {
        Long newId=Long.valueOf(id);
    departmentRepository.deleteById(newId);
    }

    @Override
    public Department updateDepartment(Long id, Department department) {

    Department departmentFromDatabase= departmentRepository.findById(id).get();
    departmentFromDatabase.setDepartmentName(department.getDepartmentName());
    departmentFromDatabase.setDepartmentCode(department.getDepartmentCode());
    departmentFromDatabase.setDepartmentAddress(department.getDepartmentAddress());


        return departmentRepository.save(departmentFromDatabase);

    }

    @Override
    public Department fetchDepartmentByName(String id) {
        return departmentRepository.findByDepartmentNameIgnoreCase(id);
    }
}



