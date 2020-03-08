package com.andrealves.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrealves.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{

}
