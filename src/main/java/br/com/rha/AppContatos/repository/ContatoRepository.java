package br.com.rha.AppContatos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.rha.AppContatos.modelo.Contato;
import br.com.rha.AppContatos.modelo.Pessoa;



@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
	
	@Query(value ="select * from tb_contato where pessoa_id = :pessoa_id", nativeQuery = true)
	List<Contato> findAllIdpessoa(@Param("pessoa_id") Long pessoa_id);

}
