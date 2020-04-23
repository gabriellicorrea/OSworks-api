package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
			cliente1.setId(1L);
			cliente1.setNome("Gabi");
			cliente1.setEmail("gabi@gabi.com");
			cliente1.setTelefone("12 3456-7890");
			
		var cliente2 = new Cliente();
			cliente2.setId(1L);
			cliente2.setNome("Gabi2");
			cliente2.setEmail("gabi2@gabi.com");
			cliente2.setTelefone("12 3456-7890");
			
		return Arrays.asList(cliente1, cliente2);
	}

}

//Uso o List pq é uma lista de Clientes
//List<Cliente> é da classe Cliente model
//crio as variaveis de clientes
//e retorno o Arrays.asList com os cliente.
