package com.ct.CrudThymeleaf.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false, length=50)
    private String name;
	@Column(name = "apellido", nullable = false, length=50)
    private String apellido;
	@Column(name = "cedula", nullable = false, length=50)
    private String cedula;
	@Column(name = "Telefono", nullable = false, length=50)
    private String Telefono;
    @Column(name = "email", nullable = false, length=80, unique=true)
    private String email;

    public User() {
    }

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
