package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.EmployeeDemo;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	
	@PostMapping("/addDetails")
	public EmployeeDemo addInfo(@RequestBody EmployeeDemo emp)
	{
		return empService.saveDetails(emp);
	}
	@GetMapping("showDetails")
	public List<EmployeeDemo> fetchDetails()
	{
		return empService.getDetails();
	}
	
	
}
