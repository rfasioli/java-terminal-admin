package br.inf.orion.eSafe.model.mapper.master;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import br.inf.orion.eSafe.model.master.Funcionalidade;

public interface FuncionalidadeMapper {
	
	final String getAll = "SELECT \"idFuncionalidade\", \"dsFuncionalidade\", \"dsPrograma\", \"idFuncionalidadeAnterior\", \"idSequencia\", \"idSistema\", \"icAtivo\", \"dsPath\", \"dsIcone\" FROM \"TB_FUNCIONALIDADE\" ORDER BY \"idFuncionalidade\"";
	final String getById = "SELECT \"idFuncionalidade\", \"dsFuncionalidade\", \"dsPrograma\", \"idFuncionalidadeAnterior\", \"idSequencia\", \"idSistema\", \"icAtivo\", \"dsPath\", \"dsIcone\" FROM \"TB_FUNCIONALIDADE\" WHERE \"idFuncionalidade\" = #{id}";
	final String deleteById = "DELETE FROM \"TB_FUNCIONALIDADE\" WHERE \"idFuncionalidade\" = #{id}";
	final String update = "UPDATE \"TB_FUNCIONALIDADE\" SET \"dsFuncionalidade\"=#{descricao}, \"dsPrograma\"=#{programa}, \"idFuncionalidadeAnterior\"=#{funcionalidadeAnterior}, \"idSequencia\"=#{sequencia}, \"idSistema\"=#{idSistema}, \"icAtivo\"=#{Ativo}, \"dsPath\"=#{Path}, \"dsIcone\"=#{Icone} WHERE \"idFuncionalidade\" = #{id}";
	final String insert = "INSERT INTO \"TB_FUNCIONALIDADE\"(\"idFuncionalidade\", \"dsFuncionalidade\", \"dsPrograma\", \"idFuncionalidadeAnterior\",  \"idSequencia\", \"idSistema\", \"icAtivo\", \"dsPath\", \"dsIcone\") VALUES (#{id}, #{descricao}, #{programa}, #{funcionalidadeAnterior}, #{sequencia}, #{idSistema}, #{Ativo}, #{Path}, #{Icone})";

	@Select(getAll)
	   @Results(value = {
	      @Result(id=true, property = "id", column = "idFuncionalidade"),
	      @Result(property = "descricao", column = "dsFuncionalidade"),
	      @Result(property = "programa", column = "dsPrograma"),
	      @Result(property = "funcionalidadeAnterior", column = "idFuncionalidadeAnterior"),
	      @Result(property = "sequencia", column = "idSequencia"),
	      @Result(property = "idSistema", column = "idSistema"),
	      @Result(property = "Ativo", column = "icAtivo"),
	      @Result(property = "Path", column = "dsPath"),
	      @Result(property = "Icone", column = "dsIcone")
	   })
	
	List<Funcionalidade> getAll();
	
	@Select(getById)
	   @Results(value = {
	      @Result(id=true, property = "id", column = "idFuncionalidade"),
	      @Result(property = "descricao", column = "dsFuncionalidade"),
	      @Result(property = "programa", column = "dsPrograma"),
	      @Result(property = "funcionalidadeAnterior", column = "idFuncionalidadeAnterior"),
	      @Result(property = "sequencia", column = "idSequencia"),
	      @Result(property = "idSistema", column = "idSistema"),
	      @Result(property = "Ativo", column = "icAtivo"),
	      @Result(property = "Path", column = "dsPath"),
	      @Result(property = "Icone", column = "dsIcone")
	   })
	
	Funcionalidade getById(int id);

	@Update(update)
	void update(Funcionalidade funcionalidade);

	@Delete(deleteById)
	void delete(int id);

	@Insert(insert)
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(Funcionalidade funcionalidade);
	
}
