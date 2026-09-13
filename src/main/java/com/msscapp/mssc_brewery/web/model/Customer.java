package com.msscapp.mssc_brewery.web.model;

import lombok.Builder;

import java.util.UUID;

@Builder
public record Customer(
        UUID customerId,
        String customerName
) {
}
