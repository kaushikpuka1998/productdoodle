package com.kgstrivers.productdoodle.DTO;


import com.kgstrivers.productdoodle.Model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private User user;
}
