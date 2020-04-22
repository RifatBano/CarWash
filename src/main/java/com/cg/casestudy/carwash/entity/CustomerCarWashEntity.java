package com.cg.casestudy.carwash.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CustomerLogin")
public class CustomerCarWashEntity {


		@Id
		private String Id;
		private String fulllname;
		private String password;
		public CustomerCarWashEntity(String id, String fulllname, String password) {
			super();
			Id = id;
			this.fulllname = fulllname;
			this.password = password;
		}
		public String getId() {
			return Id;
		}
		public String getFulllname() {
			return fulllname;
		}
		public String getPassword() {
			return password;
		}
		
		
		
	
}
