package com.springboot.project.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.project.entites.ClientEntity;

@Repository
@Transactional
public class ClientRepository  {

	@Autowired
	private EntityManager manager;

	
	public ClientEntity getById(long id) {

		ClientEntity client = manager.find(ClientEntity.class, id);

		return client;

	}

	public EntityManager getManager() {
		return manager;
	}

	@PersistenceContext
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

}
