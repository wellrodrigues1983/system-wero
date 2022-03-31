package br.com.system.wero.controller;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GpController {

	@RequestMapping(method = RequestMethod.GET, path = "/login")
	public String login() {
		return "login";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/home")
	public String home() {
		return "home";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/profile")
	public String profile() {
		return "profile";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/saveUser")
	public String salvarUsuario() {

		Object usuarioLogado = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Collection<? extends GrantedAuthority> username = null;
		if (usuarioLogado instanceof UserDetails) {
			username = ((UserDetails) usuarioLogado).getAuthorities();
		} else {
			System.out.println("Sem dados");
		}
		
		System.out.println(username);
		
		return "/saveUser/salvarUsuarios";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/register")
	public String register() {
		return "register";
	}

	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String inicio() {
		return "home";
	}
}
