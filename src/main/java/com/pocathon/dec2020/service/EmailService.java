package com.pocathon.dec2020.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.mail.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
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
	
	@Autowired
    private JavaMailSender emailSender;
	
	private static final String SUBJECT_PREFIX = "Employee Health Alert (Immediate) for Vaccine: ";
	private static final String BODY_PREFIX = "Hi, \nDoctor's opinion or possible vaccination needed for AMT-Nifais's employee: ";
	private static final String BODY_SUFFIX = "\n \nPlease take necessary actions.";
	private static final String ADMIN_EMAIL = "pankajbisht27@gmail.com";
	
	public void prepareAndSendEmail() {
		List<Vaccine> vaccines = vaccineService.getAllVaccines();
		List<Employee> employees = employeeService.getAllEmployees();
		List<EmailAttributes> emailList = new ArrayList<EmailAttributes>();
		for (Vaccine vaccine : vaccines) {
			List<Employee> eligibleEmployees = employees.stream().filter(e -> Integer.valueOf(e.getTemperature()) > Integer.valueOf(vaccine.getThresholdTemperature()) && Integer.valueOf(e.getOxygenLevel()) < Integer.valueOf(vaccine.getThresholdOxygenLevel()))
					.collect(Collectors.toList());
			String subject = SUBJECT_PREFIX + vaccine.getVaccineName();
			eligibleEmployees.forEach(ee -> emailList.add(new EmailAttributes(ee.getManagerEmail(), subject, BODY_PREFIX + ee.getEmployeeName() + BODY_SUFFIX, ee.getEmployeeEmail())));
		}
		sendEmail(emailList);
	}
	
	//Todo
	public void sendEmail(List<EmailAttributes> list) {
		for(EmailAttributes ea : list) {
			SimpleMailMessage msg = new SimpleMailMessage();
			msg.setFrom(ADMIN_EMAIL);
			msg.setTo(ea.getMailTo());
			msg.setCc(ea.getCc());
			msg.setSubject(ea.getSubject());
			msg.setText(ea.getBody());
			emailSender.send(msg);
		}
	}

}
