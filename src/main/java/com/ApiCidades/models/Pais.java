package com.ApiCidades.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import jdk.jfr.Name;

@Entity
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Name(value = "nome_pt")
	private String nomePortugues;
	
	private String nome, sigla;
	
	private int bacen;
	
	@OneToOne(mappedBy = "pais")
	private Municipio municipio;
	
	public Pais() {
		super();
	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomePortugues() {
		return nomePortugues;
	}

	public void setNomePortugues(String nomePortugues) {
		this.nomePortugues = nomePortugues;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getBacen() {
		return bacen;
	}

	public void setBacen(int bacen) {
		this.bacen = bacen;
	}


	
}
