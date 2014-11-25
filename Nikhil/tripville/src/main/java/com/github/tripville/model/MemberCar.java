package com.github.tripville.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="carinfo")
public class MemberCar {
	
@Id
@Size(max =20)
private String regno;

@Column(name = "userid")
@NotEmpty
@Size(min=4, max=10)
private String userid;





public String getUserid() {
	return userid;
}

public void setUserid(String userid) {
	this.userid = userid;
}

public String getRegno() {
	return regno;
}

public void setRegno(String regno) {
	this.regno = regno;
}

}
