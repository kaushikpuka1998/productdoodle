package com.kgstrivers.productdoodle.Controllers;

import com.kgstrivers.productdoodle.DTO.OrderRequest;
import com.kgstrivers.productdoodle.Model.User;
import com.kgstrivers.productdoodle.Repository.ProductRepository;
import com.kgstrivers.productdoodle.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController{


    @Autowired
    ProductRepository productRepository;
    @Autowired
    UserRepository userRepository;
    @GetMapping("/welcome")
    public String welcome()
    {
        return "Welcome";
    }

    @PostMapping("/addorder")
    public User addOrder(@RequestBody OrderRequest orderRequest)
    {
        return userRepository.save(orderRequest.getUser());

    }

    @GetMapping("/allorder")
    public List<User> findAllOrder()
    {
        return userRepository.findAll();
    }
}
