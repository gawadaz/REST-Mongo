package com.gawad.restmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gawad.restmongo.model.Person;
import com.gawad.restmongo.model.PersonRepository;

@RestController
@RequestMapping("api")
public class TestController {

	@Autowired
	PersonRepository personRepo;
	
	@RequestMapping("/person")
	public List<Person> getAllPerson() {
		return this.personRepo.findAll();
	}
	
	@RequestMapping("/test")
	public ResponseEntity<String> getTest() {
		return new ResponseEntity<String>("test passed", HttpStatus.BAD_REQUEST);
	}
	
}
