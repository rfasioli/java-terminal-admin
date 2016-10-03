package br.inf.orion.eSafe.model.mapper.master;

import java.util.List;

import org.apache.ibatis.annotations.*;

import br.inf.orion.eSafe.model.master.Perfil;

public interface PerfilMapper {

	final String getAll = "SELECT \"idPerfil\", \"dsPerfil\", \"tpPerfil\", \"icNivel\", \"tpAcesso\" FROM \"TB_PERFIL\"";
	final String getById = "SELECT \"idPerfil\", \"dsPerfil\", \"tpPerfil\", \"icNivel\", \"tpAcesso\" FROM \"TB_PERFIL\" WHERE \"idPerfil\" = #{id}";
	final String deleteById = "DELETE FROM \"TB_PERFIL\" WHERE \"idPerfil\" = #{id}";
	final String update = "UPDATE \"TB_PERFIL\" SET \"dsPerfil\"=#{descricao}, \"tpPerfil\"=#{tipo}, \"icNivel\"=#{nivel}, \"tpAcesso\"=#{acesso} WHERE \"idPerfil\" = #{id}";
	final String insert = "INSERT INTO \"TB_PERFIL\"(\"dsPerfil\", \"tpPerfil\", \"icNivel\", \"tpAcesso\") VALUES (#{descricao}, #{tipo}, #{nivel}, #{acesso})";

	@Select(getAll)
	   @Results(value = {
	      @Result(property = "id", column = "idPerfil"),
	      @Result(property = "descricao", column = "dsPerfil"),
	      @Result(property = "tipo", column = "tpPerfil"),
	      @Result(property = "nivel", column = "icNivel"),       
	      @Result(property = "acesso", column = "tpAcesso")
	   })
	
	List<Perfil> getAll();

	
	@Select(getById)
	   @Results(value = {
	      @Result(property = "id", column = "idPerfil"),
	      @Result(property = "descricao", column = "dsPerfil"),
	      @Result(property = "tipo", column = "tpPerfil"),
	      @Result(property = "nivel", column = "icNivel"),       
	      @Result(property = "acesso", column = "tpAcesso")
	   })
	
	Perfil getById(int id);

	@Update(update)
	void update(Perfil perfil);

	@Delete(deleteById)
	void delete(int id);

	@Insert(insert)
	void insert(Perfil perfil);
		
}
