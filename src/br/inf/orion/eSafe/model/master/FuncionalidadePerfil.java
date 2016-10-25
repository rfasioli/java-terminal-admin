package br.inf.orion.eSafe.model.master;

public class FuncionalidadePerfil {
	
	private Integer idFuncionalidade;
	private Integer idPerfil;
	
	public Integer getIdFuncionalidade() {
		return idFuncionalidade;
	}
	public void setIdFuncionalidade(Integer idFuncionalidade) {
		this.idFuncionalidade = idFuncionalidade;
	}
	public Integer getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}
	
	public FuncionalidadePerfil() {
		super();
	}
	
	public FuncionalidadePerfil(Integer idFuncionalidade,
								Integer idPerfil) {
		super();
		this.idFuncionalidade = idFuncionalidade;
		this.idPerfil = idPerfil;
	}
	
	@Override
	public String toString(){
		return "FuncionalidadePerfil: [idPerfil=" + this.idPerfil
			                      + ", idFuncionalidade=" + this.idFuncionalidade + "]";
	}

	
}
