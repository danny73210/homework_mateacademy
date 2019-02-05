package jpa.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Device {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    protected String name;
    @Column
    protected Date manufacturedDate;

    @ManyToMany(fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
    @JoinTable(name = "DeviceTest", joinColumns =
            {@JoinColumn(name = "deviceId")}, inverseJoinColumns =
            {@JoinColumn(name = "testId")})
    protected Set<Test> tests = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
    protected Set<Accessory> accessories = new HashSet<>();

    public void addAccesory(Accessory accessory) {
        accessories.add(accessory);
    }

    public void addTest(Test test) {
        tests.add(test);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public Set<Test> getTests() {
        return tests;
    }

    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }

    public Set<Accessory> getAccessories() {
        return accessories;
    }

    public void setAccessories(Set<Accessory> accessories) {
        this.accessories = accessories;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturedDate=" + manufacturedDate +
                ", tests=" + tests +
                ", accessories=" + accessories +
                '}';
    }
}
