package com.thp.spring.projetlibre.service;

import java.util.List;

import com.thp.spring.projetlibre.dto.CommandeProduitDTO;


public interface CommandeProduitService {

	CommandeProduitDTO findById(Long cpId);

	List<CommandeProduitDTO> findAll();

	void deleteCommandeProduit(Long cpId);

	CommandeProduitDTO addCommandeProduit(CommandeProduitDTO cpDTO);
}
