package br.inf.orion.eSafe.model.master;

import java.io.Serializable;

import javax.validation.constraints.*;


@SuppressWarnings("serial")
public class Perfil implements Serializable {

	public enum TipoPerfilEnum{
		MASTER(0, "TIPO_PERFIL_MASTER"),
		CLIENTE(1, "TIPO_PERFIL_CLIENTE");

		private final int valor;
		private final String tag;

		TipoPerfilEnum(int valor, String tag) {
			this.valor = valor;
			this.tag = tag;
		}

		public int getValor() {
			return this.valor;
		}
		public String getTag() {
			return this.tag;
		}
	}

	public enum NivelPerfilEnum{
		MASTER(0, "NIVEL_PERFIL_MASTER"),
		CLIENTE(1, "NIVEL_PERFIL_CLIENTE"),
		REGIAO(2, "NIVEL_PERFIL_REGIAO"),
		FILIAL(3, "NIVEL_PERFIL_FILIAL"),
		FORNECEDOR(4, "NIVEL_PERFIL_FORNECEDOR"),
		ESTABELECIMENTO(5, "NIVEL_PERFIL_ESTABELECIMENTO");

		private final int valor;
		private final String tag;

		NivelPerfilEnum(int valor, String tag) {
			this.valor = valor;
			this.tag = tag;
		}

		public int getValor() {
			return this.valor;
		}
		public String getTag() {
			return this.tag;
		}
	}
	
	private Integer id;

	@NotNull
	@Size(min=3, max=100)
	private String descricao;

	@NotNull
	@Min(0)
	@Max(1)
	private Integer tipo;

	@NotNull
	@Min(0)
	@Max(5)
	private Integer nivel;

	@NotNull
	@Min(0)
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
