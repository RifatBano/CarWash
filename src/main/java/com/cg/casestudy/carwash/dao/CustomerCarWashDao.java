package com.cg.casestudy.carwash.dao;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.cg.casestudy.carwash.entity.CustomerCarWashEntity;
import org.springframework.stereotype.Repository;

/*
 * 
 */
@Repository
public interface CustomerCarWashDao extends MongoRepository<CustomerCarWashEntity,String>{

	CustomerCarWashEntity findOne(String id);


}
