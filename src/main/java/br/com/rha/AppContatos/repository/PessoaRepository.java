package br.com.rha.AppContatos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rha.AppContatos.modelo.Pessoa;


@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	Optional<Pessoa> findBynome(String nome);
	Optional<Pessoa> findBymala(String nome);
}
