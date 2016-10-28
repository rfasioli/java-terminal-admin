package br.inf.orion.eSafe.model.mapper.master;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import br.inf.orion.eSafe.model.master.FuncionalidadeCliente;

public interface FuncionalidadeClienteMapper {
	final String getAll = "SELECT \"idCliente\", \"idFuncionalidade\"  FROM \"TB_FUNCIONALIDADE_CLIENTE\"";
	final String getByCliente = "SELECT \"idCliente\", \"idFuncionalidade\"  FROM \"TB_FUNCIONALIDADE_CLIENTE\" WHERE \"idCliente\" = #{idCliente}";
	final String getByFuncionalidade = "SELECT \"idCliente\", \"idFuncionalidade\"  FROM \"TB_FUNCIONALIDADE_CLIENTE\" WHERE \"idFuncionalidade\" = #{idFuncionalidade}";
	final String deleteByCliente = "DELETE FROM \"TB_FUNCIONALIDADE_CLIENTE\" WHERE \"idCliente\" = #{idCliente}";
	final String deleteByFuncionalidade = "DELETE FROM \"TB_FUNCIONALIDADE_CLIENTE\" WHERE \"idFuncionalidade\" = #{idFuncionalidade}";
	final String deleteUnique = "DELETE FROM \"TB_FUNCIONALIDADE_CLIENTE\" WHERE \"idCliente\" = #{idCliente} AND \"idFuncionalidade\" = #{idFuncionalidade}";
	final String insert = "INSERT INTO \"TB_FUNCIONALIDADE_CLIENTE\"(\"idCliente\", \"idFuncionalidade\") VALUES (#{idCliente}, #{idFuncionalidade})";

	@Select(getAll)
	@Results(value = {
		@Result(property = "idCliente", column = "idCliente"),
		@Result(property = "idFuncionalidade", column = "idFuncionalidade")
	})	
	List<FuncionalidadeCliente> getAll();

	@Select(getByCliente)
	@Results(value = {
		@Result(property = "idCliente", column = "idCliente"),
		@Result(property = "idFuncionalidade", column = "idFuncionalidade")
	})	
	List<FuncionalidadeCliente> getByCliente(int idCliente);

	@Select(getByFuncionalidade)
	@Results(value = {
		@Result(property = "idCliente", column = "idCliente"),
		@Result(property = "idFuncionalidade", column = "idFuncionalidade")
	})	
	List<FuncionalidadeCliente> getByFuncionalidade(int idFuncionalidade);
	
	@Delete(deleteByCliente)
	void deleteByCliente(int idCliente);

	@Delete(deleteByFuncionalidade)
	void deleteByFuncionalidade(int idFuncionalidade);
	
	@Delete(deleteUnique)
	void deleteUnique(FuncionalidadeCliente funcionalidadeCliente);
	
	@Insert(insert)
	void insert(FuncionalidadeCliente funcionalidadeCliente);	

}
