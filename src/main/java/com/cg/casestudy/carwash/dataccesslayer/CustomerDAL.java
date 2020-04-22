package com.cg.casestudy.carwash.dataccesslayer;

import java.util.List;

import com.cg.casestudy.carwash.entity.CustomerCarWashEntity;

public interface CustomerDAL {

	public List<CustomerCarWashEntity> getAllCustomerCarWashEntity();

	public CustomerCarWashEntity getCustomerCarWashEntityById(String userId);
	
}
