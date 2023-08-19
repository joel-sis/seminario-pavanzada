package com.jp.clase.controllers.interfaces;

import java.util.List;

import com.jp.clase.controllers.entity.Seminario11;

public interface Seminario11 {
	public List<Seminario11> getAll();
	public String save(Seminario11 tecnico);
	public Seminario11 update(int idtecnicos, Seminario11 Tecnico);
}
