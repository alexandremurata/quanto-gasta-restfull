package br.com.quantogasta.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quantogasta.domain.ConsumoEletro;
import br.com.quantogasta.service.ConsumoEletroService;

@RestController
@RequestMapping("/consumoEltros")
public class ConsumoEletroController {
	
	private ConsumoEletroService service = new ConsumoEletroService();

	@GetMapping
	public List<ConsumoEletro> list() {
		return service.findAll();
	}
	
	@PostMapping
	public void adicionarConsumoEletro(@RequestBody ConsumoEletro consumoEletro) {
		service.save(consumoEletro);
	}
	
	
}
