package com.cg.casestudy.carwash.dataccessImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.cg.casestudy.carwash.dataccesslayer.CustomerDAL;
import com.cg.casestudy.carwash.entity.CustomerCarWashEntity;

@Repository
public  class CustomerDALImpl implements CustomerDAL{
	@Autowired
	private MongoTemplate mongoTemplate;


	@Override
	public List<CustomerCarWashEntity> getAllCustomerCarWashEntity() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(CustomerCarWashEntity.class);
	}

	@Override
	public CustomerCarWashEntity getCustomerCarWashEntityById(String Id) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("Id").is(Id));
		return mongoTemplate.findOne(query, CustomerCarWashEntity.class);
	}
}