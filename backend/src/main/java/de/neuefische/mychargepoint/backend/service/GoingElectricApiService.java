package de.neuefische.mychargepoint.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class GoingElectricApiService {
    private final String chargepointApi= "https://api.goingelectric.de/chargepoints";
    private final String apiKey = "9f267770e797899f665828f25f709904";
    private final RestTemplate restTemplate;
    private final String countryKey = "countries=";
    private String countryValue = "DE";
    private final String  latitudeKey = "lat=";
    private float latitudeValue = 53.5957976f;
    private final String  longitudeKey = "lng=";
    private float longitudeValue = 10.1469108f;
    private final String radiusKey = "radius=";
    private int radiusValue = 10;
    private final String minPowerKey = "min_power=";
    private int minPowerValue = 22;
    private final String freeparkingKey = "freeparking=";
    private boolean freeparkingValue = true;
    private final String verifiedKey = "verified=";
    private boolean verifiedValue = true;
    private final String orderbyKey = "orderby=";
    private String orderbyValue = "distance";

    @Autowired
    public GoingElectricApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<String> getChargepoints() {
        String requestString = chargepointApi + "/?key=" + apiKey + "&"
                + countryKey + countryValue + "&"
                + latitudeKey + latitudeValue + "&"
                + longitudeKey + longitudeValue + "&"
                + radiusKey + radiusValue + "&"
                + minPowerKey + minPowerValue + "&"
                + freeparkingKey + freeparkingValue + "&"
                + orderbyKey + orderbyValue;
        //ResponseEntity<Chargepoint[]> response = restTemplate.getForEntity(requestString, Chargepoint[].class);
     // JSONObject jsonObject = restTemplate.getForObject(requestString, JSONObject.class);
      ResponseEntity<String> response
                = restTemplate.getForEntity(requestString , String.class);


       //        System.out.println(jsonObject);
      // System.out.println(jsonObject.toString());
       // System.out.println(response);

        /*List<String> chargepoint = JsonPath.read(jsonObject, "$.chargelocations.name");
        System.out.println(chargepoint);
*/
        if (response != null ) {
            return List.of(response.getBody());
        }
        return List.of();
    }
}







