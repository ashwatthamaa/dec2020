package com.pocathon.dec2020.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pocathon.dec2020.bean.EmployeeBean;
import com.pocathon.dec2020.bean.EmployeeDailyUpdateRequest;
import com.pocathon.dec2020.model.Employee;
import com.pocathon.dec2020.service.EmployeeService;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/create-employee", method=RequestMethod.POST) 
	public ResponseEntity<?> createEmployee(@RequestBody EmployeeBean bean) {
		Integer employeeId = employeeService.createNewEmployee(EmployeeBean.map(bean));
		return new ResponseEntity<String>(employeeId.toString(), HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/get-employee/{employeeName}", method=RequestMethod.GET)
	public ResponseEntity<?> getEmployee(@PathVariable String employeeName) {
		return new ResponseEntity<Employee>(employeeService.getEmployeeByName(employeeName), HttpStatus.OK);
	}

	@RequestMapping(value="/update-employee/{employeeId}", method=RequestMethod.PUT)
	public ResponseEntity<?> updateEmployee(@PathVariable Integer employeeId, @RequestBody EmployeeDailyUpdateRequest updateRequest) {
		return new ResponseEntity<Boolean>(employeeService.updateDailyEmployeeDetails(employeeId, updateRequest), HttpStatus.OK);
	}
}
