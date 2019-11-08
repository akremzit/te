package com.thp.spring.projetlibre.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thp.spring.projetlibre.entities.CommandeEntity;
import com.thp.spring.projetlibre.entities.CommandeProduit;
import com.thp.spring.projetlibre.entities.PizzeriaEntity;
import com.thp.spring.projetlibre.entities.ProduitEntity;
import com.thp.spring.projetlibre.entities.UtilisateurEntity;
import com.thp.spring.projetlibre.util.Etat;
import com.thp.spring.projetlibre.util.ModePaiement;
import com.thp.spring.projetlibre.util.ModeRetrait;

public class CommandeDTO extends MyDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -978645973814363692L;

	private Long id;
	private Date dateCommande;
	private Date dateLivraison;

	private double tarif;
	private boolean regle;
	private Etat status;
	private ModeRetrait retrait;
	private ModePaiement paiement;
	private UtilisateurEntity utilisateur;
	private UtilisateurEntity client;
	private UtilisateurEntity caissier;
	private UtilisateurEntity livreur;
	private UtilisateurEntity logistique;
	private Set<ProduitEntity> produits = new HashSet<>();
	private Set<CommandeEntity> commandes = new HashSet<>();
	private Set<PizzeriaEntity> pizzerias = new HashSet<>();
	@JsonIgnore
	private Set<CommandeProduit> cdProduits;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Etat getStatus() {
		return status;
	}

	public void setStatus(Etat status) {
		this.status = status;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Date getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

	public boolean isRegle() {
		return regle;
	}

	public void setRegle(boolean regle) {
		this.regle = regle;
	}

	public ModeRetrait getRetrait() {
		return retrait;
	}

	public void setRetrait(ModeRetrait retrait) {
		this.retrait = retrait;
	}

	public ModePaiement getPaiement() {
		return paiement;
	}

	public void setPaiement(ModePaiement paiement) {
		this.paiement = paiement;
	}

	public CommandeDTO(Date dateCommande, Date dateLivraison, double tarif, boolean regle) {

		super();
		this.dateCommande = dateCommande;
		this.dateLivraison = dateLivraison;
		this.tarif = tarif;
		this.regle = regle;
	}

	public CommandeDTO(Long id, Date dateCommande, Date dateLivraison, double tarif, boolean regle, Etat status,
			ModeRetrait retrait, ModePaiement paiement, UtilisateurEntity utilisateur, UtilisateurEntity client,
			UtilisateurEntity caissier, UtilisateurEntity livreur, UtilisateurEntity logistique,
			Set<ProduitEntity> produits, Set<CommandeEntity> commandes, Set<PizzeriaEntity> pizzerias,
			Set<CommandeProduit> cdProduits) {
		super();
		this.id = id;
		this.dateCommande = dateCommande;
		this.dateLivraison = dateLivraison;
		this.tarif = tarif;
		this.regle = regle;
		this.status = status;
		this.retrait = retrait;
		this.paiement = paiement;
		this.utilisateur = utilisateur;
		this.client = client;
		this.caissier = caissier;
		this.livreur = livreur;
		this.logistique = logistique;
		this.produits = produits;
		this.commandes = commandes;
		this.pizzerias = pizzerias;
		this.cdProduits = cdProduits;
	}

	public UtilisateurEntity getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UtilisateurEntity utilisateur) {
		this.utilisateur = utilisateur;
	}

	public UtilisateurEntity getClient() {
		return client;
	}

	public void setClient(UtilisateurEntity client) {
		this.client = client;
	}

	public UtilisateurEntity getCaissier() {
		return caissier;
	}

	public void setCaissier(UtilisateurEntity caissier) {
		this.caissier = caissier;
	}

	public UtilisateurEntity getLivreur() {
		return livreur;
	}

	public void setLivreur(UtilisateurEntity livreur) {
		this.livreur = livreur;
	}

	public UtilisateurEntity getLogistique() {
		return logistique;
	}

	public void setLogistique(UtilisateurEntity logistique) {
		this.logistique = logistique;
	}

	public Set<ProduitEntity> getProduits() {
		return produits;
	}

	public void setProduits(Set<ProduitEntity> produits) {
		this.produits = produits;
	}

	public Set<CommandeEntity> getCommandes() {
		return commandes;
	}

	public void setCommandes(Set<CommandeEntity> commandes) {
		this.commandes = commandes;
	}

	public Set<PizzeriaEntity> getPizzerias() {
		return pizzerias;
	}

	public void setPizzerias(Set<PizzeriaEntity> pizzerias) {
		this.pizzerias = pizzerias;
	}

	public Set<CommandeProduit> getCdProduits() {
		return cdProduits;
	}

	public void setCdProduits(Set<CommandeProduit> cdProduits) {
		this.cdProduits = cdProduits;
	}

	@Override
	public String toString() {
		return "CommandeDTO [id=" + id + ", dateCommande=" + dateCommande + ", dateLivraison=" + dateLivraison
				+ ", tarif=" + tarif + ", regle=" + regle + ", status=" + status + ", retrait=" + retrait
				+ ", paiement=" + paiement + ", utilisateur=" + utilisateur + ", client=" + client + ", caissier="
				+ caissier + ", livreur=" + livreur + ", logistique=" + logistique + ", produits=" + produits
				+ ", commandes=" + commandes + ", pizzerias=" + pizzerias + "]";
	}

	public CommandeDTO(Date dateCommande, Date dateLivraison, double tarif, boolean regle, Etat status,
			ModeRetrait retrait, ModePaiement paiement, UtilisateurEntity utilisateur, UtilisateurEntity client,
			UtilisateurEntity caissier, UtilisateurEntity livreur, UtilisateurEntity logistique,
			Set<ProduitEntity> produits, Set<CommandeEntity> commandes, Set<PizzeriaEntity> pizzerias,
			Set<CommandeProduit> cdProduits) {
		super();
		this.dateCommande = dateCommande;
		this.dateLivraison = dateLivraison;
		this.tarif = tarif;
		this.regle = regle;
		this.status = status;
		this.retrait = retrait;
		this.paiement = paiement;
		this.utilisateur = utilisateur;
		this.client = client;
		this.caissier = caissier;
		this.livreur = livreur;
		this.logistique = logistique;
		this.produits = produits;
		this.commandes = commandes;
		this.pizzerias = pizzerias;
		this.cdProduits = cdProduits;
	}

	public CommandeDTO() {
		super();
	}

}
