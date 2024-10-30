package com.yeditepe.comp301.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 15)
    private String name;
    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name= "service_id"),
            inverseJoinColumns = @JoinColumn(name ="t_id"
            )
    )
    private List<Transcaction> transcactionList;
}
