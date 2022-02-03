package com.example.SpringBootRest.controller;

import com.example.SpringBootRest.model.Person;
import com.example.SpringBootRest.repository.PersonOfScheduleRepository;
import com.example.SpringBootRest.repository.PersonRepository;
import com.example.SpringBootRest.repository.ScheduleRepository;
import com.example.SpringBootRest.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {
    private PeopleService peopleService;

    @Autowired
    public PersonOfScheduleRepository personOfScheduleRepository;

    @Autowired
    public ScheduleRepository scheduleRepository;

    @Autowired
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping()
    public List<Person> findAll(Model model){
        return peopleService.findAll();
    }

    @GetMapping("/all")
    public List<Object> findAllTable(Model model){
        return peopleService.findAllTable();
    }

    @GetMapping("{id}")
    public Person findPerson(@PathVariable("id") Long id){
        return peopleService.findById(id);
    }

    @DeleteMapping("{id}")
    public List<Person> deletePerson(@PathVariable("id") Long id){
        peopleService.deleteById(id);
        return peopleService.findAll();
    }
    @PostMapping()
    public List<Person> createPerson(@RequestBody Person person){
        peopleService.savePerson(person);
        return peopleService.findAll();
    }
}
