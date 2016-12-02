package br.inf.orion.eSafe.model.mapper.client;

import br.inf.orion.eSafe.model.client.AcessoUsuarioFornecedor;
import br.inf.orion.eSafe.model.client.example.TbAcessoUsuarioFornecedorExample;
import br.inf.orion.eSafe.service.dao.client.TbAcessoUsuarioFornecedorSqlProvider;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface AcessoUsuarioFornecedorMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = TbAcessoUsuarioFornecedorSqlProvider.class, method = "countByExample")
	long countByExample(TbAcessoUsuarioFornecedorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@DeleteProvider(type = TbAcessoUsuarioFornecedorSqlProvider.class, method = "deleteByExample")
	int deleteByExample(TbAcessoUsuarioFornecedorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Delete({ "delete from public.tb_acesso_usuario_fornecedor", "where id_usuario = #{idUsuario,jdbcType=INTEGER}",
			"and id_fornecedor = #{idFornecedor,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(AcessoUsuarioFornecedor key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Insert({ "insert into public.tb_acesso_usuario_fornecedor (id_usuario, id_fornecedor)",
			"values (#{idUsuario,jdbcType=INTEGER}, #{idFornecedor,jdbcType=INTEGER})" })
	int insert(AcessoUsuarioFornecedor record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@InsertProvider(type = TbAcessoUsuarioFornecedorSqlProvider.class, method = "insertSelective")
	int insertSelective(AcessoUsuarioFornecedor record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = TbAcessoUsuarioFornecedorSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id_usuario", property = "idUsuario", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "id_fornecedor", property = "idFornecedor", jdbcType = JdbcType.INTEGER, id = true) })
	List<AcessoUsuarioFornecedor> selectByExample(TbAcessoUsuarioFornecedorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = TbAcessoUsuarioFornecedorSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") AcessoUsuarioFornecedor record,
			@Param("example") TbAcessoUsuarioFornecedorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = TbAcessoUsuarioFornecedorSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") AcessoUsuarioFornecedor record,
			@Param("example") TbAcessoUsuarioFornecedorExample example);
}