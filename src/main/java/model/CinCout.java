package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_cincout")
public class CinCout {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int cinCoutId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date cinCoutData;

    // Getters and Setters
    public int getCinCoutId() {
        return cinCoutId;
    }

    public void setCinCoutId(int cinCoutId) {
        this.cinCoutId = cinCoutId;
    }

    public Date getCinCoutData() {
        return cinCoutData;
    }

    public void setCinCoutData(Date cinCoutData) {
        this.cinCoutData = cinCoutData;
    }
}
