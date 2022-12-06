package com.javaweb.repository;

import java.util.ArrayList;


import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.model.Formation;
import com.javaweb.model.Stagiaire;


public interface StagiaireRepository extends JpaRepository<Stagiaire, Integer> {
	ArrayList<Stagiaire> findByFormation(Formation form);
	Stagiaire findById(int id);
}
