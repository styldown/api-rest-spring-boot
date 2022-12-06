package com.javaweb.controller;

import java.lang.annotation.Target;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.model.Utilisateur;
import com.javaweb.service.UtilisateurService;

@RestController
@RequestMapping(value="/users")
public class UtilisateurController {
	
	@Autowired
	UtilisateurService utilServ;
	
	
	
	@GetMapping(value={"/",""})
	@ResponseBody
	public ResponseEntity<List<Utilisateur>> listeUtilisateur() {
		return new ResponseEntity<List<Utilisateur>>(utilServ.findAll(), HttpStatus.FOUND); 
	}
	
	@GetMapping(value="/{idUtilisateur}")
	@ResponseBody
	public ResponseEntity<Utilisateur> getUtilisateur(@PathVariable int idUtilisateur) {
		
		return new ResponseEntity<Utilisateur>(utilServ.findById(idUtilisateur), HttpStatus.FOUND); 
	}
	
}
