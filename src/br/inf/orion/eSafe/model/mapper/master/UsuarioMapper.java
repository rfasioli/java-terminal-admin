package br.inf.orion.eSafe.model.mapper.master;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import br.inf.orion.eSafe.model.master.Usuario;

public interface UsuarioMapper {

	final String getAll = "SELECT \"idUsuario\", \"dsLogin\", \"dsEMail\", \"dsSenha\", \"dsNomeUsuario\", \"dtCriacao\", \"dtAlteracao\", \"icAtivo\", \"dsToken\", \"dtGeraToken\", \"idPerfil\" FROM \"TB_USUARIO\"";
	final String getById = "SELECT \"idUsuario\", \"dsLogin\", \"dsEMail\", \"dsSenha\", \"dsNomeUsuario\", \"dtCriacao\", \"dtAlteracao\", \"icAtivo\", \"dsToken\", \"dtGeraToken\", \"idPerfil\" FROM \"TB_USUARIO\" WHERE idUsuario = #{id}";
	final String deleteById = "DELETE FROM \"TB_USUARIO\" WHERE \"idUsuario\" = #{id}";
	final String update = "UPDATE \"TB_USUARIO\" SET \"dsLogin\"=#{login}, \"dsEMail\"=#{email}, \"dsSenha\"=#{senha}, \"dsNomeUsuario\"=#{nome}, \"dtCriacao\"=#{dataCriacao}, \"dtAlteracao\"=#{dataAlteracao}, \"icAtivo\"=#{ativo}, \"dsToken\"=#{token}, \"dtGeraToken\"=#{dataGeracaoToken}, \"idPerfil\"=#{idPerfil} WHERE \"idUsuario\" = #{id}";
	final String insert = "INSERT INTO \"TB_USUARIO\"(\"dsLogin\", \"dsEMail\", \"dsSenha\", \"dsNomeUsuario\", \"dtCriacao\", \"dtAlteracao\", \"icAtivo\", \"dsToken\", \"dtGeraToken\", \"idPerfil\") VALUES (#{login}, #{email}, #{senha}, #{nome}, #{dataCriacao}, #{dataAlteracao}, #{ativo}, #{token}, #{dataGeracaoToken}, #{idPerfil})";

	@Select(getAll)
	@Results(value = { @Result(id = true, property = "id", column = "idUsuario"),
			@Result(property = "login", column = "dsLogin"), 
			@Result(property = "email", column = "dsEMail"),
			@Result(property = "senha", column = "dsSenha"), 
			@Result(property = "nome", column = "dsNomeUsuario"),
			@Result(property = "dataCriacao", column = "dtCriacao"),
			@Result(property = "dataAlteracao", column = "dtAlteracao"),
			@Result(property = "ativo", column = "icAtivo"), 
			@Result(property = "token", column = "dsToken"),
			@Result(property = "dataGeracaoToken", column = "dtGeraToken"),
			@Result(property = "idPerfil", column = "idPerfil") })
	List<Usuario> getAll();

	@Select(getById)
	@Results(value = { @Result(id = true, property = "id", column = "idUsuario"),
			@Result(property = "login", column = "dsLogin"), 
			@Result(property = "email", column = "dsEMail"),
			@Result(property = "senha", column = "dsSenha"),
			@Result(property = "nome", column = "dsNomeUsuario"),
			@Result(property = "dataCriacao", column = "dtCriacao"),
			@Result(property = "dataAlteracao", column = "dtAlteracao"),
			@Result(property = "ativo", column = "icAtivo"), 
			@Result(property = "token", column = "dsToken"),
			@Result(property = "dataGeracaoToken", column = "dtGeraToken"),
			@Result(property = "idPerfil", column = "idPerfil") })
	Usuario getById(int id);

	@Update(update)
	void update(Usuario terminal);

	@Delete(deleteById)
	void deleteById(int id);

	@Insert(insert)
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void insert(Usuario terminal);
	
}

