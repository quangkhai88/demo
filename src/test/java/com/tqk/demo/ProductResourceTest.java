package com.tqk.demo;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.*;


@SpringBootTest
class ProductResourceTest {

    @Autowired
    private ProductResource productResource;

    @Test
    void createProduct() {
        List<Product> result = productResource.createProducts();
        assertThat(result.size()).isGreaterThanOrEqualTo(0);
        assertThat(result.size()).isBetween(0, 30);

    }
}