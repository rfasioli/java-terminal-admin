package br.inf.orion.eSafe.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import br.inf.orion.eSafe.model.FuncionalidadePerfil;
import br.inf.orion.eSafe.model.Perfil;

public interface FuncionalidadePerfilMapper {
	final String getAll = "SELECT \"idPerfil\", \"idFuncionalidade\"  FROM \"TB_FUNCIONALIDADE_PERFIL\"";
	final String getByPerfil = "SELECT \"idPerfil\", \"idFuncionalidade\"  FROM \"TB_FUNCIONALIDADE_PERFIL\" WHERE \"idPerfil\" = #{idPerfil}";
	final String getByFuncionalidade = "SELECT \"idPerfil\", \"idFuncionalidade\"  FROM \"TB_FUNCIONALIDADE_PERFIL\" WHERE \"idFuncionalidade\" = #{idFuncionalidade}";
	final String getPerfilByFuncionalidade = "SELECT per.\"idPerfil\", per.\"dsPerfil\", per.\"tpPerfil\", per.\"icNivel\" FROM \"TB_FUNCIONALIDADE_PERFIL\" fpe INNER JOIN \"TB_PERFIL\" per ON per.\"idPerfil\" = fpe.\"idPerfil\" WHERE \"idFuncionalidade\" = #{idFuncionalidade}";
	final String deleteByPerfil = "DELETE FROM \"TB_FUNCIONALIDADE_PERFIL\" WHERE \"idPerfil\" = #{idPerfil}";
	final String deleteByFuncionalidade = "DELETE FROM \"TB_FUNCIONALIDADE_PERFIL\" WHERE \"idFuncionalidade\" = #{idFuncionalidade}";
	final String deleteUnique = "DELETE FROM \"TB_FUNCIONALIDADE_PERFIL\" WHERE \"idPerfil\" = #{idPerfil} AND \"idFuncionalidade\" = #{idFuncionalidade}";
	final String insert = "INSERT INTO \"TB_FUNCIONALIDADE_PERFIL\"(\"idPerfil\", \"idFuncionalidade\") VALUES (#{idPerfil}, #{idFuncionalidade})";

	@Select(getAll)
	@Results(value = {
		@Result(property = "idPerfil", column = "idPerfil"),
		@Result(property = "idFuncionalidade", column = "idFuncionalidade")
	})	
	List<FuncionalidadePerfil> getAll();

	@Select(getByPerfil)
	@Results(value = {
		@Result(property = "idPerfil", column = "idPerfil"),
		@Result(property = "idFuncionalidade", column = "idFuncionalidade")
	})	
	List<FuncionalidadePerfil> getByPerfil(int idPerfil);

	@Select(getByFuncionalidade)
	@Results(value = {
		@Result(property = "idPerfil", column = "idPerfil"),
		@Result(property = "idFuncionalidade", column = "idFuncionalidade")
	})	
	List<FuncionalidadePerfil> getByFuncionalidade(int idFuncionalidade);
	
	@Select(getPerfilByFuncionalidade)
	   @Results(value = {
	      @Result(id=true, property = "id", column = "idPerfil"),
	      @Result(property = "descricao", column = "dsPerfil"),
	      @Result(property = "tipo", column = "tpPerfil"),
	      @Result(property = "nivel", column = "icNivel")
	   })
	
	List<Perfil> getPerfilByFuncionalidade(int idFuncionalidade);
	
	@Delete(deleteByPerfil)
	void deleteByPerfil(int idPerfil);

	@Delete(deleteByFuncionalidade)
	void deleteByFuncionalidade(int idFuncionalidade);
	
	@Delete(deleteUnique)
	void deleteUnique(FuncionalidadePerfil funcionalidadePerfil);
	
	@Insert(insert)
	void insert(FuncionalidadePerfil funcionalidadePerfil);	
	
}
