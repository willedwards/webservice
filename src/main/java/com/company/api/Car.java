package com.company.api;

import com.company.Petrol;

public interface Car
{

	String getModel();

    void addPetrol(Petrol petrol);

    Boolean isFull();
}