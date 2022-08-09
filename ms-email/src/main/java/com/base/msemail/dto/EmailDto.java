package com.base.msemail.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class EmailDto {
	@NotBlank
	private String proprietario;
	@NotBlank
	@Email
	private String emailFrom;
	@NotBlank
	@Email
	private String emaiTo;
	@NotBlank
	private String subject;
	@NotBlank
	private String text;
	public EmailDto(@NotBlank String proprietario, @NotBlank @Email String emailFrom, @NotBlank @Email String emaiTo,
			@NotBlank String subject, @NotBlank String text) {
		super();
		this.proprietario = proprietario;
		this.emailFrom = emailFrom;
		this.emaiTo = emaiTo;
		this.subject = subject;
		this.text = text;
	}
	public EmailDto() {
		super();
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public String getEmailFrom() {
		return emailFrom;
	}
	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}
	public String getEmaiTo() {
		return emaiTo;
	}
	public void setEmaiTo(String emaiTo) {
		this.emaiTo = emaiTo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "EmailDto [proprietario=" + proprietario + ", emailFrom=" + emailFrom + ", emaiTo=" + emaiTo
				+ ", subject=" + subject + ", text=" + text + "]";
	}
	
	
	

	
}
