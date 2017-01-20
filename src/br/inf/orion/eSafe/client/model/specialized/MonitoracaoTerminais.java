package br.inf.orion.eSafe.client.model.specialized;

import br.inf.orion.eSafe.model.Terminal;

public class MonitoracaoTerminais {
	private Terminal terminal; 
	private Integer stTerminal;
	private String Data;
	
	public Terminal getTerminal() {
		return terminal;
	}
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
	public Integer getStTerminal() {
		return stTerminal;
	}
	public void setStTerminal(Integer stTerminal) {
		this.stTerminal = stTerminal;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	
	
}
