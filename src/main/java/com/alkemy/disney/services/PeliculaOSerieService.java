package com.alkemy.disney.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alkemy.disney.model.PeliculaOSerie;
import com.alkemy.disney.repository.RepositoryPeliculaOSerie;

@Service
public class PeliculaOSerieService {
	
	private final RepositoryPeliculaOSerie repoPOS;

	public PeliculaOSerieService(RepositoryPeliculaOSerie repoPOS) {
		super();
		this.repoPOS = repoPOS;
	}
	
	public List<PeliculaOSerie> listaPeliOSerie (){
		return repoPOS.findAll();
	}
}
