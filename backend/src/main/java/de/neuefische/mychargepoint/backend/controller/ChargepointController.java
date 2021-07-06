package de.neuefische.mychargepoint.backend.controller;

import de.neuefische.mychargepoint.backend.model.api.Chargelocations;
import de.neuefische.mychargepoint.backend.service.GoingElectricApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/chargepoints")
public class ChargepointController {

    private final GoingElectricApiService goingElectricApiService;

    @Autowired
    public ChargepointController(GoingElectricApiService goingElectricApiService) {
        this.goingElectricApiService = goingElectricApiService;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping()
    public List<Chargelocations> listChargepoints () {
        return goingElectricApiService.getChargepoints();
    }
}
