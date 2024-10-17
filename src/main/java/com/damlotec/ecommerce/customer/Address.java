package com.damlotec.ecommerce.customer;

import lombok.*;
import org.springframework.validation.annotation.Validated;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
@Validated
public class Address {
    private String street;
    private int houseNumber;
    private String zipCode;
}