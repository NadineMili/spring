package com.example.examenblanc.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class VirtualMachine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVm;
    private String os;
    private int tailleDisque;
    @Enumerated(EnumType.STRING)
    private Etat etat;

    @ManyToOne
    DataCenter dataCenter;
}
