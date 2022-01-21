package com.wakanda.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Wakanda_Car")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int carid;
	private String carname;
	private String model;
	private String power;
	private String milage;
	private int colors;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCarid() {
		return carid;
	}
	public void setCarid(int carid) {
		this.carid = carid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getMilage() {
		return milage;
	}
	public void setMilage(String milage) {
		this.milage = milage;
	}
	public int getColors() {
		return colors;
	}
	public void setColors(int colors) {
		this.colors = colors;
	}
	@Override
	public String toString() {
		return "Car [carid=" + carid + ", carname=" + carname + ", model=" + model + ", power=" + power + ", milage="
				+ milage + ", colors=" + colors + "]";
	}
	
	
}
