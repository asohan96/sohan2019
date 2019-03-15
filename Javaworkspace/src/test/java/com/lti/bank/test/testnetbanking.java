package com.lti.bank.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.lti.bank.dao.GenericDao;
import com.lti.bank.entity.Account;

public class testnetbanking {

	
	@Test
	public void fetchAccountTest() {
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-config.xml");
		GenericDao dao = ctx.getBean(GenericDao.class);
		
		Account a =  dao.fetch(Account.class, 12345);
		System.out.println(a.getAccountNumber());
	}

}
