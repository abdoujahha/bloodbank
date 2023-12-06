package com.abdallah.bloodbank.repos;

import com.abdallah.bloodbank.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
