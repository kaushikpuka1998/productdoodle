package com.kgstrivers.productdoodle.Controllers;

import com.kgstrivers.productdoodle.DTO.UserRegsitrationRequest;
import com.kgstrivers.productdoodle.DTO.UsersOrderResponse;
import com.kgstrivers.productdoodle.Model.AuthenticationRequest;
import com.kgstrivers.productdoodle.Model.AuthenticationResponse;
import com.kgstrivers.productdoodle.Model.UserRegistration;
import com.kgstrivers.productdoodle.Repository.CustomerRepository;
import com.kgstrivers.productdoodle.Repository.UserRegistrationRepository;
import com.kgstrivers.productdoodle.Utils.JwtUtils;
import com.kgstrivers.productdoodle.Utils.MyUserDetailsService;
import com.kgstrivers.productdoodle.Utils.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    AuthenticationManager authenticationManager;


    @Autowired
    UserRegistrationService userRegistrationService;

    @Autowired
    MyUserDetailsService myUserDetailsService;



    @Autowired
    JwtUtils jwtUtils;

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthToken(@RequestBody AuthenticationRequest authenticationRequest) throws  Exception
    {
       try{
           authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword()));
       }
       catch(BadCredentialsException e)
       {
           throw new Exception("Incorrect Username & Password ISSUE:"+e);
       }

       final UserDetails userDetails = myUserDetailsService.loadUserByUsername(authenticationRequest.getUsername());
       final String jwt = jwtUtils.generateToken(userDetails);


       return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
    @PostMapping("/registeruser")
    public UserRegistration registeruser(@RequestBody UserRegistration userRegistration)
    {

        return userRegistrationService.registration(userRegistration);
    }

}
