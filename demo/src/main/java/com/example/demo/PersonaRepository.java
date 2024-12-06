package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PersonaRepository {

	private List<Persona> listaPersonas = new ArrayList<Persona>();

	public PersonaRepository() {
		this.listaPersonas.add(new Persona("ana"));
	}
	
	public void add(Persona persona) {
		this.listaPersonas.add(persona);
	}
	
	public List<Persona> buscarTodos(){
		return this.listaPersonas;
	}
}
