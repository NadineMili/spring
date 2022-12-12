package com.example.examenblanc.service;

import com.example.examenblanc.entities.User;
import com.example.examenblanc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    public UserRepository userRepository;
    @Override
    public void ajouterUtilisateur(User u) {
        userRepository.save(u);
    }
}
