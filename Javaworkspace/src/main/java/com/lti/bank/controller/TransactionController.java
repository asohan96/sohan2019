package com.lti.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lti.bank.dao.TransactionDao;
import com.lti.bank.entity.FundTransfer;
import com.lti.bank.entity.Transaction;
import com.lti.bank.service.TransactionService;


@Controller
public class TransactionController {

	@Autowired
	private TransactionService transactionService;

	@RequestMapping(path="/transaction",method= RequestMethod.POST)
	public String fundTransfer(FundTransfer fundTransfer) {
		transactionService.MoneyTransfer(fundTransfer);
			return "redirect:/confirmation.jsp";
	
	}
	
	


}
