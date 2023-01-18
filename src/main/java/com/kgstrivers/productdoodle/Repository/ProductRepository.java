package com.kgstrivers.productdoodle.Repository;

import com.kgstrivers.productdoodle.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
