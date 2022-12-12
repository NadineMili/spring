package com.example.examenblanc.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class DataCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDs;
    private String region;
    private Date dateFabrication;
    private int capaciteDisque;
    public int espaceLibreDisque;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dataCenter")
    private Set
            <VirtualMachine> virtualMachine;
}
