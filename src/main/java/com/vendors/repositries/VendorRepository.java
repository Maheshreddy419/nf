package com.vendors.repositries;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.vendors.documents.Vendor;
@Repository("vendorRepo")
public interface VendorRepository extends MongoRepository<Vendor, UUID> {

	Vendor findByVendorId(UUID vendorId);		
	
}
