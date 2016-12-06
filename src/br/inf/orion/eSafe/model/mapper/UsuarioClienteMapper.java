package br.inf.orion.eSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import br.inf.orion.eSafe.model.UsuarioCliente;

public interface UsuarioClienteMapper {
	final String getAll = "SELECT \"idCliente\", \"idUsuario\"  FROM \"TB_USUARIO_CLIENTE\"";
	final String getByCliente = "SELECT \"idCliente\", \"idUsuario\"  FROM \"TB_USUARIO_CLIENTE\" WHERE \"idCliente\" = #{idCliente}";
	final String getByUsuario = "SELECT \"idCliente\", \"idUsuario\"  FROM \"TB_USUARIO_CLIENTE\" WHERE \"idUsuario\" = #{idUsuario}";
	final String deleteByCliente = "DELETE FROM \"TB_USUARIO_CLIENTE\" WHERE \"idCliente\" = #{idCliente}";
	final String deleteByUsuario = "DELETE FROM \"TB_USUARIO_CLIENTE\" WHERE \"idUsuario\" = #{idUsuario}";
	final String deleteUnique = "DELETE FROM \"TB_USUARIO_CLIENTE\" WHERE \"idCliente\" = #{idCliente} AND \"idUsuario\" = #{idUsuario}";
	final String insert = "INSERT INTO \"TB_USUARIO_CLIENTE\"(\"idCliente\", \"idUsuario\") VALUES (#{idCliente}, #{idUsuario})";

	@Select(getAll)
	@Results(value = {
		@Result(property = "idCliente", column = "idCliente"),
		@Result(property = "idUsuario", column = "idUsuario")
	})	
	List<UsuarioCliente> getAll();

	@Select(getByCliente)
	@Results(value = {
		@Result(property = "idCliente", column = "idCliente"),
		@Result(property = "idUsuario", column = "idUsuario")
	})	
	List<UsuarioCliente> getByCliente(int idCliente);

	@Select(getByUsuario)
	@Results(value = {
		@Result(property = "idCliente", column = "idCliente"),
		@Result(property = "idUsuario", column = "idUsuario")
	})	
	List<UsuarioCliente> getByUsuario(int idUsuario);
	
	@Delete(deleteByCliente)
	void deleteByCliente(int idCliente);

	@Delete(deleteByUsuario)
	void deleteByUsuario(int idUsuario);
	
	@Delete(deleteUnique)
	void deleteUnique(UsuarioCliente usuarioTerminal);
	
	@Insert(insert)
	void insert(UsuarioCliente sistemaCliente);	

}
