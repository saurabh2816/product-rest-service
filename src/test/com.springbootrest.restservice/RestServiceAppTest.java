package com.springbootrest.restservice;

import com.springbootrest.restservice.entity.Product;
import com.springbootrest.restservice.repository.ProductRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RestServiceAppTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testing() {

//        final Product prod = new Product();
//        prod.setName("Saurabh - The Great");
//        prod.setId(1L);
//        prod.setPrice(10000);
//        productRepository.save(prod);

        List<Product> p = productRepository.findAll();

        Assert.assertEquals("size check", 2, p.size());
        Assert.assertEquals("Name check", "Mouse", p.get(0).getName());
        Assert.assertEquals("Name check", "Keyboard", p.get(1).getName());


    }
}
