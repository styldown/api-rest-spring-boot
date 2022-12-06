package com.javaweb.service;

import com.javaweb.model.Authentification;

public interface IAuthentificationService {
	Authentification findByLogin(String login);
}
