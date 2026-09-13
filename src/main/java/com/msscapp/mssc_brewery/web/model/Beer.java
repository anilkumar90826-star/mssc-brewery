package com.msscapp.mssc_brewery.web.model;

import lombok.Builder;

import java.util.UUID;

@Builder
public record Beer(
        UUID id,
        String beerName,
        String beerStyle,
        Long upc
) {
}
