package com.yeditepe.comp301.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String street;
    private String city;
    private String state;
    @OneToOne(mappedBy = "adress")
    private User user;
}
