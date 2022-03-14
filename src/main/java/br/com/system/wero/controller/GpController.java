package br.com.system.wero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GpController {
	
	/*
	 * @RequestMapping(method = RequestMethod.GET, path = "/entrar") public String
	 * entrar() { return "entrar"; }
	 */
	
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
	
	@RequestMapping(method = RequestMethod.GET, path = "/table")
    public String table() {
        return "table";
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
