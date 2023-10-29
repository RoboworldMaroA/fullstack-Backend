package com.managecustomers.security.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunnerUser(UserRepository userRepository) {
        return args -> {
            User AdminMaro = new User(
                    1,
                    "MaroAdmin",
                    "Augustyn",
                    "maro@o2.pl",
                    "pass",
                    "userName",
                    Role.USER


            );


            userRepository.saveAll(List.of(AdminMaro)
            );

        };


    }

}