package com.example.bootmongocrud.demo.repo;

import com.example.bootmongocrud.demo.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, Long> {
}
