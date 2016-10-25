package br.inf.orion.eSafe.model.master;

public class UsuarioCliente {
	private Integer idUsuario;
	private Integer idCliente;
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public UsuarioCliente(){
		super();
	}
	
	public UsuarioCliente(Integer idUsuario,
						  Integer idCliente) {
		super();
		this.idUsuario = idUsuario;
		this.idCliente = idCliente;
	}
	
	@Override
	public String toString() {
		return "UsuarioCliente: [idUsuario=" + this.idUsuario + ", " 
	                          + "idCliente=" + this.idCliente + "]";
	}
	
}
