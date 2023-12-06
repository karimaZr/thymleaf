package com.example.thymleaf.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.thymleaf.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
