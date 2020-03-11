package com.andrealves.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrealves.socialbooks.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long>{

}
