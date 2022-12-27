package com.javaweb.service;

import java.util.List;

import com.javaweb.model.Authentification;
import com.javaweb.model.Utilisateur;

public interface IAuthentificationService {
	Authentification findByLogin(String login);
	
}
