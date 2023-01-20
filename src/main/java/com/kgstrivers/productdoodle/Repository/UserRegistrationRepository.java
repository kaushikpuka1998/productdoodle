package com.kgstrivers.productdoodle.Repository;

import com.kgstrivers.productdoodle.Model.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Integer> {
    public UserRegistration findUserRegistrationByemail(String email);
}
