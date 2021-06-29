package de.neuefische.mychargepoint.backend.model;
;
import de.neuefische.mychargepoint.backend.model.api.Chargelocations;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chargepoint {
    private String status;
    private Chargelocations[] chargelocations;
}