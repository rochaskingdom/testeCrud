package br.com.vinicius.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vinicius.entities.Gestor;
import br.com.vinicius.repositories.GestorRepositorio;

@RestController
@RequestMapping("/api")
public class GestorController {

	@Autowired
	private GestorRepositorio gestorRepositorio;
	
	@GetMapping("/gestores")
	public List<Gestor> getGestor() {
		return gestorRepositorio.findAll();
	}
	
	@GetMapping("/gestor/{id}")
	public Gestor getGestor(@PathVariable Long id) {
		gestorRepositorio.findById(id);
		return null;
	}
	
	@DeleteMapping("/gestor/{id}")
	public boolean deleteGestor(@PathVariable Long id) {
		gestorRepositorio.deleteById(id);
		return true;
	}
	
	@PutMapping("/gestor")
	public Gestor updateGestor(Gestor gestor) {
		return gestorRepositorio.save(gestor);
	}
	
	@PostMapping("/gestor")
	public Gestor createGestor(Gestor gestor) {
		return gestorRepositorio.save(gestor);
	}
	

	
}
