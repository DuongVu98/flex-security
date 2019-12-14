package com.hcmiuiot.MicroSec.repositories;

import com.hcmiuiot.MicroSec.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String>, UserCustomRepository {
    User findByUsername(String username);
}
