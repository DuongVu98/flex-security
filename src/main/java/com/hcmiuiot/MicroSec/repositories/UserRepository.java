package com.hcmiuiot.MicroSec.repositories;

import com.hcmiuiot.MicroSec.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, String>, CrudRepository<User, String>, UserCommandRepository {
    User findByUsername(String username);
    List<User> findByUsernameLike(String usernameInput);

    @Modifying
    @Query("update User u set u.username = :username where u.id = :id")
    void updateUser(@Param("id") String id, @Param("username") String username);

    @Override
    <S extends User> S save(S entity);


}
