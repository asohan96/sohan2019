package com.lti.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.bank.dao.GenericDao;
import com.lti.bank.dao.TransactionDao;
import com.lti.bank.entity.Account;
import com.lti.bank.entity.FundTransfer;
import com.lti.bank.entity.Transaction;

@Service
public class TransactionService {

	

	// @Autowired
	// private TransactionRepo transactionrepo;

	@Autowired
	private TransactionDao transdao;

	@Autowired
	private GenericDao genericDao;

	@Transactional
	public void MoneyTransfer(FundTransfer fundtransfer) {
		System.out.println("hello");
		long ac1 = fundtransfer.getFromaccount();
		long ac2 = fundtransfer.getToaccount();

		Account a1 = genericDao.fetch(Account.class, 12345);
		Account a2 = genericDao.fetch(Account.class, 54321);

		
		if (a1.getBalance() >= fundtransfer.getAmount()) {
			
				Transaction tx1 = new Transaction();
				tx1.setAmount(fundtransfer.getAmount());
				tx1.setAccount(a1);
				tx1.setType("MONEYTRANSFERED");
			
				Transaction tx2 = new Transaction();
				tx2.setAmount(fundtransfer.getAmount());
				tx2.setAccount(a2);
				tx2.setType("MONEYRECEIVED");
			
				
				a1.setBalance(a1.getBalance() - fundtransfer.getAmount());
				a2.setBalance(a2.getBalance() + fundtransfer.getAmount());
				

			genericDao.save(a1);
			genericDao.save(a2);
			
				genericDao.save(tx1);
				genericDao.save(tx2);
		}

	}
}

	



