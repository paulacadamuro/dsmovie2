package com.Devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Devsuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository <Movie,Long>{

}
