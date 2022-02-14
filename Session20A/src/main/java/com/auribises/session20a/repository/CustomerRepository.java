package com.auribises.session20a.repository;
import org.springframework.data.repository.CrudRepository;

import com.auribises.session20a.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
