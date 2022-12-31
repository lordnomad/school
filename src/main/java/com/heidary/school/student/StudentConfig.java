package com.heidary.school.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mohammad = new Student(
                    "mohammad",
                    "heidary",
                    "mhd@gmail.com",
                    LocalDate.of(1992, JUNE, 19));

            Student zahra = new Student(
                    "zahra",
                    "jafarian",
                    "zjafarian@gmail.com",
                    LocalDate.of(1988, JUNE, 21));
            repository.saveAll(List.of(mohammad,zahra));
        };
    }
}
