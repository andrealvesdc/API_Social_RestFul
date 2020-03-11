package com.andrealves.socialbooks.services.exception;

public class AutorNaoEncontradoException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public AutorNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public AutorNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
