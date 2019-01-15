package jpa;

import jpa.dao.PatientDao;
import jpa.dao.PatientDaoImpl;
import jpa.entity.*;
import jpa.service.PatientService;
import jpa.service.PatientServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("persistence");
        EntityManager em = emFactory.createEntityManager();

        PatientDao patientDao = new PatientDaoImpl(em, Patient.class);
        PatientService patientService = new PatientServiceImpl(patientDao);

        Patient patientSkin = new Patient();
        patientSkin.setName("PatientForUltrasonic");

        AccessoryUltrasonic accessoryUltrasonic = new AccessoryUltrasonic();
        accessoryUltrasonic.setAlergic(true);
        accessoryUltrasonic.setGelName("superGEL");

        DeviceUltrasonic ultrasonic = new DeviceUltrasonic();
        ultrasonic.setName("SuperSonic");
        ultrasonic.setApplicatorSize(1.1);
        ultrasonic.setEnergyPower(220);
        ultrasonic.setFrequency(133);
        ultrasonic.addAccesory(accessoryUltrasonic);

        TestSkin testSkin = new TestSkin();
        testSkin.addDevice(ultrasonic);
        testSkin.setFatAmount(200);
        testSkin.setHistamineAgents(2.5);

        patientSkin.addTest(testSkin);
        patientService.save(patientSkin);

        Patient patientBlood = new Patient();
        patientBlood.setName("PatientForBlood666");

        AccessoryPhotomoter accessoryPhotomoter = new AccessoryPhotomoter();
        accessoryPhotomoter.setSensivity(77.7);
        accessoryPhotomoter.setSensor("coolSensor666");

        DevicePhotometr devicePhotometr = new DevicePhotometr();
        devicePhotometr.setManufacturedDate(new Date(427653));
        devicePhotometr.setName("PhotometrBlood666");
        devicePhotometr.setWavelength(200);
        devicePhotometr.setMinimalVolumeOfTest(10.2);
        devicePhotometr.setDetector("SuperDetectorBlood666");
        devicePhotometr.addAccesory(accessoryPhotomoter);

        TestBlood bloodtest = new TestBlood();
        bloodtest.addDevice(devicePhotometr);
        bloodtest.setLaboratoryName("Dnepro");
        bloodtest.setErythrocyteCount(155.5);
        bloodtest.setGlucoseLevel(5.5);
        bloodtest.setHemoglobinumLevel(150);
        bloodtest.setTestDate(new Date(5355985));

        patientBlood.addTest(bloodtest);
        patientService.save(patientBlood);

        System.out.println(bloodtest);
        System.out.println(testSkin);
    }
}
