package br.inf.orion.eSafe.model;

import java.sql.Timestamp;

public class Cliente {
	private Integer id;
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	private Timestamp dataCadastro;
	private Boolean ativo;
	private String conexao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Timestamp getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Timestamp dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public String getConexao() {
		return conexao;
	}
	public void setConexao(String conexao) {
		this.conexao = conexao;
	}

	
	public Cliente (Integer id,
					String nomeFantasia,
					String razaoSocial,
					String cnpj,
					Timestamp dataCadastro,
					Boolean ativo,
					String conexao)
	{
		super();
		this.id = id;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataCadastro = dataCadastro;
		this.ativo = ativo;
		this.conexao = conexao;
	}

	
	@Override
	public String toString(){
		return "Cliente: [id=" + this.id + ", nomeFantasia=" + this.nomeFantasia + ","
				    + " razaoSocial=" + this.razaoSocial + ", cnpj=" + this.cnpj + ","
				    + " dataCadastro=" + this.dataCadastro + ", ativo=" + this.ativo + ","
				    + " conexao=" + this.conexao + "]";
	}

}
