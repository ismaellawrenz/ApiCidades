package com.ApiCidades.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import jdk.jfr.Name;

@Entity
public class Estado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Name(value = "codigo_uf")
	private int codigoUf;
	
	private String nome, uf;
	@OneToOne()
	private Municipio municipio;
	
	public Estado() {
		super();		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCodigoUf() {
		return codigoUf;
	}

	public void setCodigoUf(int codigoUf) {
		this.codigoUf = codigoUf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	
	
}
