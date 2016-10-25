package br.inf.orion.eSafe.model.master;

public class ClienteContato {
	private Integer idCliente;
	private Integer idSequencia;
	private Integer tipoContato;
	private String descricao;
	private String observacao;
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public Integer getIdSequencia() {
		return idSequencia;
	}
	public void setIdSequencia(Integer idSequencia) {
		this.idSequencia = idSequencia;
	}
	public Integer getTipoContato() {
		return tipoContato;
	}
	public void setTipoContato(Integer tipoContato) {
		this.tipoContato = tipoContato;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public ClienteContato () {
		super();
	}

	public ClienteContato (Integer idCliente,
						Integer idSequencia,
						Integer tipoContato,
						String descricao,
						String observacao)
	{
		super();
		this.idCliente = idCliente;
		this.idSequencia = idSequencia;
		this.tipoContato = tipoContato;
		this.descricao = descricao;
		this.observacao = observacao;
	}
	
	@Override
	public String toString(){
		return "ClienteContato: [idCliente=" + this.idCliente
							+ ", idSequencia=" + this.idSequencia 
							+ ", tipoContato=" + this.tipoContato 
							+ ", descricao=" + this.descricao 
							+ ", observacao=" + this.observacao + "]";
	}
		
}
