package com.example.SpringBootRest.repository;

import com.example.SpringBootRest.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query("Select * from Person join Shedule join PersonOfSchedule")
    public List<Object> findAllTable();
}

