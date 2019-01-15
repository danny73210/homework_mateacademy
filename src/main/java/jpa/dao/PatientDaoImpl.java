package jpa.dao;

import jpa.entity.Patient;

import javax.persistence.EntityManager;

public class PatientDaoImpl extends AbstractDao<Patient, Integer> implements PatientDao {
    public PatientDaoImpl(EntityManager em, Class<Patient> patientClass) {
        super(em, patientClass);
    }
}
