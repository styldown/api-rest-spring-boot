package com.javaweb.service;





import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.model.Authentification;
import com.javaweb.model.Utilisateur;
import com.javaweb.repository.AuthentificationRepository;



@Transactional
@Service("authentificationService")
public class AuthentificationService implements IAuthentificationService {
	@Autowired
	AuthentificationRepository auth;
	
	@Override
	public Authentification findByLogin(String login) {
		return auth.findByLogin(login);
	}

	
}
