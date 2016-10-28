package br.inf.orion.eSafe.model.mapper.master;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import br.inf.orion.eSafe.model.master.TipoContato;

public interface TipoContatoMapper {

	final String getAll = "SELECT \"tpContato\", \"dsTipoContato\"  FROM \"TB_TIPO_CONTATO\"";
	final String getByType = "SELECT \"tpContato\", \"dsTipoContato\"  FROM \"TB_TIPO_CONTATO\" WHERE \"tpContato\" = #{tipo}";
	final String deleteById = "DELETE FROM \"TB_TIPO_CONTATO\" WHERE \"tpContato\" = #{tipo}";
	final String update = "UPDATE \"TB_TIPO_CONTATO\"  SET \"tpContato\"=#{tipo}, \"dsTipoContato\"=#{descricao} WHERE \"tpContato\" = #{tipo}";
	final String insert = "INSERT INTO \"TB_TIPO_CONTATO\"(\"tpContato\", \"dsTipoContato\") VALUES (#{tipo}, #{descricao})";

	@Select(getAll)
		@Results(value = {
				@Result(id=true, property = "tipo", column = "tpContato"),
				@Result(property = "descricao", column = "dsTipoContato")
		})	
	List<TipoContato> getAll();

	@Select(getByType)
		@Results(value = {
				@Result(id=true, property = "tipo", column = "tpContato"),
				@Result(property = "descricao", column = "dsTipoContato")
		})	
	TipoContato getByType(int tipo);

	@Update(update)
	void update(TipoContato tipoContato);

	@Delete(deleteById)
	void delete(int tipo);

	@Insert(insert)
	@Options(useGeneratedKeys=true, keyProperty="tipo")
	void insert(TipoContato tipoContato);	

}
