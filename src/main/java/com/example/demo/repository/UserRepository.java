package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Procedure("MARK_NAMES")
    void updateNames(LocalDateTime date);
}
