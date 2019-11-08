package com.thp.spring.projetlibre.dto;

import java.io.Serializable;
import java.util.Set;

import com.thp.spring.projetlibre.entities.PizzeriaEntity;
import com.thp.spring.projetlibre.entities.ProduitEntity;

public class IngredientDTO extends MyDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2813366992905955677L;
	private int id;
	private String nom;
	private Set<PizzeriaEntity> ingredientPizzerias ;
	private Set<ProduitEntity> ingredientProduits ;
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
	
	
	public IngredientDTO(int id, String nom, Set<PizzeriaEntity> ingredientPizzerias,
			Set<ProduitEntity> ingredientProduits) {
		super();
		this.id = id;
		this.nom = nom;
		this.ingredientPizzerias = ingredientPizzerias;
		this.ingredientProduits = ingredientProduits;
	}
	public Set<PizzeriaEntity> getIngredientPizzerias() {
		return ingredientPizzerias;
	}
	public void setIngredientPizzerias(Set<PizzeriaEntity> ingredientPizzerias) {
		this.ingredientPizzerias = ingredientPizzerias;
	}
	public Set<ProduitEntity> getIngredientProduits() {
		return ingredientProduits;
	}
	public void setIngredientProduits(Set<ProduitEntity> ingredientProduits) {
		this.ingredientProduits = ingredientProduits;
	}
	public IngredientDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "IngredientDTO [id=" + id + ", nom=" + nom + ", ingredientPizzerias=" + ingredientPizzerias
				+ ", ingredientProduits=" + ingredientProduits + "]";
	}
	
	
	
	
	
	
	
	
}
