package com.github.tripville.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tripreq")
public class TripReq {
	
	@Id
	@GeneratedValue
	private int tripreqid;
	public int getTripreqid() {
		return tripreqid;
	}
	public void setTripreqid(int tripreqid) {
		this.tripreqid = tripreqid;
	}
	public int getTripid() {
		return tripid;
	}
	public void setTripid(int tripid) {
		this.tripid = tripid;
	}
	public String getCopassid() {
		return copassid;
	}
	public void setCopassid(String copassid) {
		this.copassid = copassid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	private int tripid;
	private String copassid;
	private String status;
	@Override
	public String toString() {
		return "TripReq [tripreqid=" + tripreqid + ", tripid=" + tripid
				+ ", copassid=" + copassid + ", status=" + status
				+ ", getTripreqid()=" + getTripreqid() + ", getTripid()="
				+ getTripid() + ", getCopassid()=" + getCopassid()
				+ ", getStatus()=" + getStatus() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
