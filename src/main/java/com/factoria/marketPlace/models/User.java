package com.factoria.marketPlace.models;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String userName;
    private String email;
    private String password;

}
