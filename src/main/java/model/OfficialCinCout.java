package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_official_cin_cout")
public class OfficialCinCout {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "official_cin_cout_id")
    private int officialCinCoutId;

    @Column(name = "recorded_kilometers")
    private int officialCinCoutRecordedKilometers;

    public int getOfficialCinCoutRecordedKilometers() {
        return officialCinCoutRecordedKilometers;
    }

    public void setOfficialCinCoutRecordedKilometers(int officialCinCoutRecordedKilometers) {
        this.officialCinCoutRecordedKilometers = officialCinCoutRecordedKilometers;
    }
}
