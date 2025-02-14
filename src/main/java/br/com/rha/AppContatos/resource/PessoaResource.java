package br.com.rha.AppContatos.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rha.AppContatos.Records.PessoaRecord;
import br.com.rha.AppContatos.modelo.Pessoa;
import br.com.rha.AppContatos.repository.PessoaRepository;
import br.com.rha.AppContatos.service.PessoaService;




@RestController
@RequestMapping("/api/pessoas") 
public class PessoaResource {
	
	@Autowired
	private PessoaService pessoaService;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	

	@PostMapping // POST http://localhost:8080/api/pessoas
	public ResponseEntity<Pessoa> save(@RequestBody Pessoa pessoa) {
		Pessoa newPessoa = pessoaService.save(pessoa);
		if(newPessoa == null) {
			return ResponseEntity.badRequest().build();
		}else {
			return ResponseEntity.ok(newPessoa);
		}
	}
	
	@GetMapping("/{id}") // READ http://localhost:8080/api/pessoas/fId/{id}
	public ResponseEntity<Optional<Pessoa>> findById(@PathVariable Long id) {
		Optional<Pessoa> pessoa = pessoaService.findById(id);
		if(pessoa.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(pessoa);
		}
	}
	
	@GetMapping("/fNo/{nome}") // READ http://localhost:8080/api/pessoas/fNo/{nome}
	public ResponseEntity<Optional<Pessoa>> findBynome(@PathVariable String nome) {
		Optional<Pessoa> pessoa = pessoaService.findBynome(nome);
		if(pessoa.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(pessoa);
		}
	}
	
	@GetMapping // READ http://localhost:8080/api/pessoas/ 
	public ResponseEntity<List<Pessoa>> findAll() {
		List<Pessoa> pessoas = pessoaService.findAll();
		if(pessoas == null) {
			return ResponseEntity.badRequest().build();
		}if(pessoas.size() == 0){
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(pessoas);
		}
	}
	
	@GetMapping("/mala/{id}") // READ http://localhost:8080/api/pessoa/mala/{id}
    public ResponseEntity<PessoaRecord> findbyIdmala(@PathVariable Long id) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(id);
		if(pessoa == null) {
            return ResponseEntity.badRequest().build();
        }else {
        String mala = pessoa.get().getEndereco() + " - " + pessoa.get().getCEP() + " - " + pessoa.get().getCidade() +"/" + pessoa.get().getUF() ;
        PessoaRecord record = new PessoaRecord(pessoa.get().getId(),pessoa.get().getNome() ,mala);
            return ResponseEntity.ok(record);
        }
    }
	
	@PutMapping("/{id}") // PUT http://localhost:8080/api/pessoas/
	public ResponseEntity<Pessoa> update(@RequestBody Pessoa pessoa) {
		Pessoa updPessoa = pessoaService.update(pessoa);
		if(updPessoa == null) {
			return ResponseEntity.badRequest().build();
		}else {
			return ResponseEntity.ok(updPessoa);
		}
	}
	
	
	@DeleteMapping("/{id}")  // PUT http://localhost:8080/api/pessoas/id
	public ResponseEntity<?> delete(@PathVariable Long id) {
		pessoaService.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
