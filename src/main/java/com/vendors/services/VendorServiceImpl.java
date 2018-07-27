package com.vendors.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vendors.documents.Vendor;
import com.vendors.repositries.VendorRepository;

@Service("vendorService")
public class VendorServiceImpl implements VendorService {

	@Autowired
	private VendorRepository vendorRepo;
	
	@Override
	public List<Vendor> getAllVendors() {
		return vendorRepo.findAll();
	}
	
	@Override
	public Vendor getVendorById(UUID Id) {
		return vendorRepo.findByVendorId(Id);
	}

	@Override
	public Vendor createVendor(Vendor vendor) {
		
		return vendorRepo.insert(vendor);
	}
	
	@Override
	public String updateVendor(UUID Id, Vendor vendor) {
		Vendor vendorData = vendorRepo.findByVendorId(Id);
		if (Id == null) {
			return "Vendor Store Not Found";
		}
		vendorData.setVendorName(vendor.getVendorName());
		vendorData.setVendorCity(vendor.getVendorCity());
		vendorData.setVendorEmail(vendor.getVendorEmail());
		vendorData.setServices(vendor.getServices());
		vendorRepo.save(vendorData);
		
		return "Vendor Details Updated Successfully!";
	}


	@Override
	public String deleteOneVendor(UUID Id) {
		vendorRepo.deleteById(Id);
		return "Vendor has been Deleted!";
	}

	@Override
	public String deleteAllVendors() {
		vendorRepo.deleteAll();
		return "All Vendors have been Deleted!";

	}

}
