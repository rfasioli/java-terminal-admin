package br.inf.orion.eSafe.model.client.bkp;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class StatusDispositivo {
	public Integer id;
	@NotNull
	public Integer status;
	@NotEmpty @NotBlank @Min(2)
	public String descricao;
	@NotNull
	public Integer severidade;
	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	public Integer getStatus() { return status; }
	public void setStatus(Integer status) { this.status = status; }
	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	public Integer getSeveridade() { return severidade; }
	public void setSeveridade(Integer severidade) { this.severidade = severidade; }
	
	public StatusDispositivo() {
		super();
	}
	
	public StatusDispositivo(Integer p_id, Integer p_status, String p_descricao, Integer p_severidade) {
		super();
		id = p_id;
		status = p_status;
		descricao = p_descricao;
		severidade = p_severidade;
	}
	
	@Override
	public String toString() {
		return new String("StatusDispositivo: id=["+id+"]" +
											" status=["+status+"]" +
											" descricao=["+descricao+"]" +
											" severidade=["+severidade+"]");
	}

}
