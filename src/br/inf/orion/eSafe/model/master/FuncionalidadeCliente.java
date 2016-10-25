package br.inf.orion.eSafe.model.master;

public class FuncionalidadeCliente {
	Integer idCliente;
	Integer idFuncionalidade;
	
	
	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdFuncionalidade() {
		return idFuncionalidade;
	}

	public void setIdFuncionalidade(Integer idFuncionalidade) {
		this.idFuncionalidade = idFuncionalidade;
	}

	
	public FuncionalidadeCliente() {
		super();
	}
	
	public FuncionalidadeCliente(Integer idCliente,
								Integer idFuncionalidade) {
		super();
		this.idCliente = idCliente;
		this.idFuncionalidade = idFuncionalidade;
	}
	
	@Override
	public String toString(){
		return "FuncionalidadeCliente: [idCliente=" + this.idCliente
				+ ", idFuncionalidade=" + this.idFuncionalidade + "]";
	}
	
}
