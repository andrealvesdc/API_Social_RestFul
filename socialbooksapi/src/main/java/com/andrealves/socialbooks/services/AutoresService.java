package com.andrealves.socialbooks.services;

import java.util.List;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;

import com.andrealves.socialbooks.domain.Autor;
import com.andrealves.socialbooks.repository.AutoresRepository;

public class AutoresService {
	
	@Autowired
	private AutoresRepository autoresRepository;
	
	public List<Autor> listar(){
		return autoresRepository.findAll();
	}
	
	public Autor salvar(Autor autor) throws AuthenticationException {
		
		if(autor.getId() != null) {
			Object a =  autoresRepository.findById(autor.getId());
			
			if(a != null) {
				throw new AuthenticationException("O autor não existe");
			}

		}
		return autoresRepository.save(autor);
	}

}
