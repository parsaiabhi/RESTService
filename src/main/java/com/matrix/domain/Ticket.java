package com.matrix.domain;

public class Ticket {

	private String ticketNo;
	private String ticketDate;
	private String source;
	private String destination;
	public String getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getTicketDate() {
		return ticketDate;
	}
	public void setTicketDate(String ticketDate) {
		this.ticketDate = ticketDate;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return "Ticket [ticketNo=" + ticketNo + ", ticketDate=" + ticketDate + ", source=" + source + ", destination="
				+ destination + "]";
	}
	
	
	
}
