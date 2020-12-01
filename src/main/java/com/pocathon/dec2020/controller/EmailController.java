package com.pocathon.dec2020.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pocathon.dec2020.service.EmailService;

@RestController
@RequestMapping(value="/email")
public class EmailController {
	
	@Autowired
	EmailService emailService;
	
	@RequestMapping(value="/send-email", method=RequestMethod.PUT) 
	public ResponseEntity<?> sendEmail() {
		emailService.prepareAndSendEmail();
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
