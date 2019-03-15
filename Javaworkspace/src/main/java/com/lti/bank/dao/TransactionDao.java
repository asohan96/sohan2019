package com.lti.bank.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import com.lti.bank.entity.Transaction;

@Repository
public class TransactionDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Transaction> miniStatement(long accountNumber) {
		Query q=entityManager.createQuery("select t from Transaction t where t.account.accountNumber = ?1");
		q.setParameter(1, accountNumber);
		return q.getResultList();
	}

	
}
