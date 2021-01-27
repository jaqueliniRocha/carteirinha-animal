package com.jgcompany.animalapi;

import java.time.LocalDate;

public class Suplementacao {

	
	private Long id;
	private String nome;
	private LocalDate dtaAplic;
	private String dose;
	
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

	public LocalDate getDtaAplic() {
		return dtaAplic;
	}

	public void setDtaAplic(LocalDate dtaAplic) {
		this.dtaAplic = dtaAplic;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	
	
	
}
