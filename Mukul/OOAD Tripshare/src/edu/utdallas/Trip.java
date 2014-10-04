package edu.utdallas;

public class Trip {
	
	private String source;
	private String destination;
	private String startDate;
	private String startTime;
	private Integer availableSeats;
	private Double rent;
	
	
	public Trip()
	{
		
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


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getStartTime() {
		return startTime;
	}


	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}


	public Integer getAvailableSeats() {
		return availableSeats;
	}


	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}


	public Double getRent() {
		return rent;
	}


	public void setRent(Double rent) {
		this.rent = rent;
	}

}
