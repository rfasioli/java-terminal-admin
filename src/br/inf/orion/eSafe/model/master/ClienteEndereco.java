package br.inf.orion.eSafe.model.master;

public class ClienteEndereco {
	private Integer idCliente;
	private Integer idSequencia;
	private Integer tipoEndereco;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
		
	public ClienteEndereco () {
		super();
	}

	public ClienteEndereco (Integer idCliente,
							Integer idSequencia,
							Integer tipoEndereco,
							String logradouro,
							String complemento,
							String bairro,
							String cidade,
							String estado,
							String cep)
	{
		super();
		this.idCliente = idCliente;
		this.idSequencia = idSequencia;
		this.tipoEndereco = tipoEndereco;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	
	@Override
	public String toString(){
		return "ClienteEndereco: [idCliente=" + this.idCliente
							+ ", idSequencia=" + this.idSequencia 
							+ ", tipoEndereco=" + this.tipoEndereco 
							+ ", logradouro=" + this.logradouro 
							+ ", complemento=" + this.complemento 
							+ ", bairro=" + this.bairro 
							+ ", cidade=" + this.cidade 
							+ ", estado=" + this.estado 
							+ ", cep=" + this.cep + "]";
	}
		
}
