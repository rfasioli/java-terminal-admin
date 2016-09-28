package br.inf.orion.eSafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/query")
public class eSafeQueryController {

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String getUsersPage() {
		return "query/users";
	}

	@RequestMapping(value = "/terminals", method = RequestMethod.GET)
	public String getTerminalsPage() {
		return "query/terminals";
	}
	
}
