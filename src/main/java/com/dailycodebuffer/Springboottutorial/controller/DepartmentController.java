package com.dailycodebuffer.Springboottutorial.controller;

import com.dailycodebuffer.Springboottutorial.entity.Department;
import com.dailycodebuffer.Springboottutorial.repository.DepartmentRepository;
import com.dailycodebuffer.Springboottutorial.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class DepartmentController {
    Department department=new Department();
    @Autowired
    DepartmentService departmentService;
    @PostMapping("/")
    public Department savingDate(@Valid @RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/")
    public List fetchData(){
        return departmentService.fetchData();
    }
    @GetMapping("/{id}")
    public Department fetchDepartmentById(@PathVariable Integer id){
        return departmentService.fetchDepartmentById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteDepartmentByid(@PathVariable Integer id){
        departmentService.deleteDepartmentById(id);
        return "Deleted successfully";
    }
    @PutMapping("/{id}")
    public Department updateDepartment(@PathVariable int id, @RequestBody Department department){
        return departmentService.updateDepartment((long) id, department);
    }
    @GetMapping("/name/{id}")
    public Department fetchingDepartmentByName(@PathVariable String id){

        return  departmentService.fetchDepartmentByName(id);

    }
}
