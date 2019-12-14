package com.hcmiuiot.MicroSec.services;

import com.hcmiuiot.MicroSec.models.User;
import com.hcmiuiot.MicroSec.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.spi.LoggerFactoryBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    Logger logger;

    @Autowired
    public UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException(username);
        }
        logger.info("[User] --> username: {}, password: {}", user.getUsername(), user.getPassword());
        return new CustomerUserDetails(user);
    }
}
