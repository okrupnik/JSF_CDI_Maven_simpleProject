package com.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.cdi.bean.CdiBean;

@Named
@RequestScoped
public class Controller{

	@Inject
	private CdiBean cdiBean;
	
	public String doLogin() {
		if (cdiBean.getLogin().equals("admin") && cdiBean.getPassword().equals("admin")) {
			cdiBean.setLogged("Hello " + cdiBean.getLogin().toUpperCase());
		} else {
			cdiBean.setLogged("Wrong login or password");
		}
		
		return "hello";
	}
}
