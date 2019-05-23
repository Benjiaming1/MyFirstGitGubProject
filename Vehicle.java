package com.vehicle;

public abstract class Vehicle {
	//父类
	private String brand;
	private String vehicleId;
	private int perSent;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getPerSent() {
		return perSent;
	}
	public void setPerSent(int perSent) {
		this.perSent = perSent;
	}

	public Vehicle(String brand, String vehicleId) {
		super();
		this.brand = brand;
		this.vehicleId = vehicleId;
	}
	public Vehicle(){}////品牌  车牌号  日租金
	public Vehicle(String brand, String vehicleId, int perSent) {
		
		this.brand = brand;
		this.vehicleId = vehicleId;
		this.perSent = perSent;
	}
	
	//计算租金
	public abstract float calc(int days);
	
	
}
