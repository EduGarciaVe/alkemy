package com.alkemy.disney.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alkemy.disney.model.Genero;
import com.alkemy.disney.repository.RepositoryGenero;

@Service
public class GeneroService {
	
	private final RepositoryGenero repoG;

	public GeneroService(RepositoryGenero repoG) {
		super();
		this.repoG = repoG;
	}
	
	public List<Genero> listaGenero(){
		return repoG.findAll();
	}
}
