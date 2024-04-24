package com.example.motos;



import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Moto {

	@Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
	 private Long idMotot; 
	 private String nomMoto; 
	 private Double prixMoto; 
	 private Date dateCreation; 
	  
	 public Moto() { 
	  super(); 
	 } 
	 
	 public Moto(String nomProduit, Double prixProduit, Date dateCreation) { 
	  super(); 
	  this.nomMoto = nomProduit; 
	  this.prixMoto = prixProduit; 
	  this.dateCreation = dateCreation; 
	 }

	public Long getIdMotot() {
		return idMotot;
	}

	public void setIdMotot(Long idMotot) {
		this.idMotot = idMotot;
	}

	public String getNomMoto() {
		return nomMoto;
	}

	public void setNomMoto(String nomMoto) {
		this.nomMoto = nomMoto;
	}

	public Double getPrixMoto() {
		return prixMoto;
	}

	public void setPrixMoto(Double prixMoto) {
		this.prixMoto = prixMoto;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(java.util.Date dateCreation2) {
		this.dateCreation = (Date) dateCreation2;
	}

	@Override
	public String toString() {
		return "Moto [idMotot=" + idMotot + ", nomMoto=" + nomMoto + ", prixMoto=" + prixMoto + ", dateCreation="
				+ dateCreation + "]";
	}
	 
}
