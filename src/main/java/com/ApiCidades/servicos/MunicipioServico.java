package com.ApiCidades.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ApiCidades.models.Municipio;
import com.ApiCidades.repositorio.MunicipioRepositorio;

@Service
public class MunicipioServico {

	private final MunicipioRepositorio repositorio;

	public MunicipioServico(MunicipioRepositorio repositorio) {
		
		this.repositorio = repositorio;
	}
	
	public Municipio salvar(Municipio municipio) {
		return repositorio.save(municipio);
	}
	
	public Municipio buscarPorId(Long id) {
		return  repositorio.findById(id).get();
	}
	
	public List<Municipio> buscarTodos() {
		return (List<Municipio>) repositorio.findAll();
	}
	
	public Municipio alterar(Municipio municipio) {
		return repositorio.save(municipio);
	}
	
}
