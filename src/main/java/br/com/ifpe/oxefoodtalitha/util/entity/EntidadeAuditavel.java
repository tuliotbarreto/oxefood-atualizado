package br.com.ifpe.oxefoodtalitha.util.entity;


import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass 

public abstract class EntidadeAuditavel extends EntidadeNegocio {
	
	private static final long serialVersionUID = -8220068110390301486L;

	private Long versao;
	
	private LocalDate dataCriacao;
	
	private LocalDate dataUltimaModificacao;
	
	private Long criadoPor; //Id do usuario que o criou 
	
	private Long ultimaModificacaoPor;

}
