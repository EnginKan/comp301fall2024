package com.yeditepe.comp301.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Transcaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Integer serviceCode;

    @CreatedDate
     private LocalDate timeStamp;

    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Courier courier;

    @ManyToMany(mappedBy = "transcactionList")
    private List<Service> services;
}
