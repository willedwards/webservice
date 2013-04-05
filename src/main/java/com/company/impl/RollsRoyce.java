package com.company.impl;


import com.company.Petrol;
import com.company.api.CarService;

public class RollsRoyce implements CarService
{
    private static final Double MAX_FUEL_CAPACITY = 120.0;

    private Double currentFuelLevel = 0.0;

    public String getModel()
    {
        return "Bentley";
    }

    @Override
    public void addPetrol(Petrol petrol)
    {
        currentFuelLevel += petrol.litres;

        if (currentFuelLevel > MAX_FUEL_CAPACITY)
            currentFuelLevel = MAX_FUEL_CAPACITY;
    }

    @Override
    public Boolean isFull()
    {
        return (Double.compare(currentFuelLevel, MAX_FUEL_CAPACITY) == 0);
    }

    @Override
    public void drainTank()
    {
        currentFuelLevel = 0.0;
    }

}