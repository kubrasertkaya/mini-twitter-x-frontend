package com.workintech.twitter.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user",schema = "spring")
@Data
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "full_name")
    private String fullName;
    @Column(name="email")
    private String email;
    @Column(name = "password")
    private String password;
}
