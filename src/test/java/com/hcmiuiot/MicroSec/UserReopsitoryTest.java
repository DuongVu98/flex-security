package com.hcmiuiot.MicroSec;

import com.hcmiuiot.MicroSec.models.User;
import com.hcmiuiot.MicroSec.repositories.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserReopsitoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    @DirtiesContext
    @DisplayName("after update 1")
    void updateUsernameTest(){
        User user = userRepository.findByUsername("tom@gmail.com");
        userRepository.updateUser(user.getId(), "tom123@gmail.com");

        User user1 = userRepository.findByUsername("tom123@gmail.com");
        Assert.assertNotNull(user1);
    }

    @Test
    @DirtiesContext
    @DisplayName("after update 2")
    void updateUsernameTest2(){
        User user = userRepository.findByUsername("tom@gmail.com");
        userRepository.updateUser(user.getId(), "tom123@gmail.com");

        User user1 = userRepository.findByUsername("tom@gmail.com");
        Assert.assertNull(user1);
    }
}
