package com.jgcompany.animalapi;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Simparic {

	@Id
	@GeneratedValue
	private Long id;
	private LocalDate dtaAplic;
	private String pesoAnimal;
	private Double dose;
	private LocalDate reforco;
	
	Animal animal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDtaAplic() {
		return dtaAplic;
	}

	public void setDtaAplic(LocalDate dtaAplic) {
		this.dtaAplic = dtaAplic;
	}

	public String getPesoAnimal() {
		return pesoAnimal;
	}

	public void setPesoAnimal(String pesoAnimal) {
		this.pesoAnimal = pesoAnimal;
	}

	public Double getDose() {
		return dose;
	}

	public void setDose(Double dose) {
		this.dose = dose;
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
