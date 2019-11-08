package com.thp.spring.projetlibre.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.projetlibre.dto.CommandeDTO;
import com.thp.spring.projetlibre.repository.UtilisateurRepository;
import com.thp.spring.projetlibre.service.CommandeService;
import com.thp.spring.projetlibre.util.Etat;

@RestController(value = "/commande")
@CrossOrigin("*")
public class CommandeController {

	@Autowired
	CommandeService cmdService;
	@Autowired
	UtilisateurRepository utilisateurRepository;
	@GetMapping(value = "/commande", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CommandeDTO> getAllCommande() {
		return cmdService.findAll();
	}

	@GetMapping(value = "/commande/{cmdId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CommandeDTO getCommandeById(@PathVariable Long cmdId) {
		return cmdService.findById(cmdId);
	}

	@DeleteMapping(value = "/commande/{cmdId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteCommande(@PathVariable Long cmdId) {
		cmdService.deleteCommande(cmdId);
	}

	@PostMapping(value = "/commande/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void createCommande(@RequestBody CommandeDTO cmdDTO,@PathVariable String username) {
		cmdDTO.setUtilisateur(utilisateurRepository.findByPseudo(username));
//		CommandeDTO commandeDTO =new CommandeDTO();
//		ProduitDTO produitDTO =new  ProduitDTO();
//		CommandeProduitDTO commandeProduitDTO = new CommandeProduitDTO();
//		commandeProduitDTO.setProduit(produitDTO);
//		commandeDTO.addCdProduit(commandeProduitDTO);
		cmdService.addCommande(cmdDTO);
	}

	@PutMapping(value = "/commande", produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateCommande(@RequestBody CommandeDTO cmdDTO) {
		System.out.println(cmdDTO);
		cmdService.addCommande(cmdDTO);
	}

	/*
	 * @GetMapping(value = "/commandeByStatus", produces =
	 * MediaType.APPLICATION_JSON_VALUE) public CommandeDTO
	 * getCommandeByStatus(@RequestParam Etat status) { return
	 * cmdService.findByStatus(status);}
	 */
	
	/*
	 * cete méthode est utilisée pour qu'un client peut consulter ses commandes et
	 * ses factures elle prend en paramètre l'id de l'utilisateur et elle retourne
	 * la liste des commandes
	 */

	@GetMapping(value = "/commandeUser/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CommandeDTO> getCommandeByUtilisateur(@PathVariable Long userId) {
		System.out.println("idUSER" + userId);
		return cmdService.findCommandeByUtilisateur(userId);
	}

	@GetMapping(value = "/commandesLivreur", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CommandeDTO> getCommandeLivreurs() {
		List<CommandeDTO> commanderLivreurs = new ArrayList<CommandeDTO>();
		List<CommandeDTO> allCommands = cmdService.findAll();
		for (CommandeDTO commandeDTO : allCommands) {
			if (commandeDTO.getStatus() != Etat.panier && commandeDTO.getStatus() != Etat.en_attente_preparation) {
				commanderLivreurs.add(commandeDTO);
			}
		}
		System.out.println(commanderLivreurs);
		return commanderLivreurs;
	}

}
