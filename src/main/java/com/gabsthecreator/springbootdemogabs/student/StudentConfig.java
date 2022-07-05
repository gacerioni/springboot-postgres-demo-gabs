package com.gabsthecreator.springbootdemogabs.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {

        return args -> {
            Student gabs = new Student(
                    "Gabs",
                    "gacerioni@gmail.com",
                    LocalDate.of(1992, Month.APRIL, 17)
            );

            Student cintia = new Student(
                    "Cintia",
                    "cihy1990@gmail.com",
                    LocalDate.of(1995, Month.DECEMBER, 31)
            );

            repository.saveAll(List.of(gabs,cintia));


        };

    }
}
