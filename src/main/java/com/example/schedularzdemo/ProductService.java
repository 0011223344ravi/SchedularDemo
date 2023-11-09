package com.example.schedularzdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepository;
  @Scheduled(cron = "*/5 * * * * *")
    public void addProduct() {
        Product p  = new Product(new Random().nextInt(12),
                "user"+new Random().nextInt(12));
         productRepository.save(p);
        System.out.println("Product with id " + p.getId() + " is added to database at time " + new Date());
    }
    @Scheduled(cron = "*/15 * * * * *")
    public void displayProducts() {

        List<Product> products=  productRepository.findAll();
        System.out.println("all products in db are " +products.size() +"at time "+new Date());    }

}
