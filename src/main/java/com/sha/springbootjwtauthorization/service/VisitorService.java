package com.sha.springbootjwtauthorization.service;

import com.sha.springbootjwtauthorization.model.Visitor;

import java.util.List;
import java.util.Optional;

public interface VisitorService {
    Optional<Visitor> findByFirstName(String firstName);

    List<Visitor> findAllVisitor();

    Object saveVisitor(Visitor visitor);


}
