package br.inf.orion.eSafe.client.model.mapper;

import br.inf.orion.eSafe.client.model.AcessoUsuarioEstabelecimento;
import br.inf.orion.eSafe.client.model.example.AcessoUsuarioEstabelecimentoExample;
import br.inf.orion.eSafe.client.service.provider.AcessoUsuarioEstabelecimentoSqlProvider;

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

public interface AcessoUsuarioEstabelecimentoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = AcessoUsuarioEstabelecimentoSqlProvider.class, method = "countByExample")
	long countByExample(AcessoUsuarioEstabelecimentoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@DeleteProvider(type = AcessoUsuarioEstabelecimentoSqlProvider.class, method = "deleteByExample")
	int deleteByExample(AcessoUsuarioEstabelecimentoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Delete({ "delete from public.tb_acesso_usuario_estabelecimento",
			"where id_usuario = #{idUsuario,jdbcType=INTEGER}",
			"and id_estabelecimento = #{idEstabelecimento,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(AcessoUsuarioEstabelecimento key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Insert({ "insert into public.tb_acesso_usuario_estabelecimento (id_usuario, id_estabelecimento)",
			"values (#{idUsuario,jdbcType=INTEGER}, #{idEstabelecimento,jdbcType=INTEGER})" })
	int insert(AcessoUsuarioEstabelecimento record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@InsertProvider(type = AcessoUsuarioEstabelecimentoSqlProvider.class, method = "insertSelective")
	int insertSelective(AcessoUsuarioEstabelecimento record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = AcessoUsuarioEstabelecimentoSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id_usuario", property = "idUsuario", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "id_estabelecimento", property = "idEstabelecimento", jdbcType = JdbcType.INTEGER, id = true) })
	List<AcessoUsuarioEstabelecimento> selectByExample(AcessoUsuarioEstabelecimentoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = AcessoUsuarioEstabelecimentoSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") AcessoUsuarioEstabelecimento record,
			@Param("example") AcessoUsuarioEstabelecimentoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = AcessoUsuarioEstabelecimentoSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") AcessoUsuarioEstabelecimento record,
			@Param("example") AcessoUsuarioEstabelecimentoExample example);
}