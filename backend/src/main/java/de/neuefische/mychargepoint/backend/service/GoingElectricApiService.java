package de.neuefische.mychargepoint.backend.service;

import de.neuefische.mychargepoint.backend.model.Chargepoints;
import de.neuefische.mychargepoint.backend.model.api.Chargelocations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class GoingElectricApiService {
    protected final String chargepointApi = "https://api.goingelectric.de/chargepoints";
    protected final String apiKey = "9f267770e797899f665828f25f709904";
    private final RestTemplate restTemplate;
    protected final String countryKey = "countries=";
    protected final String countryValue = "DE";
    protected final String latitudeKey = "lat=";
    protected double latitudeValue = 53.5957976f;
    protected final String longitudeKey = "lng=";
    protected double longitudeValue = 10.1469108f;
    protected final String radiusKey = "radius=";
    protected int radiusValue = 10;
    protected final String minPowerKey = "min_power=";
    protected int minPowerValue = 22;
    protected final String freeparkingKey = "freeparking=";
    protected final boolean freeparkingValue = true;
    protected final String orderbyKey = "orderby=";
    protected String orderbyValue = "distance";

    @Autowired
    public GoingElectricApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Chargelocations> getChargepoints() {
        String requestString = chargepointApi + "/?key=" + apiKey + "&"
                + countryKey + countryValue + "&"
                + latitudeKey + latitudeValue + "&"
                + longitudeKey + longitudeValue + "&"
                + radiusKey + radiusValue + "&"
                + minPowerKey + minPowerValue + "&"
                + freeparkingKey + freeparkingValue + "&"
                + orderbyKey + orderbyValue;

        ResponseEntity<Chargepoints> response = restTemplate.getForEntity(requestString, Chargepoints.class);

        if (response.getBody() != null) {
            return response.getBody().getChargelocations();
        }
        return List.of();
    }
}








