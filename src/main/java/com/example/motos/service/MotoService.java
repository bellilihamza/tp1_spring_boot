package com.example.motos.service;

import com.example.motos.Moto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface MotoService {
    Moto saveMoto(Moto moto);
    Moto updateMoto(Moto moto);
    void deleteMoto(Moto moto);
    void deleteMotoById(Long id);
    Moto getMoto(Long id);
    List<Moto> getAllMotos();
	Page<Moto> getAllMotosParPage(int page, int size);
}
