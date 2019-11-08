package com.thp.spring.projetlibre.dto;

import java.io.Serializable;

import com.thp.spring.projetlibre.entities.CommandeEntity;
import com.thp.spring.projetlibre.entities.CommandeProduitId;
import com.thp.spring.projetlibre.entities.ProduitEntity;

public class CommandeProduitDTO extends MyDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8118216703546024776L;

	private CommandeProduitId cdPdt;
	private ProduitEntity produit;
	private CommandeEntity commande;
	private double quantite;

	


	public CommandeProduitId getCdPdt() {
		return cdPdt;
	}
	public void setCdPdt(CommandeProduitId cdPdt) {
		this.cdPdt = cdPdt;
	}

	

	

	

	public double getQuantite() {
		return quantite;
	}
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}

	

	

	public CommandeProduitDTO(CommandeProduitId cdPdt, ProduitEntity produit, CommandeEntity commande,

			double quantite) {
		super();
		this.cdPdt = cdPdt;
		this.produit = produit;
		this.commande = commande;
		this.quantite = quantite;
	}

	public ProduitEntity getProduit() {
		return produit;
	}

	public void setProduit(ProduitEntity produit) {
		this.produit = produit;
	}

	public CommandeEntity getCommande() {
		return commande;
	}

	public void setCommande(CommandeEntity commande) {
		this.commande = commande;
	}

	public CommandeProduitDTO() {
		super();

	}

	@Override
	public String toString() {
		return "CommandeProduitDTO [cdPdt=" + cdPdt + ", produit=" + produit + ", commande=" + commande
				+ ", quantite=" + quantite + "]";

	}

}
