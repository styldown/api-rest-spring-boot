package com.javaweb.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.model.Factory;
import com.javaweb.model.Formation;
import com.javaweb.service.FormationService;



@RestController
public class FormationController {
	@Autowired
	FormationService formService;
	
	Factory fact;

	@ModelAttribute("listFormation")
	public ArrayList<Formation> addListFormationToModel(HttpSession session){
		Factory fac=(Factory) session.getAttribute("factory");
		fact=fac;
		return formService.findByFactory(fac);
	}
	
	@GetMapping(value="/listformation", produces = { MediaType.APPLICATION_JSON_VALUE, //
            MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public ResponseEntity<Collection> listeFormation(Model model) {
		@SuppressWarnings("unchecked")
		List<Formation> list=(ArrayList<Formation>)model.getAttribute("listFormation");
		for(Formation form:list) {
			System.out.println(form.getNom());
		}
		System.out.println(fact.getNom());
		return new ResponseEntity<Collection>(list, HttpStatus.FOUND);
	}
}
