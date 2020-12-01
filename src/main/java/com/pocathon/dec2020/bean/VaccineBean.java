package com.pocathon.dec2020.bean;

import com.pocathon.dec2020.model.Vaccine;

public class VaccineBean {
	
	private String vaccineName;
	private String thresholdTemperature;
	private String thresholdOxygenLevel;
	
	public static Vaccine map(VaccineBean vaccineBean) {
		Vaccine vaccine = new Vaccine(vaccineBean.getVaccineName(), 
				vaccineBean.getThresholdTemperature(), vaccineBean.getThresholdOxygenLevel());
		return vaccine;
	}
	
	/**
	 * @param vaccineName
	 * @param thresholdTemperature
	 * @param thresholdOxygenLevel
	 */
	public VaccineBean(String vaccineName, String thresholdTemperature, String thresholdOxygenLevel) {
		super();
		this.vaccineName = vaccineName;
		this.thresholdTemperature = thresholdTemperature;
		this.thresholdOxygenLevel = thresholdOxygenLevel;
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
		return "VaccineBean [vaccineName=" + vaccineName + ", thresholdTemperature=" + thresholdTemperature
				+ ", thresholdOxygenLevel=" + thresholdOxygenLevel + "]";
	}
}
