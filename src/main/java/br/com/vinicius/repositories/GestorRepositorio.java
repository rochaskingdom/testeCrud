package br.com.vinicius.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vinicius.entities.Gestor;

public interface GestorRepositorio extends JpaRepository<Gestor, Long> {

}
