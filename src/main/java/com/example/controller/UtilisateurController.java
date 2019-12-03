package com.example.controller;

import com.example.modele.Utilisateur;
import com.example.service.UtilisateurService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurController {

    UtilisateurService utilisateurService = UtilisateurService.getInstance();

    @GetMapping("/utilisateur/{id}")
    public Utilisateur getUtilisateur(@PathVariable int id){
        return utilisateurService.getUtilisateurById(id);
    }
}
