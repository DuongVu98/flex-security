package com.hcmiuiot.MicroSec.config;

import com.hcmiuiot.MicroSec.providers.UsernamePasswordAuthenticationCustomProvider;
import com.hcmiuiot.MicroSec.providers.UsernamePasswordDataAuthenticationProvider;
import com.hcmiuiot.MicroSec.repositories.UserCustomRepository;
import com.hcmiuiot.MicroSec.repositories.UserFakeRepository;
import com.hcmiuiot.MicroSec.repositories.UserRealRepository;
import com.hcmiuiot.MicroSec.repositories.UserRepository;
import com.hcmiuiot.MicroSec.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class AppConfig {

    @Bean(name = "non-data")
    public AuthenticationProvider authenticationProvider(){
        return new UsernamePasswordAuthenticationCustomProvider();
    }

    @Bean(name = "use-data")
    public AuthenticationProvider getAuthenticationProvider(){
        return new UsernamePasswordDataAuthenticationProvider();
    }

    @Bean(name = "fake-repo")
    public UserCustomRepository getFakeUserRepository(){
        return new UserFakeRepository();
    }

    @Bean(name = "real-repo")
    public UserCustomRepository getRealUserRepository(){
        return new UserRealRepository();
    }

    @Bean
    @Primary
    public UserDetailsService getUserService() {
        return new UserService();
    }

    @Bean
    public Logger getLogger() {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        return logger;
    }
}
