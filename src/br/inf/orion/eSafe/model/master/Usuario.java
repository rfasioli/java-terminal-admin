package br.inf.orion.eSafe.model.master;

import java.sql.Timestamp;

public class Usuario {
	private Integer id;
	private String login;
	private String email;
	private String senha;
	private String nome;
	private Timestamp dataCriacao;
	private Timestamp dataAlteracao;
	private Boolean ativo;
	private String token;
	private Timestamp dataGeracaoToken;
	private Integer idPerfil;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Timestamp getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Timestamp dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Timestamp getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(Timestamp dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	public Boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Timestamp getDataGeracaoToken() {
		return dataGeracaoToken;
	}
	public void setDataGeracaoToken(Timestamp dataGeracaoToken) {
		this.dataGeracaoToken = dataGeracaoToken;
	}
	public Integer getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}
	

	public Usuario () {
		super();
	}
	
	public Usuario (Integer id,
					 String login,
					 String email,
					 String senha,
					 String nome,
					 Timestamp dataCriacao,
					 Timestamp dataAlteracao,
					 Boolean ativo,
					 String token,
					 Timestamp dataGeracaoToken,
					 Integer idPerfil) 
	{
		super();
		this.id = id;
		this.login = login;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.dataAlteracao = dataAlteracao;
		this.ativo = ativo;
		this.token = token;
		this.dataGeracaoToken = dataGeracaoToken;
		this.idPerfil = idPerfil;
	}
	
	@Override
	public String toString(){
		return "Usuario: [id=" + this.id + ", login=" + this.login + ","
				    + " email=" + this.email + ", senha=" + this.senha + ","
				    + " nome=" + this.nome + ", dataCriacao=" + this.dataCriacao + ","
				    + " dataAlteracao=" + this.dataAlteracao + ", ativo=" + this.ativo + ","
				    + " token=" + this.token + ", dataGeracaoToken=" + this.dataGeracaoToken + ","
				    + " idPerfil=" + this.idPerfil + "]";
	}
	
}
