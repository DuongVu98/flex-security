package com.hcmiuiot.MicroSec;

import com.hcmiuiot.MicroSec.models.User;
import com.hcmiuiot.MicroSec.repositories.UserRepository;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MicroSecApplicationTests {

	@Autowired
	Logger logger;

	@Autowired
	UserRepository userRepository;

	@Test
	@DisplayName("Simple test")
	void simpleTest() {
		logger.info("this test should run");
		boolean value = true;
		Assert.assertTrue(value);
	}

	@Test
	@DisplayName("find user with wrong username")
	void userRepositoryWithWrongUsernameTest(){
		User user = userRepository.findByUsername("blah@gmail.com");
		Assert.assertNull(user);
	}
}
