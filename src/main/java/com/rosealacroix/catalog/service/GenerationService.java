package com.rosealacroix.catalog.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosealacroix.catalog.entity.Generation;
import com.rosealacroix.catalog.repository.GenerationRepository;

@Service
public class GenerationService {
	
	@Autowired
	private GenerationRepository generationRepository;
	
	public List<Generation> getAll() {
		return generationRepository.findAll();
	}
	
	@Transactional
	public void save(Generation generation) {
		generationRepository.save(generation);
	}

}