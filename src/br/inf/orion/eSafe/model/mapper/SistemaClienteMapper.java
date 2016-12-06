package br.inf.orion.eSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import br.inf.orion.eSafe.model.SistemaCliente;

public interface SistemaClienteMapper {
	final String getAll = "SELECT \"idSistema\", \"idCliente\"  FROM \"TB_SISTEMA_CLIENTE\"";
	final String getBySistema = "SELECT \"idSistema\", \"idCliente\"  FROM \"TB_SISTEMA_CLIENTE\" WHERE \"idSistema\" = #{idSistema}";
	final String getByCliente = "SELECT \"idSistema\", \"idCliente\"  FROM \"TB_SISTEMA_CLIENTE\" WHERE \"idCliente\" = #{idCliente}";
	final String deleteBySistema = "DELETE FROM \"TB_SISTEMA_CLIENTE\" WHERE \"idSistema\" = #{idSistema}";
	final String deleteByCliente = "DELETE FROM \"TB_SISTEMA_CLIENTE\" WHERE \"idSistema\" = #{idCliente}";
	final String deleteUnique = "DELETE FROM \"TB_SISTEMA_CLIENTE\" WHERE \"idSistema\" = #{idSistema} AND \"idCliente\" = #{idCliente}";
	final String insert = "INSERT INTO \"TB_SISTEMA_CLIENTE\"(\"idSistema\", \"idCliente\") VALUES (#{idSistema}, #{idCliente})";

	@Select(getAll)
	@Results(value = {
		@Result(property = "idSistema", column = "idSistema"),
		@Result(property = "idCliente", column = "idCliente")
	})	
	List<SistemaCliente> getAll();

	@Select(getBySistema)
	@Results(value = {
		@Result(property = "idSistema", column = "idSistema"),
		@Result(property = "idCliente", column = "idCliente")
	})	
	List<SistemaCliente> getBySistema(int idSistema);

	@Select(getByCliente)
	@Results(value = {
		@Result(property = "idSistema", column = "idSistema"),
		@Result(property = "idCliente", column = "idCliente")
	})	
	List<SistemaCliente> getByCliente(int idCliente);
	
	@Delete(deleteBySistema)
	void deleteBySistema(int idSistema);

	@Delete(deleteByCliente)
	void deleteByCliente(int idCliente);
	
	@Delete(deleteUnique)
	void deleteUnique(SistemaCliente sistemaCliente);
	
	@Insert(insert)
	void insert(SistemaCliente sistemaCliente);	
	
}
