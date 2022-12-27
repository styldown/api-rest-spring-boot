package com.javaweb.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.javaweb.model.Utilisateur;



public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
	
	Utilisateur findById(int id);
	@Query(value="SELECT * FROM utilisateur e  WHERE e.id=(SELECT utilisateur_id FROM authentification where login=?1)",nativeQuery =true)
	Utilisateur findUserByLogin(String login);
	 
}

