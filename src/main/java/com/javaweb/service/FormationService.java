package com.javaweb.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.model.Factory;
import com.javaweb.model.Formation;
import com.javaweb.repository.FormationRepository;

@Transactional
@Service
public class FormationService implements IFormationService{
	@Autowired
	FormationRepository formationRep;

	@Override
	public ArrayList<Formation> findByFactory(int id) {  
		return formationRep.findByFactory(id);
	}

	@Override
	public Formation findById(int id) {
		return formationRep.findById(id);
	}

	public Formation save(Formation formation) {
		return formationRep.save(formation);
		  
	}
	
	
}
