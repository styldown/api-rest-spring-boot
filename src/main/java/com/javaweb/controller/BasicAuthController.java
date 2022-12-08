package com.javaweb.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bean.AuthenticationBean;

@RestController
@RequestMapping("/")
public class BasicAuthController {

	/*@GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE, //
            MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<String> pong() {
		System.out.println("n,bxc");
		return new ResponseEntity<String>("Réponse du serveur: " + HttpStatus.OK.name(), HttpStatus.OK);
	}*/
	 @GetMapping ( path  =  "/basicauth" )
	 public  AuthenticationBean  basicauth () {
	 System.out.println("fait");
	 return  new  AuthenticationBean ( " Vous êtes authentifié " );
		     }
}
