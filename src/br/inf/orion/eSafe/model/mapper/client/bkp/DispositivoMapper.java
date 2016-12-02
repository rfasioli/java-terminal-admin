package br.inf.orion.eSafe.model.mapper.client.bkp;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import br.inf.orion.eSafe.model.client.bkp.Dispositivo;

public interface DispositivoMapper {

	final String getAll = "SELECT id_dispositivo, ds_dispositivo FROM tb_dispositivo";
	final String getById= "SELECT id_dispositivo, ds_dispositivo FROM tb_dispositivo WHERE id_dispositivo = #{id}";
	final String deleteById = "DELETE FROM tb_dispositivo WHERE id_dispositivo = #{id}";
	final String update = "UPDATE tb_dispositivo SET ds_dispositivo=#{descricao} WHERE id_dispositivo = #{id}";
	final String insert = "INSERT INTO tb_dispositivo(ds_dispositivo) VALUES (#{descricao})";

	@Select(getAll)
	@Results(value = {
			@Result(id=true, property = "id", column = "id_dispositivo"),
			@Result(property = "descricao", column = "ds_dispositivo")
	})	
	List<Dispositivo> getAll();

	@Select(getById)
	@Results(value = {
			@Result(id=true, property = "id", column = "id_dispositivo"),
			@Result(property = "descricao", column = "ds_dispositivo")
	})	
	Dispositivo getById(int id);

	@Update(update)
	void update(Dispositivo dispositivo);

	@Delete(deleteById)
	void delete(int id);

	@Insert(insert)
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(Dispositivo dispositivo	);	

}
