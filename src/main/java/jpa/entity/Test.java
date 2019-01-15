package jpa.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    protected Integer id;
    @Column
    protected Date testDate;
    @Column
    protected String laboratoryName;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "DeviceTest", joinColumns =
            {@JoinColumn(name = "testId")}, inverseJoinColumns =
            {@JoinColumn(name = "deviceId")})
    protected Set<Device> devices = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "PatientTest", joinColumns =
            {@JoinColumn(name = "testId")}, inverseJoinColumns =
            {@JoinColumn(name = "patientId")})
    protected Set<Patient> patients = new HashSet<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public String getLaboratoryName() {
        return laboratoryName;
    }

    public void setLaboratoryName(String laboratoryName) {
        this.laboratoryName = laboratoryName;
    }

    public Set<Device> getDevices() {
        return devices;
    }

    public void setDevices(Set<Device> devices) {
        this.devices = devices;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", testDate=" + testDate +
                ", laboratoryName='" + laboratoryName + '\'' +
                ", devices=" + devices +
                ", patients=" + patients +
                '}';
    }
}
