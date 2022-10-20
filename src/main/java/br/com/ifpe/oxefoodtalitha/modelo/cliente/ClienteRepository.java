package br.com.ifpe.oxefoodtalitha.modelo.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClienteRepository 
extends JpaRepository<Cliente, Long>, JpaSpecificationExecutor<Cliente> {

}
