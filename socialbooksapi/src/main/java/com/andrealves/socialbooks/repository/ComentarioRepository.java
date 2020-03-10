package com.andrealves.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrealves.socialbooks.domain.Comentarios;

public interface ComentarioRepository extends JpaRepository<Comentarios, Long>{

}
