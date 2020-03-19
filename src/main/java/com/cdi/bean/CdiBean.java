package com.cdi.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Named
@SessionScoped
public class CdiBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	@Size(min = 3, message = "Login should at least be 3 characters long")
	private String login;
	
	@NotNull
	@Size(min = 5, max = 10, message = "Please enter a valid password (5-10 characters)")
	private String password;
	
	private String logged;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogged() {
		return logged;
	}

	public void setLogged(String logged) {
		this.logged = logged;
	}


}
