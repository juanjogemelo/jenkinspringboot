package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	public void add(Persona persona) {
		this.personaRepository.add(persona);
	}
	
	public List<Persona> buscarTodos() {
		return this.personaRepository.buscarTodos();
	}
}
