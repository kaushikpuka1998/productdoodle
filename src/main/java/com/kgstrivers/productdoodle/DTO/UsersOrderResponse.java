package com.kgstrivers.productdoodle.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsersOrderResponse {
    private int product_id;
    private int quantity;
    private int user_id;
}
