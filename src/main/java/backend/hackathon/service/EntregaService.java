package backend.hackathon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.hackathon.domains.Entrega;
import backend.hackathon.repository.EntregaRepository;

@Service
public class EntregaService {
	
	@Autowired
	EntregaRepository entregaRepository;
	
	public List<Entrega> findAllEntrega(){
		return entregaRepository.findAll();
	}
	
	public void saveEntrega(Entrega entrega) {
		entregaRepository.save(entrega);
	}
}
