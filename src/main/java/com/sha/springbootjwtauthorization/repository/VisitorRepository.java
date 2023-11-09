package com.sha.springbootjwtauthorization.repository;

import com.sha.springbootjwtauthorization.model.Visitor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {

    Optional<Visitor> findByFirstName(String firstName);
}
