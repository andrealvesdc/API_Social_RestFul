package com.andrealves.socialbooks.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.andrealves.socialbooks.domain.Autor;
import com.andrealves.socialbooks.services.AutoresService;

public class AutoresResources {
	
	private AutoresService autoresService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Autor>> listar(){
		return ResponseEntity.status(HttpStatus.OK).body(autoresService.listar());
	}

}
