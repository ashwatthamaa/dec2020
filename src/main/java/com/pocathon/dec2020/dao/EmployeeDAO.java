package com.pocathon.dec2020.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pocathon.dec2020.model.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer>{

	Employee findByEmployeeName(String employeeName);

}
