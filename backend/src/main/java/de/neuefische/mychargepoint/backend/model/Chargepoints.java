package de.neuefische.mychargepoint.backend.model;

import de.neuefische.mychargepoint.backend.model.api.Chargelocations;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chargepoints {
    private List<Chargelocations> chargelocations;
}