package br.inf.orion.eSafe.model;

public class Perfil {
	private int id;
	private String descricao;
	private int tipo;
	private int nivel;
	private int acesso;

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getTipo() {
		return tipo;
	}

	public int getNivel() {
		return nivel;
	}

	public int getAcesso() {
		return acesso;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public void setAcesso(int acesso) {
		this.acesso = acesso;
	}

	public Perfil () {
		super();
	}

	public Perfil (String descricao, int tipo, int nivel, int acesso) {
		super();
		this.descricao = descricao;
		this.tipo = tipo;
		this.nivel = nivel;
		this.acesso = acesso;
	}

	@Override
	public String toString(){
		return "Perfil: id[" + this.id + "] Descrição[" + this.descricao + "]"
				    + " Tipo[" + this.tipo + "] Nivel[" + this.nivel + "]"
				    + " Acesso[" + this.acesso + "]";
	}

}
