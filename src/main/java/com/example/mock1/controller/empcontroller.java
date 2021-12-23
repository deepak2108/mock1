package com.example.mock1.controller;

import com.example.mock1.entity.employee;
import com.example.mock1.service.empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class empcontroller {

    @Autowired
    empservice service;

    @PostMapping("/add")
    public void addingdetails(@RequestBody employee emp)
    {
        service.add(emp);
    }

    @GetMapping("/get/{id}")
    public employee gettingdetails(@PathVariable int id)
    {
        return service.get(id);
    }
}
