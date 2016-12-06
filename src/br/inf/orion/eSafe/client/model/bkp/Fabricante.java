package br.inf.orion.eSafe.client.model.bkp;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;
import org.hibernate.validator.constraints.br.CNPJ;

public class Fabricante {
	public Integer id;
	
	@NotBlank @NotEmpty @Min(2)
	public String descricao;
	
	@NotNull @NotBlank @CNPJ
	public String cnpj;
	
	@NotNull
	public Boolean ativo;

	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	public String getCnpj() { return cnpj; }
	public void setCnpj(String cnpj) { this.cnpj = cnpj; }
	public Boolean getAtivo() { return ativo; }
	public void setAtivo(Boolean ativo) { this.ativo = ativo; }
	
	public Fabricante() {
		super();
	}
	
	public Fabricante(Integer p_id, String p_descricao, String p_cnpj, Boolean p_ativo) {
		super();
		id = p_id;
		descricao = p_descricao;
		cnpj = p_cnpj;
		ativo = p_ativo;
	}
	
	@Override
	public String toString() {
		return new String("Fabricante: id=["+id+"]" +
										"descricao=["+descricao+"]" + 
										"cnpj=["+cnpj+"]" + 
										"ativo=["+ativo+"]");
	}
}
