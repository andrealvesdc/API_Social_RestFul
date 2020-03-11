package com.andrealves.socialbooks.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.crypto.Data;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private Data nascimento;
	
	private String nacionalidade;
	
	@OneToMany(mappedBy = "autor")
	@JsonIgnore
	private List<Livro> livros;

	
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

	public Data getNascimento() {
		return nascimento;
	}

	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
	
}
