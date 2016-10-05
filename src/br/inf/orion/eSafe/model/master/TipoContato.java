package br.inf.orion.eSafe.model.master;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TipoContato implements Serializable {
	
	private Integer tipo;
	private String descricao;
	
	
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoContato(){
		super();
	}
	
	public TipoContato(Integer tipo,
					   String descricao)
	{
		super();
		this.tipo = tipo;
		this.descricao = descricao;
	}

	@Override
	public String toString(){
		return "Tipo Contato: [tipo=" + this.tipo + "," +
							  "descricao=" + this.descricao + "]";
	}
	
}
