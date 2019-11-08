package com.thp.spring.projetlibre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thp.spring.projetlibre.entities.CommandeProduit;
import com.thp.spring.projetlibre.entities.CommandeProduitId;

public interface CommandeProduitRepository extends JpaRepository<CommandeProduit,CommandeProduitId>{

}
