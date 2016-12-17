package br.inf.orion.eSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import br.inf.orion.eSafe.model.Cliente;
import br.inf.orion.eSafe.model.FuncionalidadeCliente;

public interface FuncionalidadeClienteMapper {
	final String getAll = "SELECT \"idCliente\", \"idFuncionalidade\"  FROM \"TB_FUNCIONALIDADE_CLIENTE\"";
	final String getByCliente = "SELECT \"idCliente\", \"idFuncionalidade\"  FROM \"TB_FUNCIONALIDADE_CLIENTE\" WHERE \"idCliente\" = #{idCliente}";
	final String getByFuncionalidade = "SELECT \"idCliente\", \"idFuncionalidade\"  FROM \"TB_FUNCIONALIDADE_CLIENTE\" WHERE \"idFuncionalidade\" = #{idFuncionalidade}";
	final String getCliByFuncionalidade = "SELECT cli.\"idCliente\", cli.\"dsNomeFantasia\", cli.\"dsRazaoSocial\", cli.\"dsCnpj\", cli.\"dtCadastro\", cli.\"icAtivo\", cli.\"dsConexao\" FROM \"TB_FUNCIONALIDADE_CLIENTE\" fcl INNER JOIN \"TB_CLIENTE\" cli ON cli.\"idCliente\" = fcl.\"idCliente\" WHERE fcl.\"idFuncionalidade\" = #{idFuncionalidade}";
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

	@Select(getCliByFuncionalidade)
	@Results(value = {
		@Result(id=true, property = "id", column = "idCliente"),
		@Result(property = "nomeFantasia", column = "dsNomeFantasia"),
		@Result(property = "razaoSocial", column = "dsRazaoSocial"),
		@Result(property = "cnpj", column = "dsCnpj"),       
		@Result(property = "dataCadastro", column = "dtCadastro"),
		@Result(property = "ativo", column = "icAtivo"),
		@Result(property = "conexao", column = "dsConexao")	      
	})
	List<Cliente> getCliByFuncionalidade(int idFuncionalidade);
	
	@Delete(deleteByCliente)
	void deleteByCliente(int idCliente);

	@Delete(deleteByFuncionalidade)
	void deleteByFuncionalidade(int idFuncionalidade);
	
	@Delete(deleteUnique)
	void deleteUnique(FuncionalidadeCliente funcionalidadeCliente);
	
	@Insert(insert)
	void insert(FuncionalidadeCliente funcionalidadeCliente);	

}
