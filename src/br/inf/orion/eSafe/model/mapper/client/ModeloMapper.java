package br.inf.orion.eSafe.model.mapper.client;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import br.inf.orion.eSafe.model.client.Modelo;

public interface ModeloMapper {
	
	final String getAll = "SELECT id_modelo, id_fabricante, ds_modelo, ic_ativo FROM tb_modelo";
	final String getById= "SELECT id_modelo, id_fabricante, ds_modelo, ic_ativo FROM tb_modelo WHERE id_modelo = #{id}";
	final String getByFabricante= "SELECT id_modelo, id_fabricante, ds_modelo, ic_ativo FROM tb_modelo WHERE id_fabricante = #id_fabricante}";
	final String deleteById = "DELETE FROM tb_modelo WHERE id_modelo = #{id}";
	final String update = "UPDATE tb_modelo SET id_fabricante=#{id_fabricante}, ds_modelo=#{descricao}, ic_ativo=#{ativo} WHERE id_modelo = #{id}";
	final String insert = "INSERT INTO tb_modelo(id_fabricante, ds_modelo, ic_ativo) VALUES (#{id_fabricante}, #{descricao}, #{ativo})";

	@Select(getAll)
	@Results(value = {
			@Result(id=true, property = "id", column = "id_modelo"),
			@Result(property = "id_fabricante", column = "id_fabricante"),
			@Result(property = "descricao", column = "ds_modelo"),
			@Result(property = "ativo", column = "ic_ativo")
	})	
	List<Modelo> getAll();

	@Select(getById)
	@Results(value = {
			@Result(id=true, property = "id", column = "id_modelo"),
			@Result(property = "id_fabricante", column = "id_fabricante"),
			@Result(property = "descricao", column = "ds_modelo"),
			@Result(property = "ativo", column = "ic_ativo")
	})	
	Modelo getById(int id);

	@Select(getAll)
	@Results(value = {
			@Result(id=true, property = "id", column = "id_modelo"),
			@Result(property = "id_fabricante", column = "id_fabricante"),
			@Result(property = "descricao", column = "ds_modelo"),
			@Result(property = "ativo", column = "ic_ativo")
	})	
	List<Modelo> getByFabricante(int id_fabricante);
	
	@Update(update)
	void update(Modelo modelo);

	@Delete(deleteById)
	void delete(int id);

	@Insert(insert)
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(Modelo modelo);	

}

