package com.jp.clase.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jp.clase.controllers.entity.Seminario11;
import com.jp.clase.controllers.interfaces.Seminario11;

@RestController
@RequestMapping(value = "/tecnico")
public class Sermiario11 {
	
	@Autowired
	private Seminario11 tecnicos;
	
	@GetMapping(value = "/getMensaje", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getMensaje(@RequestHeader("estudiante") String estudiante) {
		return "Hola otra vez: "+ estudiante;
	}
	
	@GetMapping(value = "/getTecnicos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Seminario11> getTecnicos() {
		return tecnicos.getAll();
	}
	
	@PostMapping(value = "/saveTecnico", consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.TEXT_PLAIN_VALUE)
	public String saveTecnico(@RequestBody Seminario11 tecnico) {
		return tecnicos.save(tecnico);
	}
	
	@PutMapping(value = "/updateTecnico/{idtecnicos}")
	public Seminario11 updateTecnico(@PathVariable("idtecnicos") int idTecnicos, 
			@RequestBody Seminario11 tecnico) {
		return tecnicos.update(idTecnicos, tecnico);
	}
}
