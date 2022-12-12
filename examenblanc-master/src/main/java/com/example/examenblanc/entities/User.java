package com.example.examenblanc.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class User {


    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomUser;
    private String prenomUser;
    private String login;
    private String pwd;

    @OneToMany(cascade =  CascadeType.ALL)
    private Set<VirtualMachine> virtualMachine;


}
