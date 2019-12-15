package com.hcmiuiot.MicroSec.repositories;

import com.hcmiuiot.MicroSec.models.User;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional(readOnly = true)
@NoArgsConstructor
public class UserCommandJpaRepository implements UserCommandRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User saveUser(User user) {
        entityManager.persist(user);
        return user;
    }

    @Override
    public String testFunction() {
        return "this is test function for UserCommandJpaRepository";
    }
}
