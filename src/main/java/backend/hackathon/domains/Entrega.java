package backend.hackathon.domains;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import backend.hackathon.enums.Status;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Entrega implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String codEntrega;
	private LocalDateTime dataHoraVenda;
	private String chaveVenda;
	private String nomeCliente;
	private String cepCliente;
	private String cidadeCliente;
	private String bairroCliente;
	private String enderecoCliente;
	private Integer numeroCliente;
	private String complementoCliente;
	private String telefoneCliente;
	private boolean possuiPereciveis;
	private boolean possuiDataHoraEntrega;
	private LocalDateTime dataHoraDe;
	private LocalDateTime dataHoraAte;
	private Integer qtdeVolume;
	private boolean possuiPacoteExtra;
	private String pacoteExtra;
	private String obsEntrega;
	private Status status;
 
}
