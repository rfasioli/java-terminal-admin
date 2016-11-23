package br.inf.orion.eSafe.model.master;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;

public class Cliente {
	private Integer id;
	
//	@NotBlank(message = "VALIDATION_NOME_FANTASIA_NOT_BLANK")
//	@Min(message = "VALIDATION_NOME_FANTASIA_MIN_SIZE", value = 2)
	@NotBlank @Min(2)
	private String nomeFantasia;

//	@NotBlank(message = "VALIDATION_RAZAO_SOCIAL_NOT_BLANK")
//	@Min(message = "VALIDATION_RAZAO_SOCIAL_MIN_SIZE", value = 3)
	@NotBlank @Min(3)
	private String razaoSocial;
	
//	@NotNull(message = "VALIDATION_CNPJ_NOT_NULL")
//	@CNPJ(message = "VALIDADION_CNPJ_INVALID")
	@NotNull @CNPJ
	private String cnpj;
	
//	@DateTimeFormat(pattern="dd/MM/yyyy")
//	@NotNull(message = "VALIDATION_DATA_CADASTRO_NOT_NULL")
	@NotNull
	private Date dataCadastro;
	
	private Boolean ativo;
	
//	@NotNull(message = "VALIDATION_CONEXAO_NOT_NULL")
	@NotNull
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
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
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

	public Cliente() {
		super();
	}
	
	public Cliente (Integer id,
					String nomeFantasia,
					String razaoSocial,
					String cnpj,
					Date dataCadastro,
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
