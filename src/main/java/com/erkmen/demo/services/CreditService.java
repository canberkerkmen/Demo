package com.erkmen.demo.services;

import com.erkmen.demo.domain.Credit;
import com.erkmen.demo.exceptions.DatabaseGeneralException;
import com.erkmen.demo.exceptions.SmsException;

public interface CreditService extends BaseService<Credit> {

	public Integer getScor(String kimlikNo) throws DatabaseGeneralException;

	public Integer calculateCreditLimit(Integer scor, Integer gelir) throws DatabaseGeneralException;

	public void sendSMS(Credit credit) throws SmsException;
	
}
