package de.neuefische.mychargepoint.backend.model.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Connection {
    private String type;
    private float power;
    private int count;
}
