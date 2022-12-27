package com.javaweb.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javaweb.model.Authentification;
import com.javaweb.model.Utilisateur;


@Repository
@Transactional
public interface AuthentificationRepository extends CrudRepository<Authentification, Integer> {
	
	Authentification findByLogin(String login);
	
}
