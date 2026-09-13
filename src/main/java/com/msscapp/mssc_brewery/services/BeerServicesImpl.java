package com.msscapp.mssc_brewery.services;

import com.msscapp.mssc_brewery.web.model.Beer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServicesImpl implements BeerServices{

    @Override
    public Beer getBeerById(UUID beerId) {
        return Beer.builder()
                .id(beerId)
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .upc(123456789L)
                .build();
    }
}
