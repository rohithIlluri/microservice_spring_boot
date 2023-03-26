package com.dailycode.Springboot.repository;


import com.dailycode.Springboot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    public  Department findByDepartmentName(String departmentName);

    public  Department findByDepartmentNameIgnoreCase(String departmentName);

}
