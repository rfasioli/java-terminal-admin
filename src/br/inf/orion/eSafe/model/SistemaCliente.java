package br.inf.orion.eSafe.model;

public class SistemaCliente {

	private Integer idSistema;
	private Integer idCliente;
	
	public Integer getIdSistema() {
		return idSistema;
	}
	public void setIdSistema(Integer idSistema) {
		this.idSistema = idSistema;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public SistemaCliente() {
		super();
	}
	
	public SistemaCliente(Integer idSistema,
						  Integer idCliente) {
		super();
		this.idSistema = idSistema;
		this.idCliente = idCliente;
	}
	
	@Override
	public String toString(){
		return "FuncionalidadeCliente: [idCliente=" + this.idCliente
				+ ", idSistema=" + this.idSistema + "]";
	}

}
