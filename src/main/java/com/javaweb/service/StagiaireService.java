package com.javaweb.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.model.Formation;
import com.javaweb.model.Stagiaire;
import com.javaweb.repository.StagiaireRepository;



@Transactional
@Service
public class StagiaireService implements IStagiaireService {

	@Autowired
	StagiaireRepository stagiaireRepos;
	
	@Override
	public ArrayList<Stagiaire> findByFormation(int id) {
		return stagiaireRepos.findByFormation(id);
	}

	@Override
	public Stagiaire findById(int id) {
		Stagiaire stagiaire=stagiaireRepos.findById(id);
		return stagiaire;
	}

	@Override
	public void save(Stagiaire stag) {
		stagiaireRepos.save(stag);
	}

}
