package com.javaweb.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="authentification")
public class Authentification implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "login", length = 65)
	private String login;

	@Column(name = "pwd", length = 64)
	private String password;

	@Column(name = "role")
	private String role;
	
	@OneToOne
	@JoinColumn(name = "utilisateur_id")
	private Utilisateur utilisateur;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Utilisateur getUser() {
		return utilisateur;
	}

	public void setUser(Utilisateur user) {
		this.utilisateur = user;
	}
	
}
