package com.pocathon.dec2020.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pocathon.dec2020.bean.EmailAttributes;
import com.pocathon.dec2020.model.Employee;
import com.pocathon.dec2020.model.Vaccine;

@Service
public class EmailService {
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	VaccineService vaccineService;
	
	private static final String SUBJECT_PREFIX = "Alert for vaccine: ";
	private static final String BODY_PREFIX = "Doctor's opinion or possible vaccination needed for the employee: ";
	private static final String ADMIN_EMAIL = "pankajbisht27@gmail.com";
	
	public void prepareAndSendEmail() {
		List<Vaccine> vaccines = vaccineService.getAllVaccines();
		List<Employee> employees = employeeService.getAllEmployees();
		List<EmailAttributes> emailList = new ArrayList<EmailAttributes>();
		for (Vaccine vaccine : vaccines) {
			List<Employee> eligibleEmployees = employees.stream().filter(e -> Integer.valueOf(e.getTemperature()) > Integer.valueOf(vaccine.getThresholdTemperature()) && Integer.valueOf(e.getOxygenLevel()) < Integer.valueOf(vaccine.getThresholdOxygenLevel()))
					.collect(Collectors.toList());
			String subject = SUBJECT_PREFIX + vaccine.getVaccineName();
			eligibleEmployees.forEach(ee -> emailList.add(new EmailAttributes(ee.getManagerEmail(), subject, BODY_PREFIX + ee.getEmployeeName(), ee.getEmployeeEmail())));
		}
		sendEmail(emailList);
	}
	
	//Todo
	public void sendEmail(List<EmailAttributes> list) {
	}

}