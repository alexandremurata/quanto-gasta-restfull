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

import br.com.quantogasta.domain.Usuario;
import br.com.quantogasta.repository.UsuarioRepository;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

	private final UsuarioRepository usuarioRepository;
	private final String USUARIO_URI = "usuarios/";
	
	public UsuarioController (final UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	@GetMapping("/")
	public ModelAndView list() {
		Iterable<Usuario> usuarios = this.usuarioRepository.findAll();
		return new ModelAndView(USUARIO_URI + "list","usuarios",usuarios);
	}

	@GetMapping("{id}")
	public ModelAndView view(@PathVariable("id") Usuario usuario) {
		return new ModelAndView(USUARIO_URI + "view","usuario",usuario);
	}

	@GetMapping("/novo")
	public String createForm(@ModelAttribute Usuario usuario) {
		return USUARIO_URI + "form";
	}

	@PostMapping(params = "form")
	public ModelAndView create(@Valid Usuario usuario,BindingResult result,RedirectAttributes redirect) {
		if (result.hasErrors()) { return new ModelAndView(USUARIO_URI + "form","formErrors",result.getAllErrors()); }
		usuario = this.usuarioRepository.save(usuario);
		redirect.addFlashAttribute("globalMessage","Usuario gravado com sucesso");
		return new ModelAndView("redirect:/" + USUARIO_URI + "{usuario.id}","usuario.id",usuario.getId());
	}

	@GetMapping(value = "remover/{id}")
	public ModelAndView remover(@PathVariable("id") Long id,RedirectAttributes redirect) {
		this.usuarioRepository.delete(id);
		Iterable<Usuario> usuarios = this.usuarioRepository.findAll();
		
		ModelAndView mv = new ModelAndView(USUARIO_URI + "list","usuarios",usuarios);
		mv.addObject("globalMessage","Usuario removido com sucesso");
	
		return mv;
	}

	@GetMapping(value = "alterar/{id}")
	public ModelAndView alterarForm(@PathVariable("id") Usuario usuario) {
		return new ModelAndView(USUARIO_URI + "form","usuario",usuario);
	}
	
}
