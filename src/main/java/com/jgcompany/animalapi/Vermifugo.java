package com.jgcompany.animalapi;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vermifugo {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String peso;
	private Double dose;
	private LocalDate dtaAplic;
	private LocalDate reforco;
	
	Animal animal;

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

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}


	public Double getDose() {
		return dose;
	}

	public void setDose(Double dose) {
		this.dose = dose;
	}

	public LocalDate getDtaAplic() {
		return dtaAplic;
	}

	public void setDtaAplic(LocalDate dtaAplic) {
		this.dtaAplic = dtaAplic;
	}

	public LocalDate getReforco() {
		return reforco;
	}

	public void setReforco(LocalDate reforco) {
		this.reforco = reforco;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
	
}
