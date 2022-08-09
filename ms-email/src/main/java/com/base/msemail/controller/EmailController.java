package com.base.msemail.controller;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.base.msemail.dto.EmailDto;
import com.base.msemail.entites.Email;
import com.base.msemail.mapper.Convert;
import com.base.msemail.service.EmailService;

@RestController
@RequestMapping("api/v1/registration")
public class EmailController {

	@Autowired
	EmailService service;

	@PostMapping
	public ResponseEntity<Email> sendEmail(@RequestBody @Valid EmailDto dto) {
		System.out.println("entrou");
		return new ResponseEntity<>(service.sendEmail(Convert.convertEmailDto(dto)), HttpStatus.CREATED);

	}
}
