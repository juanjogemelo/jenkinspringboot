package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {

	@Autowired
	private PersonaService personaService;
	
	@PostMapping
	public void add(Persona persona) {
		this.personaService.add(persona);
	}
	
	@GetMapping
	public List<Persona> buscarTodos(){
		return this.personaService.buscarTodos();
	}
	
}
