package com.Devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Devsuperior.dsmovie.entities.User;

public interface UserRepository extends JpaRepository <User,Long>{

	User findByEmail (String email);
}
