package com.pocathon.dec2020.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pocathon.dec2020.dao.VaccineDAO;
import com.pocathon.dec2020.model.Vaccine;

@Service
public class VaccineService {
	
	@Autowired
	VaccineDAO vaccineDAO;
	
	public Integer createNewVaccine(Vaccine vaccine) {
		return vaccineDAO.save(vaccine).getVaccineId();
	}
	
	public List<Vaccine> getAllVaccines() {
		return vaccineDAO.findAll();
	}
}
