package com.apitest.one;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Deserialization {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		try {
			
			FileReader read = new FileReader("C:\\Users\\Lenovo\\eclipse-workspace\\API_Test\\src\\test\\resources\\jsonexample.json");
			
			JSONParser parse = new JSONParser();
			
			Object object = parse.parse(read);
			
			
			
			JSONObject job = (JSONObject)object;
			
			String name =(String)job.get("firstName");
			
			System.out.println(name);
			
			String lastname = (String)job.get("lastName");
			
			System.out.println(lastname);			
			
			String emailid = (String)job.get("emailid");
			
			System.out.println(emailid);
			
			String phnum = (String)job.get("phoneNum");
			
			System.out.println(phnum);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
