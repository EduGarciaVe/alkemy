package com.alkemy.disney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alkemy.disney.model.Personaje;

@Repository
public interface RepositoryPersonaje extends JpaRepository<Personaje, Long>{

}
