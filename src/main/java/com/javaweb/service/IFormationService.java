package com.javaweb.service;

import java.util.ArrayList;

import com.javaweb.model.Factory;
import com.javaweb.model.Formation;

public interface IFormationService {
	
	Formation findById(int id);
	ArrayList<Formation> findByFactory(int id);
	public Formation save(Formation formation);
}
