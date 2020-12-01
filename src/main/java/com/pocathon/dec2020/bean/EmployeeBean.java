package com.pocathon.dec2020.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pocathon.dec2020.model.Employee;

public class EmployeeBean {
	
	private String employeeName;
	private String employeeEmail;
	private String managerName;
	private String managerEmail;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date date;
	private String temperature;
	private String oxygenLevel;
	
	public static Employee map(EmployeeBean bean) {
		Employee employee = new Employee(bean.getEmployeeName(), bean.getEmployeeEmail(), bean.getManagerName(), bean.getManagerEmail(), bean.getDate(), 
				bean.getTemperature(), bean.getOxygenLevel());
		return employee;
	}
	
	/**
	 * @param employeeName
	 * @param employeeEmail
	 * @param managerName
	 * @param managerEmail
	 * @param date
	 * @param temperature
	 * @param oxygenLevel
	 */
	public EmployeeBean(String employeeName, String employeeEmail, String managerName, String managerEmail, Date date,
			String temperature, String oxygenLevel) {
		super();
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.managerName = managerName;
		this.managerEmail = managerEmail;
		this.date = date;
		this.temperature = temperature;
		this.oxygenLevel = oxygenLevel;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerEmail() {
		return managerEmail;
	}
	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getOxygenLevel() {
		return oxygenLevel;
	}
	public void setOxygenLevel(String oxygenLevel) {
		this.oxygenLevel = oxygenLevel;
	}
	@Override
	public String toString() {
		return "EmployeeBean [employeeName=" + employeeName + ", employeeEmail=" + employeeEmail + ", managerName="
				+ managerName + ", managerEmail=" + managerEmail + ", date=" + date + ", temperature=" + temperature
				+ ", oxygenLevel=" + oxygenLevel + "]";
	}
}
