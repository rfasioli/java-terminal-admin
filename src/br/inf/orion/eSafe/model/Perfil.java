package br.inf.orion.eSafe.model;

import java.io.Serializable;


@SuppressWarnings("serial")
public class Perfil implements Serializable {
	
	private Integer id;
	private String descricao;
	private Integer tipo;
	private Integer nivel;
	private Integer acesso;

	
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

	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Integer getAcesso() {
		return acesso;
	}
	public void setAcesso(Integer acesso) {
		this.acesso = acesso;
	}

	public Perfil(){
		super();
	}
	
	public Perfil(Integer id, 
				  String descricao, 
				  Integer tipo,
				  Integer nivel,
				  Integer acesso)
	{
		super();
		this.id = id;
		this.descricao = descricao;
		this.tipo = tipo;
		this.nivel = nivel;
		this.acesso = acesso;
	}


	@Override
	public String toString(){
		return "Perfil: [id=" + this.id + ", descricao=" + this.descricao + ","
				    + " tipo=" + this.tipo + ", nivel=" + this.nivel + ","
				    + " acesso=" + this.acesso + "]";
	}

}
