package br.inf.orion.eSafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/system")
public class eSafeSystemController {
	
	@RequestMapping(value = "/features", method = RequestMethod.GET)
	public String getFeaturesPage() {
		return "system/features";
	}

}
