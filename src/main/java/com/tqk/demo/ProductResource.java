package com.tqk.demo;


import org.jeasy.random.EasyRandom;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/product")
public class ProductResource {

    private final EasyRandom generator = new EasyRandom();

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProductPage() {
        return createProducts();
    }

    public List<Product> createProducts() {
        SecureRandom random = new SecureRandom(); 
        return generator.objects(Product.class, random.nextInt(30)).collect(Collectors.toList());
    }
}
