package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.EmployeeDemo;
import com.example.demo.Repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo empRepo;
	
	public EmployeeDemo saveDetails(EmployeeDemo em)
	{
		return empRepo.save(em);
	}

	public List<EmployeeDemo> getDetails()
	{
		return empRepo.findAll();
	}
}
