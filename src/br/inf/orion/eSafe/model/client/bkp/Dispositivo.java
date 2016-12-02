package br.inf.orion.eSafe.model.client.bkp;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class Dispositivo {
	private Integer id;
	@NotEmpty @NotBlank @Min(2)
	private String descricao;
	
	public Integer getId() { return id;	}
	public void setId(Integer id) { this.id = id; }
	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	
	public Dispositivo(){
		super();
	}
	
	public Dispositivo(int p_id, String p_descricao) {
		super();
		id = p_id;
		descricao = p_descricao;
	}
	
	@Override
	public String toString(){
		return new String("Dispositivo: id=["+ id + "] descricao=[" + descricao + "]");
	}
}
