package com.company.ws;


import com.company.api.Car;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CarWS
{

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