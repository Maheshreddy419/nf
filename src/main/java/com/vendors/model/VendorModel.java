package com.vendors.model;

import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class VendorModel {
	
	private UUID vendorId;
	private String VendorName;
	private String VendorCity;
	private String VendorEmail;
	private List<String> Services;
	public UUID getVendorId() {
		return vendorId;
	}
	public void setVendorId(UUID vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return VendorName;
	}
	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}
	public String getVendorCity() {
		return VendorCity;
	}
	public void setVendorCity(String vendorCity) {
		VendorCity = vendorCity;
	}
	public String getVendorEmail() {
		return VendorEmail;
	}
	public void setVendorEmail(String vendorEmail) {
		VendorEmail = vendorEmail;
	}
	public List<String> getServices() {
		return Services;
	}
	public void setServices(List<String> services) {
		Services = services;
	}
	
	
	
	
	

}
