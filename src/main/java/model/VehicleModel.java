
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_vehicle_model")
public class VehicleModel {
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id // implement seriarizable
    
    @Column(name = "example")
    private String vehicleModelDescription;
    private int vehicleModelId;

    public String getVehicleModelDescription() {
        return vehicleModelDescription;
    }

    public void setVehicleModelDescription(String vehicleModelDescription) {
        this.vehicleModelDescription = vehicleModelDescription;
    }

    public int getVehicleModelId() {
        return vehicleModelId;
    }

    public void setVehicleModelId(int vehicleModelId) {
        this.vehicleModelId = vehicleModelId;
    }
    
    
}
