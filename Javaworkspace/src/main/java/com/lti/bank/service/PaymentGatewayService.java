package com.lti.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.bank.dao.GenericDao;
import com.lti.bank.dto.PrimaryAccountDTO;
import com.lti.bank.dto.SecondaryAccountDTO;
import com.lti.bank.entity.Account;
import com.lti.bank.entity.Transaction;

@Service
public class PaymentGatewayService {
	@Autowired
	private GenericDao genericDao;
	
	public Account toSecondaryWithAmount(SecondaryAccountDTO paymentGatewayDTO) {
		Account secondaryAcc= genericDao.fetch(Account.class,paymentGatewayDTO.getPartnerAcno());
		return secondaryAcc;
	}
	public Account getAccount(long acno) {
		
		Account primaryAcc= genericDao.fetch(Account.class,acno);
		return primaryAcc;
	}
	
	@Transactional
	public boolean transfer(Account secondaryAcc,Account primaryAcc)
	{
		long ac1 =primaryAcc.getBalance();
		long ac2 =secondaryAcc.getBalance() ;

		Account a1 = genericDao.fetch(Account.class, 12345L);
		Account a2 = genericDao.fetch(Account.class, 54321L);
		if (primaryAcc.getBalance() >=secondaryAcc.getBalance()) {
			
			Transaction tx1 = new Transaction();
			tx1.setAmount(primaryAcc.getBalance());
			tx1.setAccount(a1);
			tx1.setType("MONEYTRANSFERED");
		
			Transaction tx2 = new Transaction();
			tx2.setAmount(secondaryAcc.getBalance());
			tx2.setAccount(a2);
			tx2.setType("MONEYRECEIVED");
		
			
			a1.setBalance(a1.getBalance() - primaryAcc.getBalance());
			a2.setBalance(a2.getBalance() + secondaryAcc.getBalance());
			

		genericDao.save(a1);
		genericDao.save(a2);
		
			genericDao.save(tx1);
			genericDao.save(tx2);
		
		 
		}	
	
		return true;
	}
}
