package com.erkmen.demo.services.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erkmen.demo.domain.Credit;
import com.erkmen.demo.exceptions.DatabaseGeneralException;
import com.erkmen.demo.exceptions.SmsException;
import com.erkmen.demo.repositories.CreditRepository;
import com.erkmen.demo.services.CreditService;
import com.erkmen.demo.utils.Constants;

@Service
public class CreditServiceImpl extends BaseServiceImpl<CreditRepository, Credit> implements CreditService {

	@Autowired
	public CreditServiceImpl(CreditRepository repository) {
		super(repository);
	}

	@Override
	public Integer getScor(String kimlikNo) throws DatabaseGeneralException {
		Random rand = new Random();
		return rand.nextInt(1500);
	}

	@Override
	public Integer calculateCreditLimit(Integer skor, Integer gelir) throws DatabaseGeneralException {
		try {
			if (skor >= 1000) {
				return gelir * Constants.CREDIT_LIMIT_MULTIPLIER;
			} else if (skor >= 500 && skor < 1000 && gelir < 5000) {
				return 10000;
			} else {
				return 0;
			}
		} catch (Exception e) {
			getLogger().error(e.getMessage());
			throw new DatabaseGeneralException(e.getMessage());
		}
	}

	@Override
	public void sendSMS(Credit credit) throws SmsException {
		try {
			System.out.println(credit.getCustomer().getPhoneNumber() + " telefonuna sms gönderildi.");
		} catch (Exception e) {
			getLogger().error(e.getMessage());
			throw new SmsException(e.getMessage());
		}
	}

}
