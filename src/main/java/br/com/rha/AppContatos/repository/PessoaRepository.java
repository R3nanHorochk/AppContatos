package br.com.rha.AppContatos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.rha.AppContatos.Records.PessoaRecord;
import br.com.rha.AppContatos.modelo.Pessoa;


@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	Optional<Pessoa> findBynome(String nome);
	
	@Query("select new br.com.rha.AppContatos.Records.PessoaRecord(p.id,p.nome, p.endereco) from Pessoa p")
	PessoaRecord findbyIdmala(Long id);
}
