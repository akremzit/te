package com.thp.spring.projetlibre.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thp.spring.projetlibre.entities.CommandeProduit;
import com.thp.spring.projetlibre.entities.PizzeriaEntity;
public class ProduitDTO extends MyDTO implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6222345451861382955L;


	private Long id;
	private double tarif;
	private String nom;
	private String description;
	private String image;
	private CarteDTO carte;
	@JsonIgnore
	private Set<CommandeProduit> cdProduits;
	private Set<PizzeriaEntity> pizzerias = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public CarteDTO getCarte() {
		return carte;
	}

	public void setCarte(CarteDTO carte) {
		this.carte = carte;
	}



	@Override
	public String toString() {
		return "ProduitDTO [id=" + id + ", tarif=" + tarif + ", nom=" + nom + ", description=" + description
				+ ", image=" + image + ", carte=" + carte + ", cdProduits=" + cdProduits + ", pizzerias=" + pizzerias
				+ "]";
	}



 
	public Set<CommandeProduit> getCdProduits() {
		return cdProduits;
	}

	public void setCdProduits(Set<CommandeProduit> cdProduits) {
		this.cdProduits = cdProduits;
	}

	public Set<PizzeriaEntity> getPizzerias() {
		return pizzerias;
	}

	public void setPizzerias(Set<PizzeriaEntity> pizzerias) {
		this.pizzerias = pizzerias;
	}

	public ProduitDTO(Long id, double tarif, String nom, String description, String image, CarteDTO carte,
			Set<CommandeProduit> cdProduits, Set<PizzeriaEntity> pizzerias) {
		super();
		this.id = id;
		this.tarif = tarif;
		this.nom = nom;
		this.description = description;
		this.image = image;
		this.carte = carte;
		this.cdProduits = cdProduits;
		this.pizzerias = pizzerias;
	}

	public ProduitDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
