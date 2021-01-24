package com.example.MongoPerson.repository;

import com.example.MongoPerson.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomPersonRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    public List<Person> getAll() {
        Query query = new Query();
        query.addCriteria(Criteria.where("firstName").is("Ayan"));
        return mongoTemplate.find(query,Person.class);
    }
}
