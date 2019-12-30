package com.springboot.project.conrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.dtos.ClientDto;
import com.springboot.project.services.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private ClientService service;
	
	
	@RequestMapping(value ="/id/{id}",method = RequestMethod.GET)
	public ClientDto getById(@PathVariable long id) {
		
		return service.getById(id);
	}
	
	}



