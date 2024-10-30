package com.yeditepe.comp301.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
public class Customer extends User {

    @Column(length = 15,unique = true)
    private String phoneNumber;

    @OneToMany
    @JoinTable(
            name = "customer_transaction",
            joinColumns = @JoinColumn(name= "customer_id"),
            inverseJoinColumns = @JoinColumn(name="transcaction_id")

    )
    private List<Transcaction> transcactions;
}
