package jpa.service;

import jpa.dao.DeviceDao;
import jpa.entity.Device;

import java.util.List;

public class DeviceServiceImpl implements DeviceService {
    private final DeviceDao deviceDao;

    public DeviceServiceImpl(DeviceDao deviceDao) {
        this.deviceDao = deviceDao;
    }

    @Override
    public void save(Device device) {
        deviceDao.create(device);
    }

    @Override
    public Device find(Integer integer) {
        return null;
    }

    @Override
    public List<Device> finaAll() {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public Device update(Device device) {
        return null;
    }
}
