package com.example.SpringBootRest.repository;

import com.example.SpringBootRest.model.PersonOfSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonOfScheduleRepository extends JpaRepository<PersonOfSchedule, Long> {
}
