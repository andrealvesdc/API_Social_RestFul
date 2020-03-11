package com.andrealves.socialbooks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.andrealves.socialbooks.domain.Autor;
import com.andrealves.socialbooks.repository.AutoresRepository;

public class AutoresService {
	
	@Autowired
	private AutoresRepository autoresRepository;
	
	public List<Autor> listar(){
		return autoresRepository.findAll();
	}

}
