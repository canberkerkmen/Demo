package com.erkmen.demo.services.impl;

import org.springframework.stereotype.Service;

import com.erkmen.demo.model.CreditResultDTO;

@Service
public class CreditResultDTOService {

	public CreditResultDTO buildCreditResultDTO(String kimlikNo, String durum, Integer limit) {
		CreditResultDTO creditResultDTO = new CreditResultDTO();
		creditResultDTO.setKimlikNo(kimlikNo);
		creditResultDTO.setDurum(durum);
		creditResultDTO.setLimit(limit);
		return creditResultDTO;
	}

}
