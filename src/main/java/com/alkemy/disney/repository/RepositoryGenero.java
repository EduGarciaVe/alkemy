package com.alkemy.disney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alkemy.disney.model.Genero;

@Repository
public interface RepositoryGenero extends JpaRepository<Genero, Long>{

}
