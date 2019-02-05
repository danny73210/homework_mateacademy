package jpa.dao;

import jpa.entity.Patient;

import javax.persistence.EntityManager;

public class TestDaoImpl extends AbstractDao<Patient, Integer> implements TestDao {
    public TestDaoImpl(EntityManager em, Class<Patient> patientClass) {
        super(em, patientClass);
    }
}
