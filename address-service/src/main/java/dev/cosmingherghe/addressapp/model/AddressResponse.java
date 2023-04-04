package dev.cosmingherghe.addressapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {
    private Long id;
    private String lane1;
    private String lane2;
    private String city;
    private String state;
    private String postcode;
    private String country;
}
