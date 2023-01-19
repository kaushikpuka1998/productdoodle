package com.kgstrivers.productdoodle.Repository;

import com.kgstrivers.productdoodle.DTO.SingleuserProductDetails;
import com.kgstrivers.productdoodle.DTO.UsersOrderResponse;
import com.kgstrivers.productdoodle.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<User,Integer> {

    @Query( "SELECT new com.kgstrivers.productdoodle.DTO.UsersOrderResponse(g.product_id,g.quantity,u.id) from User u JOIN u.user_Order g on  u.id = ?1")
    Optional<List<UsersOrderResponse>> findalluserorder(int user_id);


    @Query( "SELECT new com.kgstrivers.productdoodle.DTO.SingleuserProductDetails(g.product_id,g.quantity,u.id,p.name) from User u JOIN u.user_Order g on  u.id = ?1 JOIN Product p on g.product_id = p.id ")
    Optional<List<SingleuserProductDetails>> findallorderDeatils(int user_id);
}
