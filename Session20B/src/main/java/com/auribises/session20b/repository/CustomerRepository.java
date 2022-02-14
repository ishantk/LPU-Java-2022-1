package com.auribises.session20b.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.auribises.session20b.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{

}
