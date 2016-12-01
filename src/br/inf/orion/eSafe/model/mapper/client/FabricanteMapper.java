package br.inf.orion.eSafe.model.mapper.client;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import br.inf.orion.eSafe.model.client.Fabricante;

public interface FabricanteMapper {

	final String getAll = "SELECT id_fabricante, ds_fabricante, ds_cnpj, ic_ativo FROM tb_fabricante";
	final String getById= "SELECT id_fabricante, ds_fabricante, ds_cnpj, ic_ativo FROM tb_fabricante WHERE id_fabricante = #{id}";
	final String deleteById = "DELETE FROM tb_fabricante WHERE id_fabricante = #{id}";
	final String update = "UPDATE tb_fabricante SET ds_fabricante=#{descricao}, ds_cnpj=#{cnpj}, ic_ativo=#{ativo} WHERE id_fabricante = #{id}";
	final String insert = "INSERT INTO tb_fabricante(ds_fabricante, ds_cnpj, ic_ativo) VALUES (#{descricao}, #{cnpj}, #{ativo})";

	@Select(getAll)
	@Results(value = {
			@Result(id=true, property = "id", column = "id_fabricante"),
			@Result(property = "descricao", column = "ds_fabricante"),
			@Result(property = "cnpj", column = "ds_cnpj"),
			@Result(property = "ativo", column = "ic_ativo")
	})	
	List<Fabricante> getAll();

	@Select(getById)
	@Results(value = {
			@Result(id=true, property = "id", column = "id_fabricante"),
			@Result(property = "descricao", column = "ds_fabricante"),
			@Result(property = "cnpj", column = "ds_cnpj"),
			@Result(property = "ativo", column = "ic_ativo")
	})	
	Fabricante getById(int id);

	@Update(update)
	void update(Fabricante fabricante);

	@Delete(deleteById)
	void delete(int id);

	@Insert(insert)
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(Fabricante fabricante);	

}
