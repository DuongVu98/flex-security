package com.hcmiuiot.MicroSec.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

public class UserCommandRepositoryImpl implements UserCommandRepository{
    @Autowired
    private EntityManager entityManager;

    @Override
    public String testFunction() {
        return "this is test function for UserCommandJpaRepository";
    }
}
