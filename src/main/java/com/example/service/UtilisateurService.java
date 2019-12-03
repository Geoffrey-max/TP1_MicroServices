package com.example.service;

import com.example.modele.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurService {

        //list of blog posts
        private List<Utilisateur> utilisateurs;

        private static UtilisateurService instance = null;
        public static UtilisateurService getInstance(){
            if(instance == null){
                instance = new UtilisateurService();
            }
            return instance;
        }


        public UtilisateurService(){
            utilisateurs = new ArrayList<Utilisateur>();
            utilisateurs.add(new Utilisateur(1, "Geoffrey", "Clermont", "sisi"));
            utilisateurs.add(new Utilisateur(2, "Geoffrey", "Clermont", "sisi"));
            utilisateurs.add(new Utilisateur(3, "Geoffrey", "Clermont", "sisi"));
            utilisateurs.add(new Utilisateur(4, "Geoffrey", "Clermont", "sisi"));
            utilisateurs.add(new Utilisateur(5, "Geoffrey", "Clermont", "sisi"));
        }

        // return all blogs
        public List<Utilisateur> fetchBlogs() {
            return utilisateurs;
        }

        // return utilisateur by id
        public Utilisateur getUtilisateurById(int id) {
            for(Utilisateur b: utilisateurs) {
                if(b.getId() == id) {
                    return b;
                }
            }
            return null;
        }
}
