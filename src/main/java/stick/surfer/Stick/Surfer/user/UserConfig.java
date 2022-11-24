package stick.surfer.Stick.Surfer.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return args -> {
            User ely = new User(
                    15351L,
                    55151351L,
                    "Ely",
                    "ely@ely.com",
                    "1234"
            );
            User ari = new User(
                    1351L,
                    66151359L,
                    "Ari",
                    "ari@ari.com",
                    "4321"
            );
            userRepository.saveAll(
                    List.of(ely,ari)
            );
        };
    }
}
