package br.inf.orion.eSafe.model.client.specialized;

public class StatusAnalitico {
	private Integer status;
	private Integer quantidade;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public StatusAnalitico() {
	}
	
	public StatusAnalitico(Integer status, Integer quantidade) {
		this.status = status;
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return new String("StatusAnalitico - status[" + this.status + "], quantidade[" + this.quantidade + "]");
	}		
}
