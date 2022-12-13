package com.example.examenblanc.controller;

import com.example.examenblanc.entities.User;
import com.example.examenblanc.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UtilisateurService utilisateurService;

    @PostMapping("/ajouter-user")
    public void ajouterUser(@RequestBody User u){
        utilisateurService.ajouterUtilisateur(u);
    }
}
