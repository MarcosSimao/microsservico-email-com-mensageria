package com.base.msemail.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.base.msemail.entites.Email;
import com.base.msemail.enums.StatusEmail;
import com.base.msemail.mapper.Convert;
import com.base.msemail.repositories.EmailRepository;

@Service
public class EmailService {
	@Autowired
	EmailRepository repository;
	@Autowired
	private JavaMailSender mailSender;

	@SuppressWarnings("finally")
	public Email sendEmail(Email email) {
		email.setSendDateEmail(LocalDateTime.now());
		try {

			mailSender.send(Convert.convertEmailSimple(email));
			email.setStatusEmail(StatusEmail.SEND);
		} catch (MailException e) {
			email.setStatusEmail(StatusEmail.ERROR);
			System.out.println("error"+e);
		}finally {
			return repository.save(email);
		}
		

	}

}
