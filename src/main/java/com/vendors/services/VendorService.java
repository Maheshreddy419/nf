package com.vendors.services;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import com.vendors.documents.Vendor;

public interface VendorService {

	List<Vendor> getAllVendors();
	Vendor getVendorById(UUID id);
	String deleteOneVendor(UUID id);
	String updateVendor(UUID id, Vendor vendor);
	Vendor createVendor(@Valid Vendor vendor);
	String deleteAllVendors();

}
