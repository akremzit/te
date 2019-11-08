package com.thp.spring.projetlibre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.projetlibre.dto.CommandeProduitDTO;
import com.thp.spring.projetlibre.dto.ProduitDTO;
import com.thp.spring.projetlibre.entities.CommandeEntity;
import com.thp.spring.projetlibre.entities.CommandeProduit;
import com.thp.spring.projetlibre.entities.ProduitEntity;
import com.thp.spring.projetlibre.service.CommandeProduitService;

@RestController
@CrossOrigin("*")
public class CommandeProduitController {
	
	@Autowired
	CommandeProduitService commandeProduitService;
	
	@PostMapping(value = "/commandeProduit", produces = MediaType.APPLICATION_JSON_VALUE)
	public void addCommandeProduit(@RequestBody CommandeProduitDTO cpDTO) {
		System.out.println(cpDTO);
	
		commandeProduitService.addCommandeProduit(cpDTO);
	}
	
	@GetMapping(value = "/commandeProduit", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CommandeProduitDTO> getAllCommandeProduit() {
		return commandeProduitService.findAll();
	}
}
