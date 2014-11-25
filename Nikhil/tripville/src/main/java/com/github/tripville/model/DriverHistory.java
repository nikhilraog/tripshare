package com.github.tripville.model;

public class DriverHistory {

	
	private String userid;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getTripid() {
		return tripid;
	}
	public void setTripid(String tripid) {
		this.tripid = tripid;
	}
	public String getCopassId() {
		return copassId;
	}
	public void setCopassId(String copassId) {
		this.copassId = copassId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	private String tripid;
	private String copassId;
	private int rating;
	private String comments;
	
}
