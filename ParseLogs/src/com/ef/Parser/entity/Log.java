package com.ef.Parser.entity;

public class Log {

	private String startDate;
	private String ip;
	private String descriptionRequest;
	private Long duration;
	private String systemInformation;
	
	public Log(String startDate, String ip, String descriptionRequest, Long duration,
			String systemInformation) {
		this.startDate = startDate;
		this.duration = duration;
		this.ip = ip;
		this.descriptionRequest = descriptionRequest;
		this.systemInformation = systemInformation;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getDescriptionRequest() {
		return descriptionRequest;
	}
	public void setDescriptionRequest(String descriptionRequest) {
		this.descriptionRequest = descriptionRequest;
	}

	public String getSystemInformation() {
		return systemInformation;
	}
	public void setSystemInformation(String systemInformation) {
		this.systemInformation = systemInformation;
	}
	
	@Override
	public String toString() {
		return "Log [startDate=" + startDate + ", duration=" + duration + ", ip=" + ip + ", descriptionRequest="
				+ descriptionRequest + ", systemInformation=" + systemInformation + "]";
	}
	
}
