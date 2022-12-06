    package com.javaweb.service;



import java.util.Arrays;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.javaweb.model.Authentification;

@Service("customAuthentificationDetailService")
public class CustomAuthentificationDetailService implements UserDetailsService {

		@Autowired
		private AuthentificationService authService;

		@Override
		@Transactional
		public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
			Authentification auth = Optional.ofNullable(authService.findByLogin(login))
					.orElseThrow(() -> new UsernameNotFoundException("Login " + login + " not found"));
			return new org.springframework.security.core.userdetails.User(auth.getLogin(), auth.getPassword(),
					getGrantedAuthorities(auth));
		}

		private java.util.List<SimpleGrantedAuthority> getGrantedAuthorities(Authentification user) {
			//Role role = Optional.ofNullable(user.getRole()).orElse(new Role());
			return Arrays.asList(new SimpleGrantedAuthority(user.getRole()));
		}
}
