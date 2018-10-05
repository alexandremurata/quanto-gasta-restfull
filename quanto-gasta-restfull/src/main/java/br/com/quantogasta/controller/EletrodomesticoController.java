package br.com.quantogasta.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.quantogasta.domain.Eletrodomestico;
import br.com.quantogasta.repository.EletrodomesticoRepository;

@Controller
@RequestMapping("/eletrodomesticos")
public class EletrodomesticoController {
	
	private final EletrodomesticoRepository eletrodomesticoRepository;
	private final String ELETRO_URI = "eletrodomesticos/";

	public EletrodomesticoController(EletrodomesticoRepository eletrodomesticoRepository) {
		this.eletrodomesticoRepository = eletrodomesticoRepository;
	}

	@GetMapping("/")
	public ModelAndView list() {
		Iterable<Eletrodomestico> eletrodomesticos = this.eletrodomesticoRepository.findAll();
		return new ModelAndView(ELETRO_URI + "list", "eletrodomesticos", eletrodomesticos);
	}
	
	@GetMapping("{id}")
	public ModelAndView view(@PathVariable("id") Eletrodomestico eletrodomestico) {
		return new ModelAndView(ELETRO_URI + "view", "eletrodomestico", eletrodomestico);
	}
	
	@GetMapping("/novo")
	public String createForm(@ModelAttribute Eletrodomestico eletrodomestico) {
		return ELETRO_URI + "form";
	}
	
	@PostMapping(params = "form")
	public ModelAndView create(@Valid Eletrodomestico eletrodomestico, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) { return new ModelAndView(ELETRO_URI + "form","formErrors",result.getAllErrors()); }
		eletrodomestico = this.eletrodomesticoRepository.save(eletrodomestico);
		redirect.addFlashAttribute("globalMessage","Eletrodomestico gravado com sucesso");
		return new ModelAndView("redirect:/" + ELETRO_URI + "{eletrodomestico.id}", "eletrodomestico.id", eletrodomestico.getId());
	}

	@GetMapping(value = "remover/{id}")
	public ModelAndView remover(@PathVariable("id") Long id,RedirectAttributes redirect) {
		this.eletrodomesticoRepository.delete(id);
		Iterable<Eletrodomestico> eletrodomesticos = this.eletrodomesticoRepository.findAll();
		
		ModelAndView mv = new ModelAndView(ELETRO_URI + "list", "eletrodomestico", eletrodomesticos);
		mv.addObject("globalMessage","Eletrodomestico removido com sucesso");
	
		return mv;
	}

	@GetMapping(value = "alterar/{id}")
	public ModelAndView alterarForm(@PathVariable("id") Eletrodomestico eletrodomestico) {
		return new ModelAndView(ELETRO_URI + "form","eletrodomestico", eletrodomestico);
	}
}
