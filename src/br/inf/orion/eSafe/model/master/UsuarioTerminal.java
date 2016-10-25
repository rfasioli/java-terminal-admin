package br.inf.orion.eSafe.model.master;

public class UsuarioTerminal {

	private Integer idUsuario;
	private Integer idTerminal;

	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Integer getIdTerminal() {
		return idTerminal;
	}
	public void setIdTerminal(Integer idTerminal) {
		this.idTerminal = idTerminal;
	}

	public UsuarioTerminal(){
		super();
	}

	public UsuarioTerminal(Integer idUsuario,
						   Integer idTerminal) {
		super();
		this.idUsuario = idUsuario;
		this.idTerminal = idTerminal;
	}

	@Override
	public String toString() {
		return "UsuarioCliente: [idUsuario=" + this.idUsuario + ", " 
							  + "idTerminal=" + this.idTerminal + "]";
	}

}
