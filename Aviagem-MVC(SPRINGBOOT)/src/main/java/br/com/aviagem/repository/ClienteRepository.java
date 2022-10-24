package br.com.aviagem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aviagem.modelo.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	 Optional<Cliente> findByEmail(String email);

}