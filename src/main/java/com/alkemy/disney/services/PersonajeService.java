package com.alkemy.disney.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alkemy.disney.model.Personaje;
import com.alkemy.disney.repository.RepositoryPersonaje;

@Service
public class PersonajeService {
	private final RepositoryPersonaje repoPersonaje;

	public PersonajeService(RepositoryPersonaje repoPersonaje) {
		super();
		this.repoPersonaje = repoPersonaje;
	}
	
	public List<Personaje> listPersonaje (){
		return repoPersonaje.findAll();
	}
	
	
	
}
