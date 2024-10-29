package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_official_vehicle")
public class OfficialVehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "official_vehicle_id")
    private int officialVehicleId;

    @Column(name = "renavan")
    private String officialVehicleRenavan;

    @Column(name = "chassis")
    private String officialVehicleChassis;

    public String getOfficialVehicleRenavan() {
        return officialVehicleRenavan;
    }

    public void setOfficialVehicleRenavan(String officialVehicleRenavan) {
        this.officialVehicleRenavan = officialVehicleRenavan;
    }

    public String getOfficialVehicleChassis() {
        return officialVehicleChassis;
    }

    public void setOfficialVehicleChassis(String officialVehicleChassis) {
        this.officialVehicleChassis = officialVehicleChassis;
    }
}
