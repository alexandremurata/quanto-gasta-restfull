package br.com.quantogasta.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quantogasta.domain.Eletrodomestico;
import br.com.quantogasta.service.EletrodomesticoService;

@RestController
@RequestMapping("/eletrodomesticos")
public class EletrodomesticoController {
	
	private EletrodomesticoService service = new EletrodomesticoService();
	
	@GetMapping("/")
	public List<Eletrodomestico> list() {
		return service.findAll();
	}
	
	@PostMapping
	public void adicionarTarifa(@RequestBody Eletrodomestico eletrodomestico) {
		service.save(eletrodomestico);
	}

}
