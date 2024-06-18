package com.avvedanth7.springmvcdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.avvedanth7.springmvcdemo.dao.PersonDao;
import com.avvedanth7.springmvcdemo.dto.Person;

@Component
public class PersonService {
	@Autowired
	PersonDao personDao;
	
	public Boolean addPerson(Person person) {
		return personDao.addPerson(person);
	}
	
	public List<Person> getAllPersons(){
		return personDao.getAllPersons();
	}
	
	public Boolean removePerson(int id) {
		return personDao.removePerson(id);
	}
	
	public Person getPersonById(int id) {
		return personDao.getPersonById(id);
	}
	
	public Person updatePerson(Person person) {
		return personDao.updatePerson(person);
	}
}
