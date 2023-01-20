package com.kgstrivers.productdoodle.Utils;

import com.kgstrivers.productdoodle.Model.LoginRequest;
import com.kgstrivers.productdoodle.Model.UserRegistration;
import com.kgstrivers.productdoodle.Repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    UserRegistrationRepository userRegistrationRepository;

    PasswordEncoder passwordEncoder;

    public UserLoginService(UserRegistrationRepository userRegistrationRepository) {
        this.userRegistrationRepository = userRegistrationRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public  String loginservice(LoginRequest loginRequest)
    {
        UserRegistration pickeduser = userRegistrationRepository.findUserRegistrationByemail(loginRequest.getUsername());
        if(pickeduser == null)
        {
            return "Invalid Username";
        }
        String pickeduserhashpass = pickeduser.getPassword();

        if(passwordEncoder.matches(loginRequest.getPassword(),pickeduserhashpass))
        {
            return "Login Successful";
        }
        else{
            return "Invalid Password";
        }
    }


}
