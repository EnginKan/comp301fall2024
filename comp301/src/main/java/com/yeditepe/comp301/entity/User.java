package com.yeditepe.comp301.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
/*@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor*/
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 32,name = "Email")
    private String email;
    @Column(length = 64,name ="full_name")
    private String fullName;

    private LocalDate dob;
    @OneToOne(cascade = CascadeType.ALL)
    private Adress adress;


}
