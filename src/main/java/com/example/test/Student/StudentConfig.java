package com.example.test.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Gigi = new Student(
                    "Gigi",
                    "gigicireidze@gmail.com",
                    LocalDate.of(2001,10,8)
            );

            Student tekla = new Student(
                    "Tekla",
                    "Ttteklaa@gmail.com",
                    LocalDate.of(2000,9,7)
            );

            repository.saveAll(
                    List.of(Gigi,tekla)
            );
        };

    }
}
