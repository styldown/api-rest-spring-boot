package com.javaweb.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.javaweb.model.Utilisateur;

import com.javaweb.service.UtilisateurService;


@RestController("/")
public class BasicAuthController {

	/*@GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE, //
            MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<String> pong() {
		System.out.println("n,bxc");
		return new ResponseEntity<String>("Réponse du serveur: " + HttpStatus.OK.name(), HttpStatus.OK);
	}*/
	@Autowired
	UtilisateurService util;
	@GetMapping ( path  =  "/basicauth" )
	public  Utilisateur  basicauth () {
		String test=SecurityContextHolder.getContext().getAuthentication().getName();
		Utilisateur user=util.findUserByLogin(test);
		System.out.println(user.getFactory().getNom());
	return user;
		     }
}
