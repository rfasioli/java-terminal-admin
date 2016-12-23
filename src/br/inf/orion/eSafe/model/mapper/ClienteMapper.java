package br.inf.orion.eSafe.model.mapper;

import br.inf.orion.eSafe.model.Cliente;
import br.inf.orion.eSafe.model.example.ClienteExample;
import br.inf.orion.eSafe.service.provider.ClienteSqlProvider;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.annotations.Options;

public interface ClienteMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_cliente
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@SelectProvider(type = ClienteSqlProvider.class, method = "countByExample")
	long countByExample(ClienteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_cliente
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@DeleteProvider(type = ClienteSqlProvider.class, method = "deleteByExample")
	int deleteByExample(ClienteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_cliente
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@Delete({ "delete from public.tb_cliente", "where id_cliente = #{idCliente,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer idCliente);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_cliente
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@Insert({ "insert into public.tb_cliente (ds_nome_fantasia, ds_razao_social, ", "ds_cnpj, dt_cadastro, ",
			"ic_ativo, ds_conexao, ", "ds_sigla)",
			"values (#{dsNomeFantasia,jdbcType=VARCHAR}, #{dsRazaoSocial,jdbcType=VARCHAR}, ",
			"#{dsCnpj,jdbcType=VARCHAR}, #{dtCadastro,jdbcType=TIMESTAMP}, ",
			"#{icAtivo,jdbcType=BIT}, #{dsConexao,jdbcType=VARCHAR}, ", "#{dsSigla,jdbcType=VARCHAR})" })
	@Options(useGeneratedKeys = true, keyProperty = "idCliente")
	@SelectKey(statement = "SELECT currval('tb_cliente_id_cliente_seq')", keyProperty = "idCliente", before = false, resultType = Integer.class)
	int insert(Cliente record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_cliente
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@InsertProvider(type = ClienteSqlProvider.class, method = "insertSelective")
	@Options(useGeneratedKeys = true, keyProperty = "idCliente")
	@SelectKey(statement = "SELECT currval('tb_cliente_id_cliente_seq')", keyProperty = "idCliente", before = false, resultType = Integer.class)
	int insertSelective(Cliente record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_cliente
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@SelectProvider(type = ClienteSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id_cliente", property = "idCliente", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "ds_nome_fantasia", property = "dsNomeFantasia", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ds_razao_social", property = "dsRazaoSocial", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ds_cnpj", property = "dsCnpj", jdbcType = JdbcType.VARCHAR),
			@Result(column = "dt_cadastro", property = "dtCadastro", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ic_ativo", property = "icAtivo", jdbcType = JdbcType.BIT),
			@Result(column = "ds_conexao", property = "dsConexao", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ds_sigla", property = "dsSigla", jdbcType = JdbcType.VARCHAR) })
	List<Cliente> selectByExample(ClienteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_cliente
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@Select({ "select", "id_cliente, ds_nome_fantasia, ds_razao_social, ds_cnpj, dt_cadastro, ic_ativo, ",
			"ds_conexao, ds_sigla", "from public.tb_cliente", "where id_cliente = #{idCliente,jdbcType=INTEGER}" })
	@Results({ @Result(column = "id_cliente", property = "idCliente", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "ds_nome_fantasia", property = "dsNomeFantasia", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ds_razao_social", property = "dsRazaoSocial", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ds_cnpj", property = "dsCnpj", jdbcType = JdbcType.VARCHAR),
			@Result(column = "dt_cadastro", property = "dtCadastro", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ic_ativo", property = "icAtivo", jdbcType = JdbcType.BIT),
			@Result(column = "ds_conexao", property = "dsConexao", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ds_sigla", property = "dsSigla", jdbcType = JdbcType.VARCHAR) })
	Cliente selectByPrimaryKey(Integer idCliente);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_cliente
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@UpdateProvider(type = ClienteSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") Cliente record, @Param("example") ClienteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_cliente
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@UpdateProvider(type = ClienteSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") Cliente record, @Param("example") ClienteExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_cliente
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@UpdateProvider(type = ClienteSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Cliente record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_cliente
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@Update({ "update public.tb_cliente", "set ds_nome_fantasia = #{dsNomeFantasia,jdbcType=VARCHAR},",
			"ds_razao_social = #{dsRazaoSocial,jdbcType=VARCHAR},", "ds_cnpj = #{dsCnpj,jdbcType=VARCHAR},",
			"dt_cadastro = #{dtCadastro,jdbcType=TIMESTAMP},", "ic_ativo = #{icAtivo,jdbcType=BIT},",
			"ds_conexao = #{dsConexao,jdbcType=VARCHAR},", "ds_sigla = #{dsSigla,jdbcType=VARCHAR}",
			"where id_cliente = #{idCliente,jdbcType=INTEGER}" })
	int updateByPrimaryKey(Cliente record);
}