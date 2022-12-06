package com.javaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.model.Authentification;



public interface AuthentificationRepository extends JpaRepository<Authentification, Integer> {
	
	Authentification findByLogin(String login);
}
