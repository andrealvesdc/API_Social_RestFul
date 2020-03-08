package com.andrealves.socialbooks.domain;

import java.util.Date;
import java.util.List;

public class Livro {
	
	private Long id;
	private String nome;
	private String editora;
	private String resumo;
	private String autor;	
	private Date publicacao;
	private List<Comentarios> comentarios;
	
	public Livro() {
	}
	
	public Livro(String nome) {
		this.nome = nome;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Date getPublicacao() {
		return publicacao;
	}
	public void setPublicacao(Date publicacao) {
		this.publicacao = publicacao;
	}
	public List<Comentarios> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<Comentarios> comentarios) {
		this.comentarios = comentarios;
	}
	
}
