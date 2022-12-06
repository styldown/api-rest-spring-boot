package com.javaweb.service;

import java.util.ArrayList;

import com.javaweb.model.Formation;
import com.javaweb.model.Stagiaire;



public interface IStagiaireService {
	ArrayList<Stagiaire> findByFormation(Formation form);
	Stagiaire findById(int id);
	void save(Stagiaire stag);
}
