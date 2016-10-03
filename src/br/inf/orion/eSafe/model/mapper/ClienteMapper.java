package br.inf.orion.eSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import br.inf.orion.eSafe.model.Cliente;

public interface ClienteMapper {

	final String getAll = "SELECT \"idCliente\", \"dsNomeFantasia\", \"dsRazaoSocial\", \"dsCnpj\", \"dtCadastro\", \"icAtivo\", \"dsConexao\" FROM \"TB_CLIENTE\"";
	final String getById = "SELECT \"idCliente\", \"dsNomeFantasia\", \"dsRazaoSocial\", \"dsCnpj\", \"dtCadastro\", \"icAtivo\", \"dsConexao\" FROM \"TB_CLIENTE\" WHERE \"idCliente\" = #{id}";
	final String deleteById = "DELETE FROM \"TB_CLIENTE\"  WHERE \"idCliente\" = #{id}";
	final String update = "UPDATE \"TB_CLIENTE\" SET \"dsNomeFantasia\"=#{nomeFantasia}, \"dsRazaoSocial\"=#{razaoSocial}, \"dsCnpj\"=#{cnpj}, \"dtCadastro\"=#{dataCadastro}, \"icAtivo\"=#{ativo}, \"dsConexao\"=#{conexao} WHERE \"idCliente\" = #{id}";
	final String insert = "INSERT INTO \"TB_CLIENTE\"(\"dsNomeFantasia\", \"dsRazaoSocial\", \"dsCnpj\", \"dtCadastro\", \"icAtivo\", \"dsConexao\") VALUES (#{nomeFantasia}, #{razaoSocial}, #{cnpj}, #{dataCadastro}, #{ativo}, #{conexao})";
	
	
	@Select(getAll)
	   @Results(value = {
	      @Result(property = "id", column = "idCliente"),
	      @Result(property = "nomeFantasia", column = "dsNomeFantasia"),
	      @Result(property = "razaoSocial", column = "dsRazaoSocial"),
	      @Result(property = "cnpj", column = "dsCnpj"),       
	      @Result(property = "dataCadastro", column = "dtCadastro"),
	      @Result(property = "ativo", column = "icAtivo"),
	      @Result(property = "conexao", column = "dsConexao")	      
	   })
	List<Cliente> getAll();

	
	@Select(getById)
	   @Results(value = {
	      @Result(property = "id", column = "idCliente"),
	      @Result(property = "nomeFantasia", column = "dsNomeFantasia"),
	      @Result(property = "razaoSocial", column = "dsRazaoSocial"),
	      @Result(property = "cnpj", column = "dsCnpj"),       
	      @Result(property = "dataCadastro", column = "dtCadastro"),
	      @Result(property = "ativo", column = "icAtivo"),
	      @Result(property = "conexao", column = "dsConexao")	      
	   })
	Cliente getById(int id);

	@Update(update)
	void update(Cliente cliente);

	@Delete(deleteById)
	void delete(int id);

	@Insert(insert)
	void insert(Cliente cliente);
		
}
