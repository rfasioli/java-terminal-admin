package br.inf.orion.eSafe.model.client.bkp;

import javax.validation.constraints.NotNull;

public class DispositivoModelo {
	@NotNull
	public Integer idDispositivo;
	@NotNull
	public Integer idModelo;
	
	public Integer getIdDispositivo() { return idDispositivo; }
	public void setIdDispositivo(Integer idDispositivo) { this.idDispositivo = idDispositivo; }
	public Integer getIdModelo() { return idModelo; }
	public void setIdModelo(Integer idModelo) { this.idModelo = idModelo; }
	
	public DispositivoModelo(){
		super();
	}
	
	public DispositivoModelo(int idDispositivo, int idModelo) {
		super();
	}
	
	@Override
	public String toString() {
		return new String("DispositivoModelo: idDispositivo[" + idDispositivo + "] " +
											 "idModelo[" + idModelo + "]");
	}

}
