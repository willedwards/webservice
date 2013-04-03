package com.mkyong.ws;

import com.mkyong.bo.Car;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorldWS{

	//DI via Spring
	Car car;

	@WebMethod(exclude=true)
	public void setMake(Car car) {
		this.car = car;
	}

	@WebMethod(operationName="getHelloWorld")
	public String getHelloWorld() {
		
		return car.getHelloWorld();
		
	}
 
}