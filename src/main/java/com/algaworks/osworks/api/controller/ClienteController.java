package com.algaworks.osworks.api.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;
import com.algaworks.osworks.domain.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		//return clienteRepository.findAll();
		return clienteRepository.findByNomeContaining("Ga");
	}

}

//criou a consulta com o "createQuery"
//jpql para pegar a listar tipo 
//usando o EntityManager

//agora criou a interface CLiente Repository para manipular os metodos