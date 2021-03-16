package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig{
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam=new Student(
                    "Mariam",
                    "mariam.joshi@gmail.com",
                    LocalDate.of(2000, JANUARY,5)
            );

            Student rishabh=new Student(
                    "Rishabh",
                    "rishabh.joshi@gmail.com",
                    LocalDate.of(2002, JANUARY,5)
            );

            repository.saveAll(
                    List.of(mariam, rishabh)
            );
        };
    }
}
