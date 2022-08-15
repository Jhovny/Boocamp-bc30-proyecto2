package com.bootcamp.bank.web.controller;

import com.bootcamp.bank.persistence.ProductRepository;
import com.bootcamp.bank.persistence.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/test")
public class Test {

    @Autowired
    private ProductRepository productoRepository;

    @GetMapping("/prueba1")
    public   Flux<Product>  prueba1(){


        Flux<Product> productos =productoRepository.getAll();

        return productos ;
    }

}
