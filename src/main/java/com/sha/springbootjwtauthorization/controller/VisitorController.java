package com.sha.springbootjwtauthorization.controller;


import com.sha.springbootjwtauthorization.model.Visitor;
import com.sha.springbootjwtauthorization.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/visitor")//pre-path
public class VisitorController {

    @Autowired
    private VisitorService visitorService;

    @PostMapping("/create")//api/visitor/create
    public ResponseEntity<?> saveVisitor(@RequestBody Visitor visitor)
    {
        return new ResponseEntity<>(visitorService.saveVisitor(visitor), HttpStatus.CREATED);
    }

    @GetMapping("/getAll")//api/visitor/getAll
    public ResponseEntity<?> findAllVisitor()
    {
        return ResponseEntity.ok(visitorService.findAllVisitor());
    }

}


