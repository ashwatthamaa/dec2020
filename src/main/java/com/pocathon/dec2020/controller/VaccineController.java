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
import com.pocathon.dec2020.bean.VaccineBean;
import com.pocathon.dec2020.model.Employee;
import com.pocathon.dec2020.service.EmployeeService;
import com.pocathon.dec2020.service.VaccineService;

@RestController
@RequestMapping(value="/vaccine")
public class VaccineController {
	
	@Autowired
	VaccineService vaccineService;
	
	@RequestMapping(value="/create-vaccine", method=RequestMethod.POST) 
	public ResponseEntity<?> createVaccine(@RequestBody VaccineBean bean) {
		Integer vaccineId = vaccineService.createNewVaccine(VaccineBean.map(bean));
		return new ResponseEntity<String>(vaccineId.toString(), HttpStatus.CREATED);
	}
}
