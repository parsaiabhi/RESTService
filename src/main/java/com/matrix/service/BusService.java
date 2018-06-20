package com.matrix.service;

import com.matrix.domain.Ticket;

public class BusService {

	private Ticket ticket;
	private String  busNo;
	private String busDriverName;
	private String busChasesNo;
	
	
	
	public String getBusChasesNo() {
		return busChasesNo;
	}
	public void setBusChasesNo(String busChasesNo) {
		this.busChasesNo = busChasesNo;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getBusDriverName() {
		return busDriverName;
	}
	public void setBusDriverName(String busDriverName) {
		this.busDriverName = busDriverName;
	}
	@Override
	public String toString() {
		return "BusService [ticket=" + ticket + ", busNo=" + busNo + ", busDriverName=" + busDriverName
				+ ", busChasesNo=" + busChasesNo + "]";
	}
	
	
	
	
	
	
}
