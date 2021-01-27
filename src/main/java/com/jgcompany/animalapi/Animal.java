package com.jgcompany.animalapi;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Animal {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String raca;
	private LocalDate dtaNasc;
	private String sexo;
	
	
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
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public LocalDate getDtaNasc() {
		return dtaNasc;
	}
	public void setDtaNasc(LocalDate dtaNasc) {
		this.dtaNasc = dtaNasc;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
