package com.andrealves.socialbooks.services;

import java.util.List;
import java.util.Optional;

import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;

import com.andrealves.socialbooks.domain.Autor;
import com.andrealves.socialbooks.repository.AutoresRepository;
import com.andrealves.socialbooks.services.exception.AutorNaoEncontradoException;

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
	
	public Optional<Autor> buscar (Long id) {
		Optional<Autor> autor = autoresRepository.findById(id);
		
		if(autor == null) {
			throw new AutorNaoEncontradoException("O autor não pode ser encontrado");
		}
		return autor;
	}

}
