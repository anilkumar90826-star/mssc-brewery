package com.msscapp.mssc_brewery.web.controller;

import com.msscapp.mssc_brewery.services.BeerServices;
import com.msscapp.mssc_brewery.web.model.Beer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerServices beerServices;

    public BeerController(BeerServices beerServices) {
        this.beerServices = beerServices;
    }


    @GetMapping({"/{beerId}"})
    public ResponseEntity<Beer> getBeer(@PathVariable("beerId") UUID beerId) {
        Beer beer = beerServices.getBeerById(beerId);
        return ResponseEntity.ok(beer);
    }
}
