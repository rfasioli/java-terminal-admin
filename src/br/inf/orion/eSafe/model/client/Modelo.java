package br.inf.orion.eSafe.model.client;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Modelo {
	public Integer id;
	
	@NotNull
	public Integer id_fabricante;
	
	@NotEmpty @NotBlank @Min(2)
	public String descricao;
	
	@NotNull
	public Boolean ativo;
	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public Integer getId_fabricante() { return id_fabricante; }
	public void setId_fabricante(Integer id_fabricante) { this.id_fabricante = id_fabricante; }
	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	public Boolean getAtivo() { return ativo; }
	public void setAtivo(Boolean ativo) { this.ativo = ativo; }
	
	public Modelo(){
		super();
	}
	
	public Modelo(Integer p_id,
				  Integer p_id_fabricante,
				  String p_descricao,
				  Boolean p_ativo) {
		super();
		id = p_id;
		id_fabricante = p_id_fabricante;
		descricao = p_descricao;
		ativo = p_ativo;
	}
	
	@Override
	public String toString(){
		return new String("Modelo: id=["+id+"] " + 
								  "id_fabricante=["+id_fabricante+"] "+
								  "descricao=["+descricao+"] " + 
								  "ativo=["+ativo+"]");
	}
}
