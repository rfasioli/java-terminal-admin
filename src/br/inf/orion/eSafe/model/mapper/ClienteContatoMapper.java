package br.inf.orion.eSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import br.inf.orion.eSafe.model.ClienteContato;

public interface ClienteContatoMapper {
	
	final String getAll = "SELECT \"idCliente\", \"idSequencia\", \"tpContato\", \"dsContato\", \"txObservacao\" FROM \"TB_CLIENTE_CONTATO\" ORDER BY \"idCliente\"";
	final String getById = "SELECT \"idCliente\", \"idSequencia\", \"tpContato\", \"dsContato\", \"txObservacao\" FROM \"TB_CLIENTE_CONTATO\" WHERE \"idCliente\" = #{idCliente}";
	final String getUnique = "SELECT \"idCliente\", \"idSequencia\", \"tpContato\", \"dsContato\", \"txObservacao\" FROM \"TB_CLIENTE_CONTATO\" WHERE \"idCliente\" = #{idCliente} AND \"idSequencia\" = #{idSequencia}";
	final String deleteById = "DELETE FROM \"TB_CLIENTE_CONTATO\" WHERE \"idCliente\" = #{idCliente} AND \"idSequencia\" = #{idSequencia}";
	final String update = "UPDATE \"TB_CLIENTE_CONTATO\" SET \"tpContato\"=#{tipoContato}, \"dsContato\"=#{descricao}, \"txObservacao\"=#{observacao} WHERE \"idCliente\" = #{idCliente} AND \"idSequencia\" = #{idSequencia}";
	final String insert = "INSERT INTO \"TB_CLIENTE_CONTATO\"(\"idCliente\", \"idSequencia\", \"tpContato\", \"dsContato\", \"txObservacao\") VALUES (#{idCliente}, #{idSequencia}, #{tipoContato}, #{descricao}, #{observacao})";

	@Select(getAll)
	   @Results(value = {
	      @Result(property = "idCliente", column = "idCliente"),
	      @Result(property = "idSequencia", column = "idSequencia"),
	      @Result(property = "tipoContato", column = "tpContato"),
	      @Result(property = "descricao", column = "dsContato"),
	      @Result(property = "observacao", column = "txObservacao")
	   })
	List<ClienteContato> getAll();
	
	@Select(getById)
	   @Results(value = {
			      @Result(property = "idCliente", column = "idCliente"),
			      @Result(property = "idSequencia", column = "idSequencia"),
			      @Result(property = "tipoContato", column = "tpContato"),
			      @Result(property = "descricao", column = "dsContato"),
			      @Result(property = "observacao", column = "txObservacao")
			   })	
	List<ClienteContato> getByIdCliente(int idCliente);

	@Select(getUnique)
	   @Results(value = {
			      @Result(property = "idCliente", column = "idCliente"),
			      @Result(property = "idSequencia", column = "idSequencia"),
			      @Result(property = "tipoContato", column = "tpContato"),
			      @Result(property = "descricao", column = "dsContato"),
			      @Result(property = "observacao", column = "txObservacao")
			   })	
	ClienteContato getUnique(int idCliente, int idSequencia);
	
	@Update(update)
	void update(ClienteContato funcionalidade);

	@Delete(deleteById)
	void delete(int idCliente, int idSequencia);

	@Insert(insert)
	void insert(ClienteContato funcionalidade);

}
