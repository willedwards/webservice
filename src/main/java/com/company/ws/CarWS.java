package com.company.ws;


import com.company.Petrol;
import com.company.api.Car;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CarWS
{
	private Car car;

	@WebMethod(exclude=true)
	public void setCar(Car car) {
		this.car = car;
	}

	@WebMethod(operationName="getModel")
	public String getModel() {
		return car.getModel();
	}

    @WebMethod(operationName="addPetrol")
   	public void addPetrol(Petrol petrol) {
        car.addPetrol(petrol);
   	}

    @WebMethod
    public Boolean isFull()
    {
        return car.isFull();
    }

}