package com.tqk.demo;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductResourceTest {

    @Autowired
    private ProductResource productResource;

    @Test
    void createProduct() {
        List<Product> result = productResource.createProducts();
        assertEquals(5, result.size());
    }
}