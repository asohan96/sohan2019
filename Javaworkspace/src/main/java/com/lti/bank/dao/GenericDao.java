package com.lti.bank.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContexts;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("gen_dao")
public class GenericDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public void save(Object obj) { // anything can be object ( persist(Object object)* method takes object)

		entityManager.merge(obj);

	}

	// Common Code for Fetching Data any table

	public <T> T fetch(Class<T> clazz, Object pk) { // Any class that is passed
		
		return entityManager.find(clazz, pk);
	}

}
