package br.inf.orion.eSafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class eSafeMainController {

	@RequestMapping(method = RequestMethod.GET)
	public String getIndexPage() {
		return "home";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginPage() {
		return "login";
	}
	
}
