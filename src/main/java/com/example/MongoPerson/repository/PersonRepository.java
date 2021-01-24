package com.example.MongoPerson.repository;

import com.example.MongoPerson.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    List<Person> findByFirstName(String firstName);

    @Query("{ 'address.state': ?0 }")
    List<Person> findByState(String state);

//    @Query(value = "{ 'address.state': ?0 }",fields = "{'person' : 0}")
//    Person getByState(String state);
}
