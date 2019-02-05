package jpa;

import jpa.dao.PatientDao;
import jpa.dao.PatientDaoImpl;
import jpa.entity.AccessoryPhotomoter;
import jpa.entity.AccessoryUltrasonic;
import jpa.entity.DevicePhotometr;
import jpa.entity.DeviceUltrasonic;
import jpa.entity.Patient;
import jpa.entity.TestBlood;
import jpa.entity.TestSkin;
import jpa.service.PatientService;
import jpa.service.PatientServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("PatientName");
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
        patientBlood.setName("PatientForBlood");

        AccessoryPhotomoter accessoryPhotomoter = new AccessoryPhotomoter();
        accessoryPhotomoter.setSensivity(77.7);
        accessoryPhotomoter.setSensor("coolSensor");

        DevicePhotometr devicePhotometr = new DevicePhotometr();
        devicePhotometr.setManufacturedDate(new Date(427653));
        devicePhotometr.setName("PhotometrBlood");
        devicePhotometr.setWavelength(200);
        devicePhotometr.setMinimalVolumeOfTest(10.2);
        devicePhotometr.setDetector("SuperDetectorBlood");
        devicePhotometr.addAccesory(accessoryPhotomoter);

        TestBlood testBlood = new TestBlood();
        testBlood.addDevice(devicePhotometr);
        testBlood.setLaboratoryName("SuperLaboratory");
        testBlood.setErythrocyteCount(155.5);
        testBlood.setGlucoseLevel(5.5);
        testBlood.setHemoglobinumLevel(150);
        testBlood.setTestDate(new Date(5355985));

        patientBlood.addTest(testBlood);
        patientService.save(patientBlood);
        System.out.println(testBlood);
        System.out.println(testSkin);
    }
}
