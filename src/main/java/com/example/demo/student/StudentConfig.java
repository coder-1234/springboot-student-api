package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student s1 = new Student(
                    "hit",
                    "hit@gmail.com",
                    LocalDate.of(2000, Month.AUGUST,9));

            Student s2 = new Student(
                    "hit",
                    "hit@gmail.com",
                    LocalDate.of(2004, Month.AUGUST,9));

            repository.saveAll(
                    Arrays.asList(s1,s2)
            );
        };
    }
}
