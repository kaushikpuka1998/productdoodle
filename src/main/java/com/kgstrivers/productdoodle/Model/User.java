package com.kgstrivers.productdoodle.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Consumers_TBL")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    private int gender;
    private int age;
    @OneToMany(targetEntity = Order.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "User_id",referencedColumnName = "id")
    private List<Order> user_Order;

}
