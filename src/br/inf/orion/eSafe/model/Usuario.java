package br.inf.orion.eSafe.model;

import java.util.Date;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Usuario {
	private Integer id;
	
	@NotBlank @Length(min=3, max=10, message="Tamanho deve ser entre 3 e 10")
	private String login;
	
	@NotEmpty(message="{{EMAIL_NOT_EMPTY | translate}}") @Email
	private String email;
	
	@NotEmpty(message="Senha obrigatória") @Length(min=6, message="Senha deve ter ao menos 6 caracteres")
	private String senha;
	
	private String nome;
	private Date dataCriacao;
	private Date dataAlteracao;
	private Boolean ativo;
	private String token;
	private Date dataGeracaoToken;
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
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Date getDataAlteracao() {
		return dataAlteracao;
	}
	public void setDataAlteracao(Date dataAlteracao) {
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
	public Date getDataGeracaoToken() {
		return dataGeracaoToken;
	}
	public void setDataGeracaoToken(Date dataGeracaoToken) {
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
					 Date dataCriacao,
					 Date dataAlteracao,
					 Boolean ativo,
					 String token,
					 Date dataGeracaoToken,
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
