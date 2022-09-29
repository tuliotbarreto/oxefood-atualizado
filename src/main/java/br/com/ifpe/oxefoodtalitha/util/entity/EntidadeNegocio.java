package br.com.ifpe.oxefoodtalitha.util.entity;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@EqualsAndHashCode(of = {"id"} )

public class EntidadeNegocio implements Serializable {
	
	private static final long serialVersionUID = -7382460642859520918L;

	private Long id;
	
	private Boolean habilitado;

}
