package com.andrealves.socialbooks.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.andrealves.socialbooks.domain.Comentarios;
import com.andrealves.socialbooks.domain.Livro;
import com.andrealves.socialbooks.repository.ComentarioRepository;
import com.andrealves.socialbooks.repository.LivrosRepository;
import com.andrealves.socialbooks.services.exception.LivroNaoEncontraddoException;

@Service
public class LivrosService {
	
	@Autowired
	private LivrosRepository livrosRepository;
	
	@Autowired
	private ComentarioRepository comentariosRepository;
	
	public List<Livro> listar(){
		return livrosRepository.findAll();
	}
	
	public Object buscar(long id) {
		Optional<Livro> livro = livrosRepository.findById(id);
		
		if (livro == null) {
			throw new LivroNaoEncontraddoException("O livro não foi encontrado.");
		}
		
		return livro;
	}
	
	public Livro salvar(Livro livro) {
		livro.setId(null);
		livro = livrosRepository.save(livro);
		
		return livro;
	}
	
	public void deletar(Long id) {
		try {
			livrosRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new LivroNaoEncontraddoException("O livro não pode ser encontrado");
		}
	}
	
	public void atualizar(Livro livro) {
		verificarExistencia(livro);
		livrosRepository.save(livro);
	}
	
	private void verificarExistencia(Livro livro) {
		buscar(livro.getId());
	}
	
	public Comentarios salvarComentario(Long livroId, Comentarios comentario) {
		Livro livro = (Livro) buscar(livroId);
		
		comentario.setLivro(livro);
		comentario.setData(new Date());
		return comentariosRepository.save(comentario);
	}
	
	public List<Comentarios> listar(Long livroId){
		Livro livro = (Livro) buscar(livroId);
		
		return livro.getComentarios();
	}

}
