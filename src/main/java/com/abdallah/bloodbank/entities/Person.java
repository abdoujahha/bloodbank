package com.abdallah.bloodbank.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@MappedSuperclass
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    protected String name;
    protected Integer age;
    protected String gender;
    protected String phone;
    protected String address;
    @ManyToOne
    protected BloodGroup bloodGroup;
}
