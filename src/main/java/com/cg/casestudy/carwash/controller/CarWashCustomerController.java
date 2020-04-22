package com.cg.casestudy.carwash.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.casestudy.carwash.dao.CustomerCarWashDao;
import com.cg.casestudy.carwash.entity.CustomerCarWashEntity;

@RestController
@RequestMapping(value="/login")
public class CarWashCustomerController {

	private final Logger LOG = LoggerFactory.getLogger(CarWashCustomerController.class);
	
	private final CustomerCarWashDao customerCarWashDao ;
	
	public CarWashCustomerController(CustomerCarWashDao customerCarWashDao)
	{
		this.customerCarWashDao=customerCarWashDao;
		
	}
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<CustomerCarWashEntity> getAllCustomerCarWashEntity() {
		LOG.info("Getting all users.");
		return customerCarWashDao.findAll();
	}
	
	@RequestMapping(value = "/{Id}", method = RequestMethod.GET)
	public CustomerCarWashEntity getCustomerCarWashEntity(@PathVariable String Id) {
		LOG.info("Getting user with ID: {}.", Id);
		return customerCarWashDao.findOne(Id);
	}
	
}
