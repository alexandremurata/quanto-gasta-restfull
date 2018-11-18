package br.com.quantogasta.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quantogasta.domain.Tarifa;
import br.com.quantogasta.service.TarifaService;

@RestController
@RequestMapping("/tarifas")
public class TarifaController {

	private TarifaService service = new TarifaService() ;
	
	@GetMapping("/")
	public List<Tarifa> list() {
		return service.findAll();
	}
	
	@PostMapping
	public void adicionarTarifa(@RequestBody Tarifa tarifa) {
		service.save(tarifa);
	}
	
	
}
