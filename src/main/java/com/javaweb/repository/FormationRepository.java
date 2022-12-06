package com.javaweb.repository;

import java.util.ArrayList;


import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.model.Factory;
import com.javaweb.model.Formation;


public interface FormationRepository extends JpaRepository<Formation, Integer> {
	ArrayList<Formation> findByFactory(Factory fac);
	Formation findById(int id);
}
