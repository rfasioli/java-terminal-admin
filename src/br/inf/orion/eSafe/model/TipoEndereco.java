package br.inf.orion.eSafe.model;

public class TipoEndereco {
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

	public TipoEndereco(){
		super();
	}
	
	public TipoEndereco(Integer tipo,
					    String descricao)
	{
		super();
		this.tipo = tipo;
		this.descricao = descricao;
	}

	@Override
	public String toString(){
		return "TipoEndereco: [tipo=" + this.tipo + "," +
							  "descricao=" + this.descricao + "]";
	}
	
}
