package com.example.jpatutorial;

import com.example.jpatutorial.models.Author;
import com.example.jpatutorial.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaTutorialApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(
            AuthorRepository repository
    ) {
        return args -> {
            var author = Author.builder()
                    .firstName("kris")
                    .lastName("psho")
                    .age(25)
                    .email("test@test.com")
                    .build();
            repository.save(author);
        };
    }
}
