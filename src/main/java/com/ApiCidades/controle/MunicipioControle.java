package com.ApiCidades.controle;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ApiCidades.models.Municipio;
import com.ApiCidades.servicos.MunicipioServico;

@RestController()
@RequestMapping("/municipio")
public class MunicipioControle {

	private  MunicipioServico servico;

	public MunicipioControle(MunicipioServico servico) {
		super();
		this.servico = servico;
	}
	
	@PostMapping
	public Municipio inserir(@RequestBody Municipio municipio) {
		return servico.salvar(municipio);
	}
	
	@GetMapping("/id")
	public Municipio buscarPorId(@PathVariable Long id) {
		return servico.buscarPorId(id);
	}
	
	@GetMapping("/all")
	public List<Municipio> buscarTodos() {
		return servico.buscarTodos();
	}
	
	@PutMapping()
		public Municipio alterar(@RequestBody Municipio municipio) {
			return servico.alterar(municipio);
		}
	}
	

