package com.github.patrickfrr.personapi.repositories;

import com.github.patrickfrr.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}