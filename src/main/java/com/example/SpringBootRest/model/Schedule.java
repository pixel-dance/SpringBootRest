package com.example.SpringBootRest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SCHEDULE")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Timetable", length = 50, nullable = false)
    @Enumerated
    private Timetable timetable;

    @Column(name = "Date_work", length = 50, nullable = false)
    @Basic
    private java.time.LocalDate localDate;

}
