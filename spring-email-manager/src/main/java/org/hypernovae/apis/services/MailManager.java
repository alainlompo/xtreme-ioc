package org.hypernovae.apis.services;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MailManager {
	private MailSender mailSender;
	
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendMail(String authorEmail, String targetEmail, String subject, String message) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom(authorEmail);
		msg.setTo(targetEmail);
		msg.setSubject(subject);
		msg.setText(message);
		
		mailSender.send(msg);
		
	}
	
	
	
	

}
