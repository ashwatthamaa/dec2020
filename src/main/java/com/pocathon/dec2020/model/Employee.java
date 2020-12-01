package com.pocathon.dec2020.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EmployeeID")
	private Integer employeeId;
	
	@Column(name = "EmployeeName")
	private String employeeName;
	
	@Column(name = "EmployeeEmail")
	private String employeeEmail;
	
	@Column(name = "ManagerName")
	private String managerName;
	
	@Column(name = "ManagerEmail")
	private String managerEmail;
	
	@Column(name = "Date")
	private java.util.Date date;
	
	@Column(name = "Temperature")
	private String temperature;
	
	@Column(name = "OxygenLevel")
	private String oxygenLevel;

	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public Employee(String employeeName, String employeeEmail, String managerName,
			String managerEmail, Date date, String temperature, String oxygenLevel) {
		super();
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.managerName = managerName;
		this.managerEmail = managerEmail;
		this.date = date;
		this.temperature = temperature;
		this.oxygenLevel = oxygenLevel;
	}

	/**
	 * @param employeeId
	 * @param employeeName
	 * @param employeeEmail
	 * @param managerName
	 * @param managerEmail
	 * @param date
	 * @param temperature
	 * @param oxygenLevel
	 */
	public Employee(Integer employeeId, String employeeName, String employeeEmail, String managerName,
			String managerEmail, Date date, String temperature, String oxygenLevel) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeEmail = employeeEmail;
		this.managerName = managerName;
		this.managerEmail = managerEmail;
		this.date = date;
		this.temperature = temperature;
		this.oxygenLevel = oxygenLevel;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
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
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", managerName=" + managerName + ", managerEmail=" + managerEmail + ", date=" + date
				+ ", temperature=" + temperature + ", oxygenLevel=" + oxygenLevel + "]";
	}
}
