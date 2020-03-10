package com.andrealves.socialbooks.handle;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.andrealves.socialbooks.domain.DetalhesErro;
import com.andrealves.socialbooks.services.exception.LivroNaoEncontraddoException;

@ControllerAdvice
public class ResourceExceptionHandle {
	
	@ExceptionHandler(LivroNaoEncontraddoException.class)
	public ResponseEntity<DetalhesErro> handleLivroNaoEncontradoException
						(LivroNaoEncontraddoException e, HttpServletRequest request){
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404l);
		erro.setTitulo("O livro não pode ser encontrado");
		erro.setMensagemDesenvolvedor("http://erros.socialbooks.com/404");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}

}
