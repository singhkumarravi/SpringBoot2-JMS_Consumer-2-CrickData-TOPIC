package com.olive.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.olive.model.CrickData;
import com.olive.utils.JACKSON_Utils;

@Component
public class ConsumerService {
	
	@Autowired
	private  JACKSON_Utils util;
	
	@JmsListener(destination = "${my.app.desti-name}")
	public void readData(String message) {
		CrickData prod = util.toObject(message);
		             
		System.out.println("Data is Consumer Side :: " + prod);
	}

}
