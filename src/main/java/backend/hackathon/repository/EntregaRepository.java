package backend.hackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.hackathon.domains.Entrega;

public interface EntregaRepository extends JpaRepository<Entrega, Integer>{

}
