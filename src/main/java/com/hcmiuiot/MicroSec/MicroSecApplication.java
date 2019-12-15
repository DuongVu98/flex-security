package com.hcmiuiot.MicroSec;

import com.hcmiuiot.MicroSec.models.User;
import com.hcmiuiot.MicroSec.repositories.UserCommandRepository;
import com.hcmiuiot.MicroSec.repositories.UserRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroSecApplication implements CommandLineRunner {

	@Autowired
	Logger logger;

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MicroSecApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User("lee@gmail.com", "letuan98");
		userRepository.save(user);
		User userToUpdate = userRepository.findByUsername("tony@gmail.com");
		userRepository.updateUser(userToUpdate.getId(), "tony123@gmail.com");
	}

}
