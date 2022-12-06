package com.javaweb.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

	@GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE, //
            MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<String> pong() {
		System.out.println("n,bxc");
		return new ResponseEntity<String>("Réponse du serveur: " + HttpStatus.OK.name(), HttpStatus.OK);
	}
	@RestController
	public class UserController {

	    @RequestMapping("/login")
	    public boolean login(@RequestBody User user) {
	    	System.out.println("fait");
	        return
	          user.getName().equals(user.getName()) && user.getPassword().equals("password");
	    }
	}
}
