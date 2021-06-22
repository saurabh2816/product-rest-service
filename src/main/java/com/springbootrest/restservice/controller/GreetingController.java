package com.springbootrest.restservice.controller;

import com.springbootrest.restservice.entity.Product;
import com.springbootrest.restservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    ProductRepository repository;


//    @GetMapping("greeting")
//    public Greeting greeting(@RequestParam (defaultValue = "World") String name) {
//        return new Greeting(counter.incrementAndGet(),String.format(template, name));
//    }

    @GetMapping("products")
    public <Product> products() {
        return repository.findAll();
    }

    @GetMapping("product/{id}")
    public Optional<Product> productById(@PathVariable("id") String id) {
        return repository.findById(Long.valueOf(id));
    }


}
