package br.com.quantogasta.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.quantogasta.domain.Eletrodomestico;
import br.com.quantogasta.service.EletrodomesticoService;

@Controller
public class EletrodomesticoController {
	
	private EletrodomesticoService service = new EletrodomesticoService();
	
	@RequestMapping("/eletrodomesticos")
	public ModelAndView listar() {
		List<Eletrodomestico> eletrodomesticos = service.findAll();
		ModelAndView mv = new ModelAndView("ListaEletrodomesticos");
		mv.addObject("eletrodomesticos", eletrodomesticos);
		
		return mv;
	}
	
	@GetMapping
	public List<Eletrodomestico> list() {
		return service.findAll();
	}
	
	@PostMapping
	public void adicionarEletrodomestico(@RequestBody Eletrodomestico eletrodomestico) {
		service.save(eletrodomestico);
	}
	
	

}
