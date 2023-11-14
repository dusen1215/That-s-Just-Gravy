package com.jordandusenbury.That.s.Just.Gravy.entity;

import jakarta.persistence.*;

import java.util.Collection;


@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "validated")
    private boolean validated;


    public User( String password, String email) {

        this.password = password;
        this.email = email;

    }

    public User() {

    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [ password=" + password + ", email =" + email + "]";
    }
}



