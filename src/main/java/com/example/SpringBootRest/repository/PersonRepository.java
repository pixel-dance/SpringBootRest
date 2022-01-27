package com.example.SpringBootRest.repository;

import com.example.SpringBootRest.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

