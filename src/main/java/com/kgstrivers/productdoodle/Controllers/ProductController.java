package com.kgstrivers.productdoodle.Controllers;

import com.kgstrivers.productdoodle.DTO.ProductAddRequest;
import com.kgstrivers.productdoodle.Model.Product;
import com.kgstrivers.productdoodle.Repository.OrderRepository;
import com.kgstrivers.productdoodle.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {


    @Autowired
    ProductRepository productRepository;

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody ProductAddRequest productAddRequest)
    {
       return productRepository.save(productAddRequest.getProduct());
    }

    @GetMapping("/allproducts")
    public List<Product> allproduct()
    {
        return productRepository.findAll();
    }

    @GetMapping("/product/{id}")
    public Optional<Product> getTheDataofProduct(@PathVariable  int id)
    {
        return productRepository.findById(id);
    }
}
