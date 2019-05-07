package com.erkmen.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erkmen.demo.domain.Credit;
import com.erkmen.demo.domain.Customer;
import com.erkmen.demo.model.CreditDTO;
import com.erkmen.demo.model.CreditResultDTO;
import com.erkmen.demo.services.CreditService;
import com.erkmen.demo.services.CustomerService;
import com.erkmen.demo.services.impl.CreditResultDTOService;
import com.erkmen.demo.utils.Enums.ApplicationStatus;

@RestController
@RequestMapping("api")
public class Controller extends BaseController {

	@Autowired
	private CreditService creditService;

	@Autowired
	private CreditResultDTOService creditResultDTOService;

	@Autowired
	private CustomerService customerService;

	@PostMapping("/processGetScor")
	public ResponseEntity<Object> processGetScor(@RequestBody CreditDTO creditDTO) {
		Customer customer = new Customer(creditDTO.getAd(), creditDTO.getSoyad(), creditDTO.getKimlikNo(), creditDTO.getGelir(),
				creditDTO.getCepTel());
		customerService.save(customer);
		Integer skor = creditService.getScor(customer.getKimlikNo());
		Integer creditLimit = creditService.calculateCreditLimit(skor, customer.getGelir());
		ApplicationStatus status = creditLimit.equals(0) ? ApplicationStatus.RED : ApplicationStatus.ONAY;
		Credit credit = new Credit(skor, status, creditLimit, customer);
		customer.addCredit(credit);
		customerService.save(customer);
		creditService.sendSMS(credit);
		CreditResultDTO creditResultDTO = creditResultDTOService.buildCreditResultDTO(customer.getKimlikNo(), credit.getStatus().getMessage(),
				credit.getCreditLimit());
		return buildOKResponseEntity(creditResultDTO);
	}

}
