package jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class DeviceUltrasonic extends Device {
    @Column
    private Integer frequency;
    @Column
    private Integer energyPower;
    @Column
    private Double applicatorSize;

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    public Integer getEnergyPower() {
        return energyPower;
    }

    public void setEnergyPower(Integer energyPower) {
        this.energyPower = energyPower;
    }

    public Double getApplicatorSize() {
        return applicatorSize;
    }

    public void setApplicatorSize(Double applicatorSize) {
        this.applicatorSize = applicatorSize;
    }

    @Override
    public String toString() {
        return "DeviceUltrasonic{" +
                "frequency=" + frequency +
                ", energyPower=" + energyPower +
                ", applicatorSize=" + applicatorSize +
                '}';
    }
}
