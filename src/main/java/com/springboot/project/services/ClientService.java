package com.springboot.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.dtos.ClientDto;
import com.springboot.project.entites.ClientEntity;
import com.springboot.project.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public ClientDto convert(ClientEntity client) {
		
		ClientDto dto = new ClientDto();
		
		client.setId(dto.getId());
		client.setFirsName(dto.getFirstName());
		client.setEmail(dto.getEmail());
		client.setPhone(dto.getPhone());
		client.setAddress(dto.getAddress());
		
		return dto;
	}

	public ClientDto getById(long id) {
		
		ClientEntity client = repository.getById(id);
		
		ClientDto dto = convert(client);
		
		return dto;
	}
}
