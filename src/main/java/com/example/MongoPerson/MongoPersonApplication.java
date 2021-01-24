package com.example.MongoPerson;

import com.example.MongoPerson.model.Address;
import com.example.MongoPerson.model.Person;
import com.example.MongoPerson.repository.CustomPersonRepository;
import com.example.MongoPerson.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MongoPersonApplication implements CommandLineRunner {

	@Autowired
	PersonRepository repository;

	@Autowired
	CustomPersonRepository customPersonRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoPersonApplication.class, args);
	}

	@Override
	public void run(String ... args) {

		System.out.println("Start");
		Address address1 = new Address(
				Arrays.asList("66/1/1/3","Shibpur Rd.","Mandirtala","Howrah"),"711102","California"
		);
		Address address2 = new Address(
				Arrays.asList("66/1/1/2","Shibpur Rd.","Mandirtala","Howrah"),"711102","WB"
		);
		repository.save(new Person("1","Ayan","Banerjee",address1));
		repository.save(new Person("2","Sayan","Banerjee",address1));
		repository.save(new Person("3","Nayan","Banerjee",address2));
		System.out.println("2 entries inserted in DB");
		System.out.println("\n\n==============Elements in DB=========================");
		repository.findAll().forEach(System.out::println);

		System.out.println("Person whose name is Ayan - ");
		repository.findByFirstName("Ayan").forEach(System.out::println);

		System.out.println("Persons living in the state California - ");
		repository.findByState("California").forEach(System.out::println);

		System.out.println("\n\n---------------------- Custom Mongo Repository -----------------");
		customPersonRepository.getAll().forEach(System.out::println);

//		repository.deleteAll();
		System.out.println("==============Deleted all entries in DB=========================");
	}
}
