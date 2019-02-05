package jpa.dao;

import jpa.entity.Device;
import jpa.entity.Patient;

import javax.persistence.EntityManager;

public class DeviceDaoImpl extends AbstractDao<Device, Integer> implements DeviceDao {
    public DeviceDaoImpl(EntityManager em, Class<Device> deviceClass) {
        super(em, deviceClass);
    }
}
