package com.javaweb.repository;

import java.util.ArrayList;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.javaweb.model.Formation;
import com.javaweb.model.Stagiaire;


public interface StagiaireRepository extends JpaRepository<Stagiaire, Integer> {
	@Query(value="SELECT * FROM stagiaire  WHERE formation_id=?1",nativeQuery =true)
	ArrayList<Stagiaire> findByFormation(int id);
	Stagiaire findById(int id);
}
