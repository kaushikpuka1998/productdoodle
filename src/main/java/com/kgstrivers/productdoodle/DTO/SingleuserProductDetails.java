package com.kgstrivers.productdoodle.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SingleuserProductDetails {

    private int product_id;
    private int quantity;
    private int user_id;

    private String name;
}
