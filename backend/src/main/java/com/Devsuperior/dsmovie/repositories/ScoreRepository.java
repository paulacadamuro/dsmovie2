package com.Devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Devsuperior.dsmovie.entities.Score;
import com.Devsuperior.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository <Score, ScorePK>{

}
