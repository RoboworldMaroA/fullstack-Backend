package com.managecustomers.security.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;


@Configuration
public class UserConfig {

    private final PasswordEncoder passwordEncoder;

    public UserConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }


    @Bean
    CommandLineRunner commandLineRunnerUser(UserRepository userRepository) {
        return args -> {
            User AdminMaro = new User(
                    1,
                    "MaroAdmin",
                    "Augustyn",
                    "maro@o2.pl",
                    passwordEncoder.encode("pass"),
                    "userName",
                    Role.USER


            );


            userRepository.saveAll(List.of(AdminMaro)
            );

        };


    }

}