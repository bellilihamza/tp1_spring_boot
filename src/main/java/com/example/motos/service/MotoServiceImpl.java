package com.example.motos.service;

import com.example.motos.Moto;
import com.example.motos.repos.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoServiceImpl implements MotoService {

    @Autowired
    private MotoRepository motoRepository;

    @Override
    public Moto saveMoto(Moto moto) {
        return motoRepository.save(moto);
    }

    @Override
    public Moto updateMoto(Moto moto) {
        return motoRepository.save(moto);
    }

    @Override
    public void deleteMoto(Moto moto) {
        motoRepository.delete(moto);
    }

    @Override
    public void deleteMotoById(Long id) {
        motoRepository.deleteById(id);
    }

    public Moto getProduit(Long id) {
        return motoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Moto> getAllMotos() {
        return motoRepository.findAll();
    }
	@Override
    public Page<Moto> getAllMotosParPage(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return motoRepository.findAll(pageable);
    }

	@Override
	public Moto getMoto(Long id) {
        return (Moto) motoRepository.findAll();

	}

	

}
