package br.com.ifpe.oxefoodtalitha.modelo.produto;

import br.com.ifpe.oxefoodtalitha.util.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CategoriaProduto extends EntidadeAuditavel {

	private static final long serialVersionUID = 3451582009299242937L;
	
	private String chaveEmpresa;
	
	private String descricao;

}
