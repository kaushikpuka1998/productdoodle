package com.kgstrivers.productdoodle.Repository;

import com.kgstrivers.productdoodle.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
