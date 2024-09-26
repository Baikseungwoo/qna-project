package com.example.qna_.project.qna_backend.user;

import jakarta.persistence.*;


public class user {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String email;

    private String password;

    @Column(unique = true)



}
