package com.company.ws;


import com.company.Petrol;
import com.company.api.CarService;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CarWS
{
	private CarService carService;

	@WebMethod(exclude=true)
	public void setCarService(CarService carService) {
		this.carService = carService;
	}

	@WebMethod(operationName="getModel")
	public String getModel() {
		return carService.getModel();
	}

    @WebMethod(operationName="addPetrol")
   	public void addPetrol(Petrol petrol) {
        carService.addPetrol(petrol);
   	}

    @WebMethod
    public Boolean isFull()
    {
        return carService.isFull();
    }

}