package br.inf.orion.eSafe.model.master;

public class Terminal {
	private Integer idTerminal;
	private Integer idCliente;
	private String nrTerminal;
	
	public Integer getIdTerminal() {
		return idTerminal;
	}
	public void setIdTerminal(Integer idTerminal) {
		this.idTerminal = idTerminal;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNrTerminal() {
		return nrTerminal;
	}
	public void setNrTerminal(String nrTerminal) {
		this.nrTerminal = nrTerminal;
	}
	
	public Terminal() {
		super();
	}
	
	public Terminal(Integer idTerminal,
					Integer idCliente,
					String nrTerminal) {
		super();
		this.idCliente = idCliente;
		this.idTerminal = idTerminal;
		this.nrTerminal = nrTerminal;
	}
	
	@Override
	public String toString(){
		return "FuncionalidadeCliente: [idCliente=" + this.idCliente
								   + ", idTerminal=" + this.idTerminal 
								   + ", nrTerminal=" + this.nrTerminal + "]";
	}
	
	
}
