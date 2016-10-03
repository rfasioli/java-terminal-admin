package br.inf.orion.eSafe.controller.monitoring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/monitoring")
public class eSafeMonitoringController {

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String getDashboardPanelPage() {
		return "monitoring/dashboard";
	}
	
	@RequestMapping(value = "/terminals", method = RequestMethod.GET)
	public String getTerminalsPanelPage() {
		return "monitoring/terminals";
	}
	
}
