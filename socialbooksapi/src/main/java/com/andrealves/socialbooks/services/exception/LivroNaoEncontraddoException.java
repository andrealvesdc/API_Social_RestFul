package com.andrealves.socialbooks.services.exception;

public class LivroNaoEncontraddoException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public LivroNaoEncontraddoException(String mensagem) {
		super(mensagem);
	}
	
	public LivroNaoEncontraddoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
