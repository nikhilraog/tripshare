package com.github.tripville.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="trip")
public class Trip {

	
	
	
	@Id
	@GeneratedValue
	private int tripid;
	
	@Column(name = "userid")
	@NotEmpty
	@Size(min=2, max=10)
	private String userid;// = "User001";
	
	@Column(name = "startpt", length = 30)
	@NotEmpty
	private String fromAddress;
	
	@Column(name = "destinationpt", length = 30)
	@NotEmpty
	private String toAddress;
	
	@Column(name = "numofcopass")
	@NotNull
	private int numofcopassengers;
	
	@Column(name = "seatsavailable")
	@NotNull
	private int availableSeats;
	
	@Column(name = "startdate")
	@NotNull
	@Future
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private Date startDate;
	
	
	@Column(name = "starttime")
	@NotNull
	@Future
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private Date startTime;
	
	
	
	
	@Column(name = "rent")
	@NotNull
	private double rent;
	
	@Column(name = "comments",columnDefinition="VARCHAR(250)")
	@NotEmpty
	private String comments;
	
	
	
	public int getTripId() {
		return tripid;
	}

	public void setTripId(int tripid) {
		this.tripid = tripid;
	}

	public String getUserId() {
		return userid;
	}
	
	public void setUserId(String userid) {
		this.userid = userid;
	}

	public String getFromAddress() {
		return fromAddress;
	}
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	public String getToAddress() {
		return toAddress;
	}
	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}
	
	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	public int getNumofcopassengers() {
		return numofcopassengers;
	}

	public void setNumofcopassengers(int numofcopassengers) {
		this.numofcopassengers = numofcopassengers;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	

	public Date getStartTime() {
		return startDate;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	
	public double getRent() {
		return rent;
	}
	
	public void setRent(double rent) {
		this.rent = rent;
	}
	
	public String getComments() {
		return comments;
	}
	
	public void setComments(String comments) {
		this.comments = comments;
	}

	

}
