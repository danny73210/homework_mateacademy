package jpa.dao;

import jpa.entity.Accessory;
import jpa.entity.Patient;

import javax.persistence.EntityManager;

public class AccessoryDaoImpl extends AbstractDao<Accessory, Integer> implements AccessoryDao {
    public AccessoryDaoImpl(EntityManager em, Class<Accessory> accessoryClass) {
        super(em, accessoryClass);
    }
}
