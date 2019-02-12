package com.diogodurand.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.diogodurand.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
