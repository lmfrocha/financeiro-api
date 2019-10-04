package br.com.financeiro.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.financeiro.api.model.Categoria;
import br.com.financeiro.api.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public ResponseEntity<?> listar() {
		List<Categoria> result = categoriaRepository.findAll();
		return !result.isEmpty() ? ResponseEntity.ok(result) : ResponseEntity.notFound().build();
	}
}
