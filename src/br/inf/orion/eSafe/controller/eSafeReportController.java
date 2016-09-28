package br.inf.orion.eSafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/report")
public class eSafeReportController {

	@RequestMapping(value = "/cashflow", method = RequestMethod.GET)
	public String getCashFlowReportPage() {
		return "report/cashflow";
	}

	@RequestMapping(value = "/deposit", method = RequestMethod.GET)
	public String getDepositReportPage() {
		return "report/deposit";
	}

	@RequestMapping(value = "/closing", method = RequestMethod.GET)
	public String getClosingReportPage() {
		return "report/closing";
	}

	@RequestMapping(value = "/totalcash", method = RequestMethod.GET)
	public String getTotalCashReportPage() {
		return "report/totalcash";
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String getUsersReportPage() {
		return "report/users";
	}
}
