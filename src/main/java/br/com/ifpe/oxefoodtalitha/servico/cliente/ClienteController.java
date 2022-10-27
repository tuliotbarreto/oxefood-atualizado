package br.com.ifpe.oxefoodtalitha.servico.cliente;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefoodtalitha.modelo.cliente.Cliente;
import br.com.ifpe.oxefoodtalitha.modelo.cliente.ClienteService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/cliente")

public class ClienteController {
	
	
	@Autowired
	private ClienteService clienteService;
	
	@ApiOperation(value = "Serviço responsável por salvar uma categoria de produto no sistema.")
	@PostMapping
	public ResponseEntity<Cliente> save(@RequestBody @Valid ClienteRequest request) {


		Cliente clienteRequisicao = request.buildCliente();
		Cliente clienteSalvo = clienteService.save(clienteRequisicao);
		return new ResponseEntity<Cliente>(clienteSalvo, HttpStatus.CREATED);
	}	
	
	
}
