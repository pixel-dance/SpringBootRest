package com.example.SpringBootRest.service;

import com.example.SpringBootRest.model.Person;
import com.example.SpringBootRest.repository.PersonOfScheduleRepository;
import com.example.SpringBootRest.repository.PersonRepository;
import com.example.SpringBootRest.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {
    private  final PersonRepository personRepository;

    @Autowired
    public PersonOfScheduleRepository personOfScheduleRepository;

    @Autowired
    public ScheduleRepository scheduleRepository;

    @Autowired
    public PeopleService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Query("Select * from Person join Shedule join PersonOfSchedule")
    public List<Object> findAllTable(){
        return personRepository.findAllTable();
    };

    public Person findById(Long id){
        return personRepository.findById(id).orElse(null);
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    public void deleteById(Long id){
        personRepository.deleteById(id);
    }
}
