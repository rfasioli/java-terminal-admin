package br.inf.orion.eSafe.client.model.mongo;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.Indexes;

@Entity("statusTerminal")
@Indexes(
	@Index(value = "idTerminal", fields = @Field("idTerminal"))
)
public class StatusTerminal {
	@Id
	private ObjectId id;
	private Integer idTerminal;
	private Integer stTerminal;
	private String Data;
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	
	public Integer getIdTerminal() {
		return idTerminal;
	}
	public void setIdTerminal(Integer idTerminal) {
		this.idTerminal = idTerminal;
	}
	
	public Integer getStTerminal() {
		return stTerminal;
	}
	public void setStTerminal(Integer stTerminal) {
		this.stTerminal = stTerminal;
	}
	
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	
	public StatusTerminal() { }
	
	public StatusTerminal(br.inf.orion.eSafe.client.model.specialized.StatusTerminal statusTerminal) {
		idTerminal = statusTerminal.getIdTerminal();
		stTerminal = statusTerminal.getStTerminal();
		Data = statusTerminal.getData();
	}
}
