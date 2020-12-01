package com.pocathon.dec2020.bean;

public class EmployeeDailyUpdateRequest {
	
	private String temperature;
	private String oxygenLevel;
	
	/**
	 * @param temperature
	 * @param oxygenLevel
	 */
	public EmployeeDailyUpdateRequest(String temperature, String oxygenLevel) {
		super();
		this.temperature = temperature;
		this.oxygenLevel = oxygenLevel;
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
		return "EmployeeDailyUpdateRequest [temperature=" + temperature + ", oxygenLevel=" + oxygenLevel + "]";
	}
}
