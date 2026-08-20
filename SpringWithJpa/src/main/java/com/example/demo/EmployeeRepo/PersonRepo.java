package com.example.demo.EmployeeRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;
import com.example.demo.model.PersonPk;

@Repository
public interface PersonRepo extends JpaRepository<Person, PersonPk> {

}
