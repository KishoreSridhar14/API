package com.apitest.one;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization {
	
	public static void main(String[] args) {
		
		try {
		Employee emp=new Employee();
		
		emp.setFirstName("Kishore");
		emp.setLastName("Sridhar");
		emp.setEmailid("ks@gmail.com");
		emp.setPhoneNum("9500249985");
		
		ObjectMapper objectmapper = new ObjectMapper();
		
			
		
		    String jsonString= objectmapper.writeValueAsString(emp);
			System.out.println(jsonString);
			
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	
	}

}
