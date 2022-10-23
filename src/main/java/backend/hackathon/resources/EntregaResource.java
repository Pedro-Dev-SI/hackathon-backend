package backend.hackathon.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import backend.hackathon.domains.Entrega;
import backend.hackathon.service.EntregaService;

@RestController
@RequestMapping("/entregas")
public class EntregaResource {
	
	@Autowired
	EntregaService entregaService;
	
	@GetMapping("/retornar-entregas")
	public ResponseEntity<List<Entrega>> findAllEntregas() {
		return ResponseEntity.ok().body(entregaService.findAllEntrega());
	}
	
	@PostMapping("/cadastrar-entrega")
	public void saveEntrega(@RequestBody Entrega entrega) {
		
		entregaService.saveEntrega(entrega);
	}
	
}
