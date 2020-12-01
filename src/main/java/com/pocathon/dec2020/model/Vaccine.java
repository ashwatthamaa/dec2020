package com.pocathon.dec2020.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vaccine")
public class Vaccine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VaccineID")
	private Integer vaccineId;
	
	@Column(name = "VaccineName")
	private String vaccineName;
	
	@Column(name = "ThresholdTemperature")
	private String thresholdTemperature;
	
	@Column(name = "ThresholdOxygenLevel")
	private String thresholdOxygenLevel;
	
	/**
	 * 
	 */
	public Vaccine() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param vaccineId
	 * @param vaccineName
	 * @param thresholdTemperature
	 * @param thresholdOxygenLevel
	 */
	public Vaccine(Integer vaccineId, String vaccineName, String thresholdTemperature, String thresholdOxygenLevel) {
		super();
		this.vaccineId = vaccineId;
		this.vaccineName = vaccineName;
		this.thresholdTemperature = thresholdTemperature;
		this.thresholdOxygenLevel = thresholdOxygenLevel;
	}
	
	/**
	 * @param vaccineName
	 * @param thresholdTemperature
	 * @param thresholdOxygenLevel
	 */
	public Vaccine(String vaccineName, String thresholdTemperature, String thresholdOxygenLevel) {
		super();
		this.vaccineName = vaccineName;
		this.thresholdTemperature = thresholdTemperature;
		this.thresholdOxygenLevel = thresholdOxygenLevel;
	}

	public Integer getVaccineId() {
		return vaccineId;
	}

	public void setVaccineId(Integer vaccineId) {
		this.vaccineId = vaccineId;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public String getThresholdTemperature() {
		return thresholdTemperature;
	}

	public void setThresholdTemperature(String thresholdTemperature) {
		this.thresholdTemperature = thresholdTemperature;
	}

	public String getThresholdOxygenLevel() {
		return thresholdOxygenLevel;
	}

	public void setThresholdOxygenLevel(String thresholdOxygenLevel) {
		this.thresholdOxygenLevel = thresholdOxygenLevel;
	}

	@Override
	public String toString() {
		return "Vaccine [vaccineId=" + vaccineId + ", vaccineName=" + vaccineName + ", thresholdTemperature="
				+ thresholdTemperature + ", thresholdOxygenLevel=" + thresholdOxygenLevel + "]";
	}
}
