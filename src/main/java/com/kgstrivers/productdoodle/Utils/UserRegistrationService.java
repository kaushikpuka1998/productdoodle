package com.kgstrivers.productdoodle.Utils;

import com.kgstrivers.productdoodle.Model.UserRegistration;
import com.kgstrivers.productdoodle.Repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {


    UserRegistrationRepository userRegistrationRepository;

    PasswordEncoder passwordEncoder;

    public UserRegistrationService(UserRegistrationRepository userRegistrationRepository) {
        this.userRegistrationRepository = userRegistrationRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public UserRegistration registration(UserRegistration userRegistration)
    {
        String encodedpass = this.passwordEncoder.encode(userRegistration.getPassword());
        userRegistration.setPassword(encodedpass);
        return userRegistrationRepository.save(userRegistration);
    }
    

}
