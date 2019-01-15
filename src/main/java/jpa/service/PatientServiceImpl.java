package jpa.service;

import jpa.dao.DeviceDao;
import jpa.dao.PatientDao;
import jpa.entity.Device;
import jpa.entity.Patient;

import java.util.List;

public class PatientServiceImpl implements PatientService {
    private final PatientDao patientDao;

    public PatientServiceImpl(PatientDao patientDao) {
        this.patientDao = patientDao;
    }

    @Override
    public void save(Patient patient) {
        patientDao.create(patient);
    }

    @Override
    public Patient find(Integer integer) {
        return patientDao.findOne(integer);
    }

    @Override
    public List<Patient> finaAll() {
        return patientDao.findAll();
    }

    @Override
    public void deleteById(int id) {
        patientDao.deleteById(id);
    }

    @Override
    public Patient update(Patient patient) {
        return patientDao.update(patient);
    }
}
