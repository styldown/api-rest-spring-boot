package com.javaweb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.javaweb.model.Utilisateur;

public interface IUtilisateurService {
	Utilisateur findById(int id);
	void save(Utilisateur utilisateur);
	List<Utilisateur> findAll();
	Utilisateur findUserByLogin(String login);
}	
