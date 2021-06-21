package de.neuefische.mychargepoint.backend.service;

import de.neuefische.mychargepoint.backend.model.Chargepoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;
import java.util.List;

public class GoingElectricApiService {

    @Service
    public class ChargepointService {
        private final String githubApi= "https://api.github.com";
        private final RestTemplate restTemplate;

        @Autowired
        public ChargepointService(RestTemplate restTemplate) {
            this.restTemplate = restTemplate;
        }

        public List<Chargepoint> getPulls(String user, String repo) {
            String requestString = githubApi + "/repos/" + user + "/" + repo + "/pulls";
            ResponseEntity<Pull[]> response = restTemplate.getForEntity(requestString, Pull[].class);

            if (response.getBody() != null) {
                return Arrays.asList(response.getBody());
            }
            return List.of();
        }
    }


}








