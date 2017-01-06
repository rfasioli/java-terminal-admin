package br.inf.orion.eSafe.client.model.morphia;

import org.mongodb.morphia.annotations.Entity;

@Entity("StatusTerminal")
public class StatusTerminal extends BaseEntity 
{
	private Integer idTerminal;
	private Integer stTerminal;
	private String Data;
	
	public Integer getIdTerminal() {
		return idTerminal;
	}
	public void setIdTerminal(Integer idTerminal) {
		this.idTerminal = idTerminal;
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
	
	public StatusTerminal() { }
	
	public StatusTerminal(br.inf.orion.eSafe.client.model.specialized.StatusTerminal statusTerminal) {
		idTerminal = statusTerminal.getIdTerminal();
		stTerminal = statusTerminal.getStTerminal();
		Data = statusTerminal.getData();
	}
}
