package com.dailyspring.springbootmongodb.repository;

import com.dailyspring.springbootmongodb.collection.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends MongoRepository<Person,String> {
}
