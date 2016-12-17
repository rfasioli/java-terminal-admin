package br.inf.orion.eSafe.model;

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

	public Integer getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(Integer tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	
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
