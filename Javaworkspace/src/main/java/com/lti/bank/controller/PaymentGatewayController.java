package com.lti.bank.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.bank.dto.PrimaryAccountDTO;
import com.lti.bank.dto.SecondaryAccountDTO;
import com.lti.bank.entity.Account;
import com.lti.bank.service.PaymentGatewayService;

@SessionAttributes({"secondaryAccountDTO"})
@Controller
public class PaymentGatewayController {
	
	@Autowired
	private PaymentGatewayService paymentGatewayService;

	@RequestMapping(path="/payment-gateway",method= RequestMethod.GET)
	public String paymentGate1(SecondaryAccountDTO secondaryAccountDTO,Map<String, Object> model) {
		 model.put("secondaryAccountDTO",secondaryAccountDTO);
		 return "redirect:/atlantic-payment-gateway.jsp";
	}
	
	@RequestMapping(path="/atlantic-payment",method= RequestMethod.POST)
	public String paymentGate2(PrimaryAccountDTO primaryAccountDTO,Map<String, Object> model) {
		SecondaryAccountDTO secondaryAccountDTO = (SecondaryAccountDTO) model.get("secondaryAccountDTO");
		
		System.out.println(primaryAccountDTO);
		System.out.println(secondaryAccountDTO);
		
		Account primaryAcc=paymentGatewayService.getAccount(primaryAccountDTO.getAccountNumber());
		Account partnerAcc = paymentGatewayService.getAccount(secondaryAccountDTO.getPartnerAcno());
		
		boolean success=paymentGatewayService.transfer(partnerAcc, primaryAcc);
		 			if(success==true)
		 					return "/done.jsp";
		 			else
		 				return "/problem.jsp";
}
}
