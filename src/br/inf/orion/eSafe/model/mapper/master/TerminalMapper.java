package br.inf.orion.eSafe.model.mapper.master;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import br.inf.orion.eSafe.model.master.Terminal;

public interface TerminalMapper {
	final String getAll = "SELECT \"idTerminal\", \"idCliente\", \"nrTerminal\"  FROM \"TB_TERMINAL\"";
	final String getById = "SELECT \"idTerminal\", \"idCliente\", \"nrTerminal\"  FROM \"TB_TERMINAL\" WHERE \"idTerminal\" = #{id}";
	final String deleteById = "DELETE FROM \"TB_TERMINAL\" WHERE \"idTerminal\" = #{id}";
	final String update = "UPDATE \"TB_TERMINAL\"  SET \"idCliente\"=#{idCliente}, \"nrTerminal\" = #{nrTerminal} WHERE \"idTerminal\" = #{idTerminal}";
	final String insert = "INSERT INTO \"TB_TERMINAL\"(\"idCliente\", \"nrTerminal\") VALUES (#{idCliente}, #{nrTerminal})";

	@Select(getAll)
	@Results(value = {
		@Result(id=true, property = "idTerminal", column = "idTerminal"),
		@Result(property = "idCliente", column = "idCliente"),
		@Result(property = "nrTerminal", column = "nrTerminal")
	})	
	List<Terminal> getAll();

	@Select(getById)
	@Results(value = {
		@Result(id=true, property = "idTerminal", column = "idTerminal"),
		@Result(property = "idCliente", column = "idCliente"),
		@Result(property = "nrTerminal", column = "nrTerminal")
	})	
	Terminal getById(int id);

	@Update(update)
	void update(Terminal terminal);

	@Delete(deleteById)
	void deleteById(int id);

	@Insert(insert)
	@Options(useGeneratedKeys=true, keyProperty="idTerminal")
	void insert(Terminal terminal);	
	
}
