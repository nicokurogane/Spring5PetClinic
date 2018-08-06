package com.springframework.petclinic.services;

import java.util.Set;
import com.springframework.petclinic.models.Vet;

public interface VetService {
	
	Vet findById(Long id);
	Vet save (Vet vet);
	Set<Vet> findAll();

}
