package br.inf.orion.eSafe.client.controller.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.inf.orion.eSafe.client.model.Monitoracao;
import br.inf.orion.eSafe.client.model.specialized.MonitoracaoTerminais;
import br.inf.orion.eSafe.client.model.specialized.StatusTerminal;
import br.inf.orion.eSafe.client.service.dao.MonitoracaoServiceDao;
import br.inf.orion.eSafe.client.service.dao.mongo.StatusTerminalServiceDao;
import br.inf.orion.eSafe.model.Terminal;
import br.inf.orion.eSafe.service.dao.TerminalServiceDao;

@RestController
@RequestMapping("/service/client/monitoring")
public class eSafeMonitoracaoSvcRestController {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Monitoracao>> listMonitoracao(@RequestParam(defaultValue="1") Integer idClient) {
		List<Monitoracao> monitoracao = MonitoracaoServiceDao.getAll(idClient);  
		if(monitoracao.isEmpty()){
			return new ResponseEntity<List<Monitoracao>>(monitoracao, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Monitoracao>>(monitoracao, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> addStTerminal(@RequestParam(defaultValue="1") Integer idClient
			, @RequestBody StatusTerminal stTerminal
//			, UriComponentsBuilder ucBuilder)
			)
	{
		try {
			Boolean novo = false;
			Monitoracao monitoracao = MonitoracaoServiceDao.getById(idClient, stTerminal.getIdTerminal());
			if (monitoracao == null) {
				monitoracao = new Monitoracao();
				monitoracao.setIdTerminal(stTerminal.getIdTerminal());
				novo = true;
			}
				
			monitoracao.setDtEnvio(new Date());
			monitoracao.setIcStatusTerminal(stTerminal.getStTerminal());

			//String uuid = StatusTerminalServiceDao.save(idClient, stTerminal);
			String uuid = StatusTerminalServiceDao.update(idClient, stTerminal, monitoracao.getIdMonitoracao());			
			monitoracao.setIdMonitoracao(uuid);
					
			
			if (novo)
				MonitoracaoServiceDao.save(idClient, monitoracao);
			else
				MonitoracaoServiceDao.update(idClient, monitoracao);
		}
		catch (Exception ex) {
			System.out.println(ex.toString());
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);			
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@RequestMapping(value="/terminals", method = RequestMethod.GET)
	public ResponseEntity<List<MonitoracaoTerminais>> listMonitoracaoTerminais(@RequestParam(defaultValue="1") Integer idClient) {
		List<MonitoracaoTerminais> monitoracaoTerminais = new ArrayList<MonitoracaoTerminais>();
		List<Monitoracao> monitoracao = MonitoracaoServiceDao.getAll(idClient);
		if(monitoracao.isEmpty()){
			return new ResponseEntity<List<MonitoracaoTerminais>>(monitoracaoTerminais, HttpStatus.NOT_FOUND);
		}
		try {
			for (Monitoracao item : monitoracao) {
				Terminal terminalAux = TerminalServiceDao.getByTerminal(item.getIdTerminal());
				MonitoracaoTerminais terminal = new MonitoracaoTerminais();
				
				//StatusTerminal stTerm = StatusTerminalServiceDao.getById(idClient, item.getIdMonitoracao());
				StatusTerminal stTerm = StatusTerminalServiceDao.getAll(idClient).get(0);
				
				terminal.setTerminal(terminalAux);
				terminal.setStTerminal(item.getIcStatusTerminal());
				terminal.setData(stTerm.getData());
			}			
		} catch (Exception ex) {
			System.out.println("eSafeMonitoracaoSvcRestController::listMonitoracaoTerminais - " + ex.getMessage());
			return new ResponseEntity<List<MonitoracaoTerminais>>(monitoracaoTerminais, HttpStatus.INTERNAL_SERVER_ERROR);			
		}
		return new ResponseEntity<List<MonitoracaoTerminais>>(monitoracaoTerminais, HttpStatus.OK);
	}
	
	@RequestMapping(value="/details", method = RequestMethod.GET)
	public ResponseEntity<StatusTerminal> listaDetalhe(@RequestParam(defaultValue="1") Integer idClient, @RequestParam String idMonitoracao) {
		StatusTerminal status = StatusTerminalServiceDao.getById(idClient, idMonitoracao);  
		if(status == null){
			return new ResponseEntity<StatusTerminal>(status, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<StatusTerminal>(status, HttpStatus.OK);
	}
	

}

