package br.inf.orion.eSafe.model.mapper.master;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import br.inf.orion.eSafe.model.master.ClienteEndereco;

public interface ClienteEnderecoMapper {

	final String getAll = "SELECT \"idCliente\", \"idSequencia\", \"tpEndereco\", \"dsLogradouro\", \"dsCidade\", \"dsEstado\", \"nrCep\", \"dsComplemento\", \"dsBairro\" FROM \"TB_CLIENTE_ENDERECO\"";
	final String getById = "SELECT \"idCliente\", \"idSequencia\", \"tpEndereco\", \"dsLogradouro\", \"dsCidade\", \"dsEstado\", \"nrCep\", \"dsComplemento\", \"dsBairro\" FROM \"TB_CLIENTE_ENDERECO\" WHERE \"idCliente\"=#{idCliente}";
	final String getUnique = "SELECT \"idCliente\", \"idSequencia\", \"tpEndereco\", \"dsLogradouro\", \"dsCidade\", \"dsEstado\", \"nrCep\", \"dsComplemento\", \"dsBairro\" FROM \"TB_CLIENTE_ENDERECO\" WHERE \"idCliente\"=#{idCliente} AND \"idSequencia\"=#{idSequencia}";
	final String deleteById = "DELETE FROM \"TB_CLIENTE_ENDERECO\" WHERE \"idCliente\"=#{idCliente} AND \"idSequencia\"=#{idSequencia}";
	final String update = "UPDATE \"TB_CLIENTE_ENDERECO\" SET \"tpEndereco\"=#{tipoEndereco}, \"dsLogradouro\"=#{logradouro}, \"dsCidade\"=#{cidade}, \"dsEstado\"=#{estado}, \"nrCep\"=#{cep}, \"dsComplemento\"=#{complemento}, \"dsBairro\"=#{bairro} WHERE \"idCliente\"=#{idCliente} AND \"idSequencia\"=#{idSequencia}";
	final String insert = "INSERT INTO \"TB_CLIENTE_ENDERECO\"(\"idCliente\", \"idSequencia\", \"tpEndereco\", \"dsLogradouro\", \"dsCidade\", \"dsEstado\", \"nrCep\", \"dsComplemento\", \"dsBairro\") VALUES (#{idCliente}, #{idSequencia}, #{tipoEndereco}, #{logradouro}, #{cidade}, #{estado}, #{cep}, #{complemento}, #{bairro})";

	@Select(getAll)
	   @Results(value = {
	      @Result(property = "idCliente", column = "idCliente"),
	      @Result(property = "idSequencia", column = "idSequencia"),
	      @Result(property = "tipoEndereco", column = "tpEndereco"),
	      @Result(property = "logradouro", column = "dsLogradouro"),
	      @Result(property = "complemento", column = "dsComplemento"),
	      @Result(property = "bairro", column = "dsBairro"),
	      @Result(property = "cidade", column = "dsCidade"),
	      @Result(property = "estado", column = "dsEstado"),
	      @Result(property = "cep", column = "nrCep")
	   })
	List<ClienteEndereco> getAll();
	
	@Select(getById)
	   @Results(value = {
	      @Result(property = "idCliente", column = "idCliente"),
	      @Result(property = "idSequencia", column = "idSequencia"),
	      @Result(property = "tipoEndereco", column = "tpEndereco"),
	      @Result(property = "logradouro", column = "dsLogradouro"),
	      @Result(property = "complemento", column = "dsComplemento"),
	      @Result(property = "bairro", column = "dsBairro"),
	      @Result(property = "cidade", column = "dsCidade"),
	      @Result(property = "estado", column = "dsEstado"),
	      @Result(property = "cep", column = "nrCep")
	   })	
	List<ClienteEndereco> getByIdCliente(int idCliente);

	@Select(getUnique)
	   @Results(value = {
	      @Result(property = "idCliente", column = "idCliente"),
	      @Result(property = "idSequencia", column = "idSequencia"),
	      @Result(property = "tipoEndereco", column = "tpEndereco"),
	      @Result(property = "logradouro", column = "dsLogradouro"),
	      @Result(property = "complemento", column = "dsComplemento"),
	      @Result(property = "bairro", column = "dsBairro"),
	      @Result(property = "cidade", column = "dsCidade"),
	      @Result(property = "estado", column = "dsEstado"),
	      @Result(property = "cep", column = "nrCep")
	   })	
	ClienteEndereco getUnique(int idCliente, int idSequencia);
	
	@Update(update)
	void update(ClienteEndereco funcionalidade);

	@Delete(deleteById)
	void delete(int id);

	@Insert(insert)
	void insert(ClienteEndereco funcionalidade);

}
