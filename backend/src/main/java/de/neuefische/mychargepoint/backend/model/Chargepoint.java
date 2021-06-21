package de.neuefische.mychargepoint.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chargepoint {private int id;
    private String name;
    private String country;
    private String postcode;
    private String street;
    private float latitude;
    private float longitude;
    private String network;
    private String url;
    private boolean faultReport;
    private boolean verified;
    private boolean favorite = false;
    private List<String[]> connector;
}
