package br.com.financeiro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.financeiro.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
