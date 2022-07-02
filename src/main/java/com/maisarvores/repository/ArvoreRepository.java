package com.maisarvores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maisarvores.model.Arvore;

@Repository
public interface ArvoreRepository extends JpaRepository<Arvore, Long>{

}
