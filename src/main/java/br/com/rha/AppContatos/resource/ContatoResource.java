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

import br.com.rha.AppContatos.modelo.Contato;
import br.com.rha.AppContatos.service.ContatoService;



@RestController
@RequestMapping("/api/contato") 
public class ContatoResource {

	@Autowired
	private ContatoService contatoService;
	
	@PostMapping // POST http://localhost:8080/api/contato
	public ResponseEntity<Contato> gravar(@RequestBody Contato contato) {
		Contato newContato = contatoService.gravar(contato);
		if(newContato == null) {
			return ResponseEntity.badRequest().build();
		}else {
			return ResponseEntity.ok(newContato);
		}
	}
	

	@GetMapping("/{id}") // READ http://localhost:8080/api/contato/{id}
	public ResponseEntity<Optional<Contato>> acharId(@PathVariable Long id) {
		Optional<Contato> findContato = contatoService.acharId(id);
		if(findContato.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(findContato);
		}
	}
	
	
	
	@GetMapping // READ http://localhost:8080/api/contato/
	public ResponseEntity<List<Contato>> acharTodos() {
		List<Contato> findContato = contatoService.acharTodos();
		if(findContato == null) {
			return ResponseEntity.badRequest().build();
		}if(findContato.size() == 0){
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(findContato);
		}
	}
	
	@PutMapping
	public ResponseEntity<Contato> update(@RequestBody Contato contato) {
		Contato updContato= contatoService.update(contato);
		if(updContato == null) {
			return ResponseEntity.badRequest().build();
		}else {
			return ResponseEntity.ok(updContato);
		}
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		contatoService.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
