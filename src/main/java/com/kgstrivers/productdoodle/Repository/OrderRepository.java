package com.kgstrivers.productdoodle.Repository;

import com.kgstrivers.productdoodle.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
