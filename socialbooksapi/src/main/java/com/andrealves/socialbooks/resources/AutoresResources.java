package com.andrealves.socialbooks.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.security.sasl.AuthenticationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.andrealves.socialbooks.domain.Autor;
import com.andrealves.socialbooks.services.AutoresService;

public class AutoresResources {
	
	private AutoresService autoresService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Autor>> listar(){
		return ResponseEntity.status(HttpStatus.OK).body(autoresService.listar());
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@RequestBody Autor autor) throws AuthenticationException{
		autor = autoresService.salvar(autor);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(autor.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	
	}
	
	@RequestMapping(value = "/id", method = RequestMethod.GET)
	public ResponseEntity<Optional<Autor>> buscar(@PathVariable("id") Long id){
		return ResponseEntity.status(HttpStatus.OK).body(autoresService.buscar(id));
	}
}
