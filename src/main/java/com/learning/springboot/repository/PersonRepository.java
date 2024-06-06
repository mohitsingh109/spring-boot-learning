package com.learning.springboot.repository;

import com.learning.springboot.model.Person;
import com.learning.springboot.model.PersonDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {


    @Query("select new com.learning.springboot.model.PersonDTO(p.name, p.email) from Person p where id=:id") // fail
    PersonDTO fetchById(@Param("id") Long id); // fail

    //Person findById(Long id); select p.name, p.id, ... from pserson p where id=?
}
