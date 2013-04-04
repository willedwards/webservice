package com.company.api;

import com.company.Petrol;

public interface CarService
{

	String getModel();

    void addPetrol(Petrol petrol);

    Boolean isFull();
}