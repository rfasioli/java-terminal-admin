package br.inf.orion.eSafe.model.mapper.master;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import br.inf.orion.eSafe.model.master.Sistema;

public interface SistemaMapper {
	final String getAll = "SELECT \"idSistema\", \"dsSistema\"  FROM \"TB_SISTEMA\"";
	final String getByType = "SELECT \"idSistema\", \"dsSistema\"  FROM \"TB_SISTEMA\" WHERE \"idSistema\" = #{id}";
	final String deleteById = "DELETE FROM \"TB_SISTEMA\" WHERE \"idSistema\" = #{id}";
	final String update = "UPDATE \"TB_SISTEMA\"  SET \"dsSistema\"=#{descricao} WHERE \"idSistema\" = #{id}";
	final String insert = "INSERT INTO \"TB_SISTEMA\"(\"idSistema\", \"dsSistema\") VALUES (#{id}, #{descricao})";

	@Select(getAll)
	@Results(value = {
		@Result(id=true, property = "id", column = "idSistema"),
		@Result(property = "descricao", column = "dsSistema")
	})	
	List<Sistema> getAll();

	@Select(getByType)
	@Results(value = {
		@Result(id=true, property = "id", column = "idSistema"),
		@Result(property = "descricao", column = "dsSistema")
	})	
	Sistema getById(int id);

	@Update(update)
	void update(Sistema sistema);

	@Delete(deleteById)
	void delete(int id);

	@Insert(insert)
	@Options(useGeneratedKeys=true, keyProperty="idSistema")
	void insert(Sistema sistema);	
	
}
