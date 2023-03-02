package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.EmployeeDemo;

public interface EmployeeRepo extends JpaRepository<EmployeeDemo,Integer> {

}
