package com.msscapp.mssc_brewery.services;

import com.msscapp.mssc_brewery.web.model.Beer;

import java.util.UUID;

public interface BeerServices {
    Beer getBeerById(UUID beerId);
}
