package br.com.quantogasta.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quantogasta.domain.ContaMensal;
import br.com.quantogasta.service.ContaMensalService;

@RestController
@RequestMapping("/contas")
public class ContaMensalController {

	private ContaMensalService service = new ContaMensalService();
	
	@GetMapping
	public List<ContaMensal> list() {
		return service.findAll();
	}
	
	@PostMapping
	public void adicionarContaMensal(@RequestBody ContaMensal contaMensal) {
		service.save(contaMensal);
	}
}
