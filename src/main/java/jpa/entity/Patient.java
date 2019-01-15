package jpa.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String name;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "PatientTest", joinColumns =
            {@JoinColumn(name = "patientId")}, inverseJoinColumns =
            {@JoinColumn(name = "testId")})
    protected Set<Test> tests = new HashSet<>();

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

    public Set<Test> getTests() {
        return tests;
    }

    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tests=" + tests +
                '}';
    }
}
