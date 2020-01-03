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

		// fetching data from database
		ClientDto dto = new ClientDto();
		
		dto.setFirstName(client.getFirsName());
		dto.setLastName(client.getLastName());
		dto.setEmail(client.getEmail());
		dto.setAddress(client.getAddress());
		dto.setPhone(client.getPhone());
		return dto;
	}

	public ClientDto getById(long id) {

		ClientEntity client = repository.getById(id);

		ClientDto dto = convert(client);

		return dto;
	}
}
