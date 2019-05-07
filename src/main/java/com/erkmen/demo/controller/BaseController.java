package com.erkmen.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.erkmen.demo.services.Loggable;

public abstract class BaseController implements Loggable {

	public ResponseEntity<Object> buildOKResponseEntity(Object object) {
		return new ResponseEntity<Object>(object, HttpStatus.OK);
	}

}
