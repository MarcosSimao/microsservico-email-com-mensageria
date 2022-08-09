package com.base.msemail.mapper;

import org.springframework.mail.SimpleMailMessage;

import com.base.msemail.dto.EmailDto;
import com.base.msemail.entites.Email;

public class Convert {

	
	public static Email convertEmailDto(EmailDto dto) {
		Email email= new Email();
		email.setProprietario(dto.getProprietario());
		email.setEmailFrom(dto.getEmailFrom());
		email.setEmailTo(dto.getEmaiTo());
		email.setSubject(dto.getSubject());
		email.setText(dto.getText());
		return email;
		
	}
	
	public static SimpleMailMessage convertEmailSimple(Email email) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(email.getEmailFrom());
        message.setTo(email.getEmailTo());
        message.setSubject(email.getSubject());
        message.setText(email.getText());
		return message;
		
	}
}
