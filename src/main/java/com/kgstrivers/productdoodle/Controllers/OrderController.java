package com.kgstrivers.productdoodle.Controllers;

import com.kgstrivers.productdoodle.DTO.OrderRequest;
import com.kgstrivers.productdoodle.DTO.SingleuserProductDetails;
import com.kgstrivers.productdoodle.DTO.UsersOrderResponse;
import com.kgstrivers.productdoodle.Model.Order;
import com.kgstrivers.productdoodle.Model.Product;
import com.kgstrivers.productdoodle.Model.User;
import com.kgstrivers.productdoodle.Repository.CustomerRepository;
import com.kgstrivers.productdoodle.Repository.OrderRepository;
import com.kgstrivers.productdoodle.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController{


    @Autowired
    ProductRepository productRepository;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    CustomerRepository userRepository;
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

    @GetMapping("/getorderbyuser/{id}")
    Optional<List<UsersOrderResponse>> getlistofusersorder(@PathVariable int id)
    {
        return userRepository.findalluserorder(id);
    }

    @GetMapping("/getorderdetailsbyuser/{id}")
    Optional<List<SingleuserProductDetails>> getlistofusersorderdetails(@PathVariable int id)
    {
        return userRepository.findallorderDeatils(id);
    }
    @GetMapping("/allorder")
    public List<User> findAllOrder()
    {
        return userRepository.findAll();
    }
}
