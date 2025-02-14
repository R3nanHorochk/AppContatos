package br.com.rha.AppContatos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rha.AppContatos.Records.PessoaRecord;
import br.com.rha.AppContatos.modelo.Pessoa;
import br.com.rha.AppContatos.repository.PessoaRepository;



@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	//CRUD  CREATE 
	public Pessoa save(Pessoa pessoa) {
		
		if(pessoa.getNome() == null) {
			System.out.println("Nome vazio");
			return null;
		}try {
			return pessoaRepository.save(pessoa);//vai retornar o produto que salvou
			//vai para o banco de dado 'INSERT INTO tb_produtos(nome,codigobarra,valor)	
			//values(produto.getnome(),produto.getcodigobarra(),produto.getvalor());
		}catch(Exception e) {
			System.out.println("Erro ao inserir pessoa " + pessoa.toString() + ":" + e.getMessage());
			return null;
		}
		
		
	}
	//CRUD READ
	public Optional<Pessoa> findById(Long id){
				return pessoaRepository.findById(id);
	}
	
			
	public List<Pessoa> findAll(){
			return pessoaRepository.findAll();
		}
	
	
	public Optional<Pessoa> findBynome(String nome){
		if(nome == null) {
			System.out.println("Nome errado");
			return null;
		}else {
		return pessoaRepository.findBynome(nome);
		}
	}
	/*
	public PessoaRecord findbyIdmala(Long id){
        if(id == null) {
            System.out.println("id errado");
            return null;
        }else {
            Optional<Pessoa> pessoa = pessoaRepository.findById(id);
            String mala = pessoa.get().getEndereco() + " - " + pessoa.get().getCEP() + " - " + pessoa.get().getCidade() +"/" + pessoa.get().getUF() ;
            PessoaRecord record = new PessoaRecord(pessoa.get().getId(),pessoa.get().getNome() ,mala);
            return(record);
        }
    }
	*/
	//CRUD UPDATE
	public Pessoa update(Pessoa pessoa) {
		//regra de negocio
		//verificar se existe; se existir autalizar;
		//caso não insere de novo
		Optional<Pessoa> findPessoa = pessoaRepository.findById(pessoa.getId());
		
		if(findPessoa.isPresent()) {
			//crio um novo objeto de produtos e lanco dados
			//do objeto que vei da internet
			Pessoa updPessoa = findPessoa.get(); //setId
			updPessoa.setNome(pessoa.getNome());
			updPessoa.setCidade(pessoa.getCidade());
			updPessoa.setendereco(pessoa.getEndereco());
			updPessoa.setCEP(pessoa.getCEP());
			updPessoa.setUF(pessoa.getUF());
			return pessoaRepository.save(updPessoa); //Update
		}
		return pessoaRepository.save(pessoa);
	}
	
	
	//CRUD Delete
	public void delete(Long id) {
		pessoaRepository.deleteById(id);
	}
}
