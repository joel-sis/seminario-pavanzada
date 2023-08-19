package com.jp.clase.controllers.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jp.clase.controllers.entity.Seminario11;
import com.jp.clase.controllers.interfaces.Seminario11;

@Service
public class Seminario11 implements Seminario11 {

	@Override
	public List<Seminario11> getAll() {
		//simular la lista
		Seminario11 tecnico = new Seminario11();
		tecnico.setIdtecnicos(1);
		tecnico.setPrimerNombre("Juan");
		tecnico.setSegundoNombre("Antonio");
		tecnico.setPrimerApellido("Perez");
		tecnico.setSegundoApellido("Lopez");
		tecnico.setFechaNacimiento("25/08/1980");
		
		List<Seminario11> listTecnicos = new ArrayList<>();
		
		listTecnicos.add(tecnico);
		
		return listTecnicos;
	}

	@Override
	public String save(Seminario11 tecnico) {
		return tecnico.getPrimerApellido();
	}

	@Override
	public Seminario11 update(int idtecnicos, Seminario11 Tecnico) {
		// TODO Auto-generated method stub
		return null;
	}

}
