package com.thp.spring.projetlibre.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.projetlibre.dto.CommandeProduitDTO;
import com.thp.spring.projetlibre.dto.UtilisateurDTO;
import com.thp.spring.projetlibre.entities.UtilisateurEntity;
import com.thp.spring.projetlibre.helper.ModelMapperConverter;
import com.thp.spring.projetlibre.repository.CommandeProduitRepository;
import com.thp.spring.projetlibre.repository.CommandeRepository;
import com.thp.spring.projetlibre.service.CommandeProduitService;
import com.thp.spring.projetlibre.entities.CommandeProduit;
@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class CommandeProduitServiceImpl implements CommandeProduitService{

	@Autowired
	CommandeProduitRepository commandeProduitRepository;
	
	@Override
	public CommandeProduitDTO findById(Long cpId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommandeProduitDTO> findAll() {
		List<CommandeProduit> cp = commandeProduitRepository.findAll();
		return ModelMapperConverter.convertAllToDTO(cp, CommandeProduitDTO.class);
	}

	@Override
	public void deleteCommandeProduit(Long cpId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CommandeProduitDTO addCommandeProduit(CommandeProduitDTO cpDTO) {
		CommandeProduit cp = ModelMapperConverter.converToEntity(cpDTO, CommandeProduit.class);
		return ModelMapperConverter.converToDTO(commandeProduitRepository.save(cp),CommandeProduitDTO.class);	}

}
