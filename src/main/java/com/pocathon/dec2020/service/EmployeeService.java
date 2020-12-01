package com.pocathon.dec2020.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pocathon.dec2020.bean.EmployeeDailyUpdateRequest;
import com.pocathon.dec2020.dao.EmployeeDAO;
import com.pocathon.dec2020.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO employeeDAO;
	
	public Integer createNewEmployee(Employee employee) {
		return employeeDAO.save(employee).getEmployeeId();
	}
	
	public Employee getEmployeeByName(String employeeName) {
		return employeeDAO.findByEmployeeName(employeeName);
	}
	
	public Boolean updateDailyEmployeeDetails(Integer employeeId, EmployeeDailyUpdateRequest updateRequest) {
		Employee employee = employeeDAO.findById(employeeId).get();
		employee.setDate(new Date());
		employee.setTemperature(updateRequest.getTemperature());
		employee.setOxygenLevel(updateRequest.getOxygenLevel());
		employeeDAO.save(employee);
		return true;
	}
	
	public List<Employee> getAllEmployees() {
		return employeeDAO.findAll();
	}
}
