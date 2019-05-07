package com.erkmen.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erkmen.demo.domain.Customer;
import com.erkmen.demo.repositories.CustomerRepository;
import com.erkmen.demo.services.CustomerService;

@Service
public class CustomerServiceImpl extends BaseServiceImpl<CustomerRepository, Customer> implements CustomerService {

	@Autowired
	public CustomerServiceImpl(CustomerRepository repository) {
		super(repository);
	}

}
