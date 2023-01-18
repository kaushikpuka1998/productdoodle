package com.kgstrivers.productdoodle.DTO;


import com.kgstrivers.productdoodle.Model.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductAddRequest {
    Product product;
}
