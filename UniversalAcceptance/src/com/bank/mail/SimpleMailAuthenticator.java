package com.bank.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;


class SimpleMailAuthenticator extends Authenticator {
	private String username = null;
	private String password = null;

	public SimpleMailAuthenticator(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(username, password);
	}
}