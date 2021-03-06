package com.vendors.controller;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vendors.documents.Vendor;
import com.vendors.services.VendorService;

@RestController
@RequestMapping("/show")
public class VendorController {


	@Autowired
	private VendorService vendorService;
	
	@GetMapping("/vendors")
	public List<Vendor> getAllVendors() { 
		return vendorService.getAllVendors();
	}
	
	@GetMapping("/vendors/{vendorId}")
	public Vendor getOneVendor(@PathVariable String vendorId) {
		UUID Id=UUID.fromString(vendorId);
		return vendorService.getVendorById(Id);
	} 
	
	@PostMapping("/vendors/create")
	public Vendor createVendor(@Valid @RequestBody Vendor vendor) {
		vendor.setVendorId(UUID.randomUUID());
		return vendorService.createVendor(vendor);
	}
	
	@RequestMapping(value="/vendors/{vendorId}", method=RequestMethod.PUT)
	public String updateVendor(@PathVariable String vendorId, @RequestBody Vendor vendor) { 
		UUID Id=UUID.fromString(vendorId);
		vendorService.updateVendor(Id, vendor);
		return "Vendor Details Updated Successfully!";
	}
 
	@DeleteMapping("/vendors/{vendorId}")
	public String deleteVendor(@PathVariable String vendorId) {
		UUID Id=UUID.fromString(vendorId);
		vendorService.deleteOneVendor(Id);
		return "Vendor has been deleted!";
	}
	
	@DeleteMapping("/vendors/delete")
	public String deleteAllVendors() {
		vendorService.deleteAllVendors();	
		return "All Vendors have been deleted!";
	}	
}
