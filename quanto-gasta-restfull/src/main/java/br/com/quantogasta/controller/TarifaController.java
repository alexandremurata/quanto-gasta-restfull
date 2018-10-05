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

import br.com.quantogasta.domain.Item;
import br.com.quantogasta.domain.Tarifa;
import br.com.quantogasta.repository.TarifaRepository;

@Controller
@RequestMapping("/tarifas")
public class TarifaController {

	private final TarifaRepository tarifaRepository;
	private final String TARIFA_URI = "tarifas/";
	
	public TarifaController(final TarifaRepository tarifaRepository) {
		this.tarifaRepository = tarifaRepository;
	}
	
	@GetMapping("/")
	public ModelAndView list() {
		Iterable<Tarifa> tarifas = this.tarifaRepository.findAll();
		return new ModelAndView(TARIFA_URI + "list","tarifas",tarifas);
	}
	
	@GetMapping("{id}")
	public ModelAndView view(@PathVariable("id") Tarifa tarifa) {
		return new ModelAndView(TARIFA_URI + "view","tarifa",tarifa);
	}
	
	@GetMapping("/novo")
	public String createForm(@ModelAttribute Tarifa tarifa) {
		return TARIFA_URI + "form";
	}
	
	@PostMapping(params = "form")
	public ModelAndView create(@Valid Tarifa tarifa,BindingResult result,RedirectAttributes redirect) {
		if (result.hasErrors()) { return new ModelAndView(TARIFA_URI + "form","formErrors",result.getAllErrors()); }
		tarifa = this.tarifaRepository.save(tarifa);
		redirect.addFlashAttribute("globalMessage","Tarifa gravada com sucesso");
		return new ModelAndView("redirect:/" + TARIFA_URI + "{tarifa.id}","tarifa.id",tarifa.getId());
	}

	@GetMapping(value = "remover/{id}")
	public ModelAndView remover(@PathVariable("id") Long id,RedirectAttributes redirect) {
		this.tarifaRepository.delete(id);
		Iterable<Tarifa> tarifas = this.tarifaRepository.findAll();
		
		ModelAndView mv = new ModelAndView(TARIFA_URI + "list","tarifas",tarifas);
		mv.addObject("globalMessage","Tarifa removida com sucesso");
	
		return mv;
	}
	
	@GetMapping(value = "alterar/{id}")
	public ModelAndView alterarForm(@PathVariable("id") Tarifa tarifa) {
		return new ModelAndView(TARIFA_URI + "form", "tarifa", tarifa);
	}
}
