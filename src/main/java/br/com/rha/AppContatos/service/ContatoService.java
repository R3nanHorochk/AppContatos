package br.com.rha.AppContatos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.rha.AppContatos.modelo.Contato;
import br.com.rha.AppContatos.modelo.Pessoa;
import br.com.rha.AppContatos.repository.ContatoRepository;
import br.com.rha.AppContatos.repository.PessoaRepository;


public class ContatoService {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	//CRUD Post
	
	public Contato gravar(Contato contato) {
		if(contato.getPessoa().getId() != null) {
			Optional<Pessoa> findPessoa = pessoaRepository.findById(contato.getPessoa().getId());
			if(findPessoa.isEmpty()) {
				System.out.println("Pessoa não encontrada");
				return null;
			}else {
				contato.setPessoa(findPessoa.get());
				return contatoRepository.save(contato);
			}
		}else {
			System.out.println("Pessoa não existe");
			return null;
		}
	}
	
	//CRUD Get
	
	public Optional<Contato> acharId(Long id){
		return contatoRepository.findById(id);
	}

	
	public List<Contato> acharTodos(){
		return contatoRepository.findAll();
		}
	
	public Optional<Contato> acharTodosId(Long id){
		return contatoRepository.findById(id);
	}
	
	//CRUD Update
	
	public Contato update(Contato contato) {
	//regra de negocio
	//verificar se existe; se existir autalizar;
	//caso não insere de novo
	Optional<Contato> findContato = contatoRepository.findById(contato.getId());
	
		if(findContato.isPresent()) {
			//crio um novo objeto de produtos e lanco dados
			//do objeto que vei da internet
			Contato updContato = findContato.get(); //setId
			updContato.setContato(contato.getContato());
			updContato.setTipoContato(contato.getTipoContato());
			return contatoRepository.save(updContato); //Update
		}
		return contatoRepository.save(contato);
	}
	
	//CRUD Delete
		public void delete(Long id) {
			contatoRepository.deleteById(id);
		}
}
