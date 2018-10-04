package br.com.quantogasta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.quantogasta.domain.Cliente;
import br.com.quantogasta.repository.ClienteRepository;

@Controller
@RequestMapping("/eletrodomesticos")
public class EletrodomesticoController {
	
	private final ClienteRepository clienteRepository;
	private final String CLIENTE_URI = "clientes/";

	public EletrodomesticoController(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@GetMapping("/")
	public ModelAndView list() {
		Iterable<Cliente> clientes = this.clienteRepository.findAll();
		return new ModelAndView(CLIENTE_URI + "list","clientes",clientes);
	}
}
