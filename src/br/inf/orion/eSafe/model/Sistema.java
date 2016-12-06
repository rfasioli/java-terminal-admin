package br.inf.orion.eSafe.model;

public class Sistema {
	
	private Integer id;
	private String descricao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public Sistema(){
		super();
	}
	
	public Sistema(Integer id, String descricao){
		super();
		this.id = id;
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Sistema: [id=" + this.id + ", descricao=" + this.descricao + "]";
	}
}
