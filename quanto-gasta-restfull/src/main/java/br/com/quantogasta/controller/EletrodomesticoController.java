package br.com.quantogasta.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quantogasta.service.EletrodomesticoService;

@RestController
@RequestMapping("/eletrodomesticos")
public class EletrodomesticoController {
	
	private EletrodomesticoService service = new EletrodomesticoService();

}
