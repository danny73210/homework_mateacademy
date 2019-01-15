package jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class AccessoryPhotomoter extends Accessory {
    @Column
    private String sensor;
    @Column
    private Integer spectrum;
    @Column
    private Double sensivity;

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public Integer getSpectrum() {
        return spectrum;
    }

    public void setSpectrum(Integer spectrum) {
        this.spectrum = spectrum;
    }

    public Double getSensivity() {
        return sensivity;
    }

    public void setSensivity(Double sensivity) {
        this.sensivity = sensivity;
    }

    @Override
    public String toString() {
        return "AccessoryPhotomoter{" +
                "sensor='" + sensor + '\'' +
                ", spectrum=" + spectrum +
                ", sensivity=" + sensivity +
                '}';
    }
}
