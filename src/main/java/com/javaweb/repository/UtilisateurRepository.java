package com.javaweb.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.model.Utilisateur;



public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
	
	Utilisateur findById(int id);
	 
}

