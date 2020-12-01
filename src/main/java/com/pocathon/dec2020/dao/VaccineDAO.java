package com.pocathon.dec2020.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pocathon.dec2020.model.Vaccine;

@Repository
public interface VaccineDAO extends JpaRepository<Vaccine, Integer>{
	
}
