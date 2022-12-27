package com.javaweb.controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.model.Formation;
import com.javaweb.model.Utilisateur;
import com.javaweb.service.FormationService;
import com.javaweb.service.UtilisateurService;


@Controller
@RequestMapping("formations")
public class FormationController {
	@Autowired
	FormationService formService;
	@Autowired
	UtilisateurService util;
	
	@GetMapping(path="/test")
	@ResponseBody
	public Utilisateur test() {
		String test=SecurityContextHolder.getContext().getAuthentication().getName();
		Utilisateur user=util.findUserByLogin(test);
		return user;
	}
	
	@GetMapping(path="/list-formation/{id}")
	@ResponseBody
	public List<Formation> listeFormation(@PathVariable("id") int id) {
		System.out.println("test ok");
		List<Formation> list= formService.findByFactory(id);
		for(Formation form:list) {
			System.out.println(form.getNom());
		}
		return list;
	}
}
