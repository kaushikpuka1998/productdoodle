package com.kgstrivers.productdoodle.DTO;

import com.kgstrivers.productdoodle.Model.UserRegistration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class UserRegsitrationRequest {

    private UserRegistration userRegistration;
}
