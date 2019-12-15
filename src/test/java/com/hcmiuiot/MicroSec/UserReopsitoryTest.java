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
    @DisplayName("User repository with right username")
    void updateUsername(){
        User user = userRepository.findByUsername("tom@gmail.com");
        userRepository.updateUser(user.getId(), "tom123@gmail.com");

        User user1 = userRepository.findByUsername("tom123@gmailc.om");
        Assert.assertNotNull(user);
    }
}
