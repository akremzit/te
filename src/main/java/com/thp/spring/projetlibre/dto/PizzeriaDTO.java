package com.thp.spring.projetlibre.dto;

import java.io.Serializable;
import java.util.List;

import com.thp.spring.projetlibre.entities.CommandeEntity;
import com.thp.spring.projetlibre.entities.UtilisateurEntity;

public class PizzeriaDTO extends MyDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2813366992905955677L;
	private int id;
	private String nom;
	private String adresse;
	private List<CommandeEntity> commandesPizzeria;
	private List<UtilisateurEntity> employes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	
	public PizzeriaDTO(int id, String nom, String adresse, List<CommandeEntity> commandesPizzeria,
			List<UtilisateurEntity> employes) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.commandesPizzeria = commandesPizzeria;
		this.employes = employes;
	}

	
	public List<CommandeEntity> getCommandesPizzeria() {
		return commandesPizzeria;
	}
	public void setCommandesPizzeria(List<CommandeEntity> commandesPizzeria) {
		this.commandesPizzeria = commandesPizzeria;
	}
	public List<UtilisateurEntity> getEmployes() {
		return employes;
	}
	public void setEmployes(List<UtilisateurEntity> employes) {
		this.employes = employes;
	}
	@Override
	public String toString() {
		return "PizzeriaDTO [id=" + id + ", nom=" + nom + ", adresse=" + adresse + ", commandesPizzeria="
				+ commandesPizzeria + ", employes=" + employes + "]";
	}


	public PizzeriaDTO() {
		super();
	}
	
	

}
