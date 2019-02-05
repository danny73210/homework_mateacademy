package jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class DevicePhotometr extends Device {
    @Column
    private Integer wavelength;
    @Column
    private Double minimalVolumeOfTest;
    @Column
    private String detector;

    public Integer getWavelength() {
        return wavelength;
    }

    public void setWavelength(Integer wavelength) {
        this.wavelength = wavelength;
    }

    public Double getMinimalVolumeOfTest() {
        return minimalVolumeOfTest;
    }

    public void setMinimalVolumeOfTest(Double minimalVolumeOfTest) {
        this.minimalVolumeOfTest = minimalVolumeOfTest;
    }

    public String getDetector() {
        return detector;
    }

    public void setDetector(String detector) {
        this.detector = detector;
    }

    @Override
    public String toString() {
        return "DevicePhotometr{" +
                "wavelength=" + wavelength +
                ", minimalVolumeOfTest=" + minimalVolumeOfTest +
                ", detector='" + detector + '\'' +
                '}';
    }
}
