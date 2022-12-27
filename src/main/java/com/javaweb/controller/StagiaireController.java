package com.javaweb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javaweb.model.Formation;
import com.javaweb.model.Stagiaire;
import com.javaweb.service.FormationService;
import com.javaweb.service.StagiaireService;

@Controller
@RequestMapping("stagiaires")
public class StagiaireController {
	@Autowired
	StagiaireService stagService;
	
	@GetMapping(path="/liststagiaire/{idFormation}")
	@ResponseBody
	public List<Stagiaire> ListStagiaireByFormation(@PathVariable("idFormation") int idFormation) {
		List<Stagiaire> stagiaires=stagService.findByFormation(idFormation);
		return stagiaires;
		
	}
}
