package de.neuefische.mychargepoint.backend.model.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chargelocations {
    private List<Connection> chargepoints;
    private int ge_id;
    private String name;
    private Address address;
    private Coordinates coordinates;
    private String network;
    private String url;
    private Boolean fault_report;
    private Boolean verified;
    private float distance;
}
