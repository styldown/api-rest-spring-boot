package com.javaweb.repository;

import java.util.ArrayList;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.javaweb.model.Factory;
import com.javaweb.model.Formation;


public interface FormationRepository extends CrudRepository<Formation, Integer> {
	@Query(value="SELECT * FROM formation  WHERE factory_id=?1",nativeQuery =true)
	ArrayList<Formation> findByFactory(int id);
	Formation findById(int id);
}
