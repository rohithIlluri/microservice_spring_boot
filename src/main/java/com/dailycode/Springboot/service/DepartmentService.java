package com.dailycode.Springboot.service;

import com.dailycode.Springboot.entity.Department;
import com.dailycode.Springboot.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public  Department fetchDepartmentByName(String departmentName);


    public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

   public  Department updateDepartment(Long departmentId, Department department);
}
