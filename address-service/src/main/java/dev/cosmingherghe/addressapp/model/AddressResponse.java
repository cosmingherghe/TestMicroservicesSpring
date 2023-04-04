package dev.cosmingherghe.addressapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {
    private Long id;
    private Long employee_id;
    private String lane1;
    private String lane2;
    private String city;
    private String state;
    private String postcode;
    private String country;
}
