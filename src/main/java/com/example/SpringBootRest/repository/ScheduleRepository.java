package com.example.SpringBootRest.repository;

import com.example.SpringBootRest.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}
