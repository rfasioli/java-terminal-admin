package br.inf.orion.eSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import br.inf.orion.eSafe.model.UsuarioTerminal;

public interface UsuarioTerminalMapper {
	final String getAll = "SELECT \"idTerminal\", \"idUsuario\"  FROM \"TB_USUARIO_TERMINAL\"";
	final String getByTerminal = "SELECT \"idTerminal\", \"idUsuario\"  FROM \"TB_USUARIO_TERMINAL\" WHERE \"idTerminal\" = #{idTerminal}";
	final String getByUsuario = "SELECT \"idTerminal\", \"idUsuario\"  FROM \"TB_USUARIO_TERMINAL\" WHERE \"idUsuario\" = #{idUsuario}";
	final String deleteByTerminal = "DELETE FROM \"TB_USUARIO_TERMINAL\" WHERE \"idTerminal\" = #{idTerminal}";
	final String deleteByUsuario = "DELETE FROM \"TB_USUARIO_TERMINAL\" WHERE \"idTerminal\" = #{idUsuario}";
	final String deleteUnique = "DELETE FROM \"TB_USUARIO_TERMINAL\" WHERE \"idTerminal\" = #{idTerminal} AND \"idUsuario\" = #{idUsuario}";
	final String insert = "INSERT INTO \"TB_USUARIO_TERMINAL\"(\"idTerminal\", \"idUsuario\") VALUES (#{idTerminal}, #{idUsuario})";

	@Select(getAll)
	@Results(value = {
		@Result(property = "idTerminal", column = "idTerminal"),
		@Result(property = "idUsuario", column = "idUsuario")
	})	
	List<UsuarioTerminal> getAll();

	@Select(getByTerminal)
	@Results(value = {
		@Result(property = "idTerminal", column = "idTerminal"),
		@Result(property = "idUsuario", column = "idUsuario")
	})	
	List<UsuarioTerminal> getByTerminal(int idTerminal);

	@Select(getByUsuario)
	@Results(value = {
		@Result(property = "idTerminal", column = "idTerminal"),
		@Result(property = "idUsuario", column = "idUsuario")
	})	
	List<UsuarioTerminal> getByUsuario(int idUsuario);
	
	@Delete(deleteByTerminal)
	void deleteByTerminal(int idTerminal);

	@Delete(deleteByUsuario)
	void deleteByUsuario(int idUsuario);
	
	@Delete(deleteUnique)
	void deleteUnique(UsuarioTerminal usuarioTerminal);
	
	@Insert(insert)
	void insert(UsuarioTerminal usuarioTerminal);	

}
