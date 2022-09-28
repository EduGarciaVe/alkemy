package com.alkemy.disney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alkemy.disney.model.PeliculaOSerie;

@Repository
public interface RepositoryPeliculaOSerie extends JpaRepository<PeliculaOSerie, Long>{

}
