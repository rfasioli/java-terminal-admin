package br.inf.orion.eSafe.model.mapper.master;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import br.inf.orion.eSafe.model.master.TipoEndereco;

public interface TipoEnderecoMapper {
	final String getAll = "SELECT \"tpEndereco\", \"dsTipoEndereco\"  FROM \"TB_TIPO_ENDERECO\"";
	final String getByType = "SELECT \"tpEndereco\", \"dsTipoEndereco\"  FROM \"TB_TIPO_ENDERECO\" WHERE \"tpEndereco\" = #{tipo}";
	final String deleteById = "DELETE FROM \"TB_TIPO_ENDERECO\" WHERE \"tpEndereco\" = #{tipo}";
	final String update = "UPDATE \"TB_TIPO_ENDERECO\"  SET \"tpEndereco\"=#{tipo}, \"dsTipoEndereco\"=#{descricao} WHERE \"tpEndereco\" = #{tipo}";
	final String insert = "INSERT INTO \"TB_TIPO_ENDERECO\"(\"tpEndereco\", \"dsTipoEndereco\") VALUES (#{tipo}, #{descricao})";

	@Select(getAll)
	@Results(value = {
		@Result(id=true, property = "tipo", column = "tpEndereco"),
		@Result(property = "descricao", column = "dsTipoEndereco")
	})	
	List<TipoEndereco> getAll();

	@Select(getByType)
	@Results(value = {
		@Result(id=true, property = "tipo", column = "tpEndereco"),
		@Result(property = "descricao", column = "dsTipoEndereco")
	})	
	TipoEndereco getByType(int tipo);

	@Update(update)
	void update(TipoEndereco tipoEndereco);

	@Delete(deleteById)
	void delete(int tipo);

	@Insert(insert)
	@Options(useGeneratedKeys=true, keyProperty="tipo")
	void insert(TipoEndereco tipoEndereco);	

}
