package br.com.rha.AppContatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rha.AppContatos.modelo.Contato;



@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {


}
