package br.inf.orion.eSafe.model.mapper.client;

import br.inf.orion.eSafe.model.client.AutenticacaoUsuarioExterno;
import br.inf.orion.eSafe.model.client.example.TbAutenticacaoUsuarioExternoExample;
import br.inf.orion.eSafe.service.provider.client.AutenticacaoUsuarioExternoSqlProvider;

import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface AutenticacaoUsuarioExternoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_autenticacao_usuario_externo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = AutenticacaoUsuarioExternoSqlProvider.class, method = "countByExample")
	long countByExample(TbAutenticacaoUsuarioExternoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_autenticacao_usuario_externo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@DeleteProvider(type = AutenticacaoUsuarioExternoSqlProvider.class, method = "deleteByExample")
	int deleteByExample(TbAutenticacaoUsuarioExternoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_autenticacao_usuario_externo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Insert({ "insert into public.tb_autenticacao_usuario_externo (id_usuario, id_autenticacao, ",
			"ic_ativo, dt_inclusao)", "values (#{idUsuario,jdbcType=INTEGER}, #{idAutenticacao,jdbcType=VARCHAR}, ",
			"#{icAtivo,jdbcType=BIT}, #{dtInclusao,jdbcType=TIMESTAMP})" })
	int insert(AutenticacaoUsuarioExterno record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_autenticacao_usuario_externo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@InsertProvider(type = AutenticacaoUsuarioExternoSqlProvider.class, method = "insertSelective")
	int insertSelective(AutenticacaoUsuarioExterno record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_autenticacao_usuario_externo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = AutenticacaoUsuarioExternoSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id_usuario", property = "idUsuario", jdbcType = JdbcType.INTEGER),
			@Result(column = "id_autenticacao", property = "idAutenticacao", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ic_ativo", property = "icAtivo", jdbcType = JdbcType.BIT),
			@Result(column = "dt_inclusao", property = "dtInclusao", jdbcType = JdbcType.TIMESTAMP) })
	List<AutenticacaoUsuarioExterno> selectByExample(TbAutenticacaoUsuarioExternoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_autenticacao_usuario_externo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = AutenticacaoUsuarioExternoSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") AutenticacaoUsuarioExterno record,
			@Param("example") TbAutenticacaoUsuarioExternoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_autenticacao_usuario_externo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = AutenticacaoUsuarioExternoSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") AutenticacaoUsuarioExterno record,
			@Param("example") TbAutenticacaoUsuarioExternoExample example);
}