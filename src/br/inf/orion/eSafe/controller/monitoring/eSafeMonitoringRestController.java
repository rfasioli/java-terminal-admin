package br.inf.orion.eSafe.controller.monitoring;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.inf.orion.eSafe.model.client.specialized.StatusAnalitico;
import br.inf.orion.eSafe.model.client.specialized.StatusDeviceAnalitico;
import br.inf.orion.eSafe.model.client.specialized.TotalDeposito;
import br.inf.orion.eSafe.model.client.specialized.StatusDeviceAnalitico.DeviceEnum;

@SuppressWarnings("serial")
@RestController
@RequestMapping("/monitoring/service")
public class eSafeMonitoringRestController {
	
	//TODO - Obter informações do banco de dados 

	@RequestMapping(value = "/TotaisDeposito", method = RequestMethod.GET)
	public ResponseEntity<List<TotalDeposito>> getTotaisDeposito() {
		List<TotalDeposito> totaisDeposito = new ArrayList<TotalDeposito>() {{
			add(new TotalDeposito(Date.valueOf("2016-10-06"), 345.0, 20.0, 0.0));
			add(new TotalDeposito(Date.valueOf("2016-10-05"), 200.0, 45.0, 137.95));
			add(new TotalDeposito(Date.valueOf("2016-10-04"), 587.0, 190.0, 0.0));
			add(new TotalDeposito(Date.valueOf("2016-10-03"), 450.0, 75.0, 0.0));
			add(new TotalDeposito(Date.valueOf("2016-10-02"), 120.0, 47.0, 0.0));
		}};
		
		return new ResponseEntity<List<TotalDeposito>>(totaisDeposito, HttpStatus.OK);
	}

	@RequestMapping(value = "/StatusTerminais", method = RequestMethod.GET)
	public ResponseEntity<List<StatusDeviceAnalitico>> getTerminaisDisponiveis() {
		List<StatusDeviceAnalitico> statusTerminais = new ArrayList<StatusDeviceAnalitico>() {{
			add(new StatusDeviceAnalitico(DeviceEnum.TERMINAL, new ArrayList<StatusAnalitico>() {{
				add(new StatusAnalitico(10, 15));
				add(new StatusAnalitico(11, 2));
				add(new StatusAnalitico(12, 0));
				add(new StatusAnalitico(19, 1));
			}}));
			add(new StatusDeviceAnalitico(DeviceEnum.VALIDADOR, new ArrayList<StatusAnalitico>() {{
				add(new StatusAnalitico(20, 14));
				add(new StatusAnalitico(21, 1));
				add(new StatusAnalitico(22, 3));
				add(new StatusAnalitico(29, 0));
			}}));
			add(new StatusDeviceAnalitico(DeviceEnum.IMPRESSORA, new ArrayList<StatusAnalitico>() {{
				add(new StatusAnalitico(10, 18));
				add(new StatusAnalitico(11, 0));
				add(new StatusAnalitico(12, 0));
				add(new StatusAnalitico(19, 0));
			}}));
			add(new StatusDeviceAnalitico(DeviceEnum.BIOMETRIA, new ArrayList<StatusAnalitico>() {{
				add(new StatusAnalitico(10, 17));
				add(new StatusAnalitico(11, 0));
				add(new StatusAnalitico(12, 0));
				add(new StatusAnalitico(19, 1));
			}}));
			add(new StatusDeviceAnalitico(DeviceEnum.PORTA, new ArrayList<StatusAnalitico>() {{
				add(new StatusAnalitico(10, 18));
				add(new StatusAnalitico(11, 0));
				add(new StatusAnalitico(12, 0));
				add(new StatusAnalitico(19, 0));
			}}));
		}};

		return new ResponseEntity<List<StatusDeviceAnalitico>>(statusTerminais, HttpStatus.OK);
	}

	@RequestMapping(value = "/MonitoramentoAnalitico", method = RequestMethod.GET)
	public ResponseEntity<List<StatusAnalitico>> getMonitoramentoAnalitico() {
		List<StatusAnalitico> statusAnalitico = new ArrayList<StatusAnalitico>() {{
			add(new StatusAnalitico(10, 15));
			add(new StatusAnalitico(11, 0));
			add(new StatusAnalitico(12, 1));
			add(new StatusAnalitico(19, 2));
		}};
		return new ResponseEntity<List<StatusAnalitico>>(statusAnalitico, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/NumerarioSaldoAnalitico", method = RequestMethod.GET)
	public ResponseEntity<Double> getNumerarioSaldoAnalitico() {
		return new ResponseEntity<Double>(12345678.90, HttpStatus.OK);
	}

	@RequestMapping(value = "/NumerarioRecolhidoAnalitico", method = RequestMethod.GET)
	public ResponseEntity<List<Double>> getNumerarioRecolhidoAnalitico() {
		return new ResponseEntity<List<Double>>(new ArrayList<Double>() {{ add(67854321.90); }}, HttpStatus.OK);
	}
	
}

