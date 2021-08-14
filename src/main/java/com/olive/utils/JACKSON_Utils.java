package com.olive.utils;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.olive.model.CrickData;

@Component
public class JACKSON_Utils {

	
	public String toJson(CrickData crickData)  {
		String resp=null;
		try {
			 resp = new ObjectMapper().writeValueAsString(crickData);
			
		} catch (Exception e) {
			e.printStackTrace();
			resp="Json Converion fail";
		}
		 
		return resp;
	}
	
	public CrickData toObject(String message)  {
		CrickData ob=null;
		try {
			ob= new ObjectMapper().readValue(message, CrickData.class);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		 
		return ob;
	}
}
