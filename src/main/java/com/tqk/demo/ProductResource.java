package com.tqk.demo;


import org.jeasy.random.EasyRandom;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/product")
public class ProductResource {

    private final EasyRandom generator = new EasyRandom();

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProductPage() {
        List<Product> list = new ArrayList<>();
        int i = 0;
        while (i < new Random().nextInt(20)) {
            list.add(new Product("Project name" + i, i));
            i++;
        }
        return list;
    }

    public List<Product> createProducts() {
        return generator.objects(Product.class, 5).collect(Collectors.toList());
    }
}
