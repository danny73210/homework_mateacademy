package jpa.service;

import jpa.entity.Test;

import java.util.List;

public class TestService implements Service<Test, Integer> {
    @Override
    public void save(Test test) {

    }

    @Override
    public Test find(Integer integer) {
        return null;
    }

    @Override
    public List<Test> finaAll() {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Test update(Test test) {
        return null;
    }
}
