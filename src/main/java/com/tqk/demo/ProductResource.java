package com.tqk.demo;


import org.jeasy.random.EasyRandom;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/product")
public class ProductResource {

    private EasyRandom generator = new EasyRandom();

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProductPage() {
        return  generator.objects(Product.class, 5).collect(Collectors.toList());
    }
}
