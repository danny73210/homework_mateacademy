package jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class TestBlood extends Test {
    @Column
    private Double glucoseLevel;
    @Column
    private Double erythrocyteCount;
    @Column
    private Integer hemoglobinumLevel;

    public Double getGlucoseLevel() {
        return glucoseLevel;
    }

    public void setGlucoseLevel(Double glucoseLevel) {
        this.glucoseLevel = glucoseLevel;
    }

    public Double getErythrocyteCount() {
        return erythrocyteCount;
    }

    public void setErythrocyteCount(Double erythrocyteCount) {
        this.erythrocyteCount = erythrocyteCount;
    }

    public Integer getHemoglobinumLevel() {
        return hemoglobinumLevel;
    }

    public void setHemoglobinumLevel(Integer hemoglobinumLevel) {
        this.hemoglobinumLevel = hemoglobinumLevel;
    }

    @Override
    public String toString() {
        return "TestBlood{" +
                "glucoseLevel=" + glucoseLevel +
                ", erythrocyteCount=" + erythrocyteCount +
                ", hemoglobinumLevel=" + hemoglobinumLevel +
                ", id=" + id +
                ", testDate=" + testDate +
                ", laboratoryName='" + laboratoryName + '\'' +
                ", tests=" + devices +
                '}';
    }
}
