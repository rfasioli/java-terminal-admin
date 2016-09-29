package br.inf.orion.eSafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/management")
public class eSafeManagementController {
	
	@RequestMapping(value = "/client", method = RequestMethod.GET)
	public String getClientPage() {
		return "management/client";
	}

	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String getProfilePage() {
		return "management/profile";
	}
	
}
