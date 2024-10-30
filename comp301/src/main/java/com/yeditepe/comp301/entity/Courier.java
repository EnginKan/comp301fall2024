package com.yeditepe.comp301.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
public class Courier extends User {
    @Column(length = 25)
    private String licenceNumber;
    @OneToMany
    @JoinTable(
            name ="courier_transaction",
            joinColumns = @JoinColumn(name = "courier_id"),
            inverseJoinColumns = @JoinColumn(name ="transaction_id")
    )
    private List<Transcaction> transcactions;
}
