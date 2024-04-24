package com.example.motos.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.motos.Moto; 
public interface MotoRepository extends JpaRepository<Moto, Long> {

}
