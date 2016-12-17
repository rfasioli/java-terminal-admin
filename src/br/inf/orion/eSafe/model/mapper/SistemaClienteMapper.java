package br.inf.orion.eSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import br.inf.orion.eSafe.model.Cliente;
import br.inf.orion.eSafe.model.SistemaCliente;

public interface SistemaClienteMapper {
	final String getAll = "SELECT \"idSistema\", \"idCliente\"  FROM \"TB_SISTEMA_CLIENTE\"";
	final String getBySistema = "SELECT \"idSistema\", \"idCliente\"  FROM \"TB_SISTEMA_CLIENTE\" WHERE \"idSistema\" = #{idSistema}";
	final String getByCliente = "SELECT \"idSistema\", \"idCliente\"  FROM \"TB_SISTEMA_CLIENTE\" WHERE \"idCliente\" = #{idCliente}";
	final String getClienteBySistema = "SELECT \"cli.idCliente\", \"cli.dsNomeFantasia\", \"cli.dsRazaoSocial\", \"cli.dsCnpj\", \"cli.dtCadastro\", \"cli.icAtivo\", \"cli.dsConexao\"  FROM \"TB_SISTEMA_CLIENTE\" scl LEFT OUTER JOIN \"TB_CLIENTE\" cli ON cli.\"idCliente\" = scl.\"idCliente\" WHERE scl.\"idSistema\" = #{idSistema}";
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
	
	@Select(getClienteBySistema)
	@Results(value = {
		      @Result(id=true, property = "id", column = "idCliente"),
		      @Result(property = "nomeFantasia", column = "dsNomeFantasia"),
		      @Result(property = "razaoSocial", column = "dsRazaoSocial"),
		      @Result(property = "cnpj", column = "dsCnpj"),       
		      @Result(property = "dataCadastro", column = "dtCadastro"),
		      @Result(property = "ativo", column = "icAtivo"),
		      @Result(property = "conexao", column = "dsConexao")	      
		   })
		List<Cliente> getClienteBySistema(int idSistema);
	
	@Delete(deleteBySistema)
	void deleteBySistema(int idSistema);

	@Delete(deleteByCliente)
	void deleteByCliente(int idCliente);
	
	@Delete(deleteUnique)
	void deleteUnique(SistemaCliente sistemaCliente);
	
	@Insert(insert)
	void insert(SistemaCliente sistemaCliente);	
	
}
