package com.kgstrivers.productdoodle.Controllers;

import com.kgstrivers.productdoodle.DTO.UserRegsitrationRequest;
import com.kgstrivers.productdoodle.DTO.UsersOrderResponse;
import com.kgstrivers.productdoodle.Model.UserRegistration;
import com.kgstrivers.productdoodle.Repository.CustomerRepository;
import com.kgstrivers.productdoodle.Repository.UserRegistrationRepository;
import com.kgstrivers.productdoodle.Utils.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    UserRegistrationService userRegistrationService;
    @PostMapping("/registeruser")
    public UserRegistration registeruser(@RequestBody UserRegistration userRegistration)
    {

        return userRegistrationService.registration(userRegistration);
    }

}
