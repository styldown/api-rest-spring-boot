package com.javaweb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.model.Utilisateur;
import com.javaweb.repository.AuthentificationRepository;
import com.javaweb.repository.UtilisateurRepository;



@Transactional
@Service
public class UtilisateurService implements IUtilisateurService{
	@Autowired 
	UtilisateurRepository util;
	@Override
	public Utilisateur findById(int id) {
		return util.findById(id);
	}
	@Override
	public void save(Utilisateur utilisateur) {
		util.save(utilisateur);
		
	}
	@Override
	public List<Utilisateur> findAll() {
		return util.findAll();
	}
	@Override
	public Utilisateur findUserByLogin(String login) {
		// TODO Auto-generated method stub
		return util.findUserByLogin(login);
	} 
	
}
