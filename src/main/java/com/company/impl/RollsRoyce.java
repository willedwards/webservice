package com.company.impl;


import com.company.Petrol;
import com.company.api.Car;

public class RollsRoyce implements Car
{
    private static final Double MAX_FUEL_CAPACITY = 120.0;

    private Double currentFuelLevel = 0.0;

	public String getModel(){
		return "Bently";
	}

    @Override
    public void addPetrol(Petrol petrol)
    {
        currentFuelLevel += petrol.litres;

        if(currentFuelLevel > MAX_FUEL_CAPACITY)
            currentFuelLevel = MAX_FUEL_CAPACITY;
    }

    @Override
    public Boolean isFull()
    {
        return (currentFuelLevel == MAX_FUEL_CAPACITY);
    }

}