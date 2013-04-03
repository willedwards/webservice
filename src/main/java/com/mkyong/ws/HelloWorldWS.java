package com.mkyong.ws;

import com.mkyong.bo.Car;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorldWS{

	//DI via Spring
	Car car;

	@WebMethod(exclude=true)
	public void setCar(Car car) {
		this.car = car;
	}

	@WebMethod(operationName="getModel")
	public String getModel() {
		
		return car.getModel();
		
	}
 
}