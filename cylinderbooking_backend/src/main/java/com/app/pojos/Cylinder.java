package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
@ToString
@Entity
@Table(name = "cylinder_connection_type")
public class Cylinder{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "cylinder_type_id")
	private int cylinderTypeId;
	
	@Column(name = "cylinder_type",nullable = false)
	private String cylinderType;
	
	private Float weight;

	
	public Cylinder() {
		// TODO Auto-generated constructor stub
	}
	
	public Cylinder(String cylinderType, Float weight) {
		super();
		this.cylinderType = cylinderType;
		this.weight = weight;
	}

	public int getCylinderTypeId() {
		return cylinderTypeId;
	}

	public void setCylinderTypeId(int cylinderTypeId) {
		this.cylinderTypeId = cylinderTypeId;
	}

	public String getCylinderType() {
		return cylinderType;
	}

	public void setCylinderType(String cylinderType) {
		this.cylinderType = cylinderType;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}
	
	


}
