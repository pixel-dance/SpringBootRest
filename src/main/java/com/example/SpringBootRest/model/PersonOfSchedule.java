package com.example.SpringBootRest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PERSON_OF_SCHEDULE")
public class PersonOfSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Schedule")
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name = "Person")
    private Person person;
}
