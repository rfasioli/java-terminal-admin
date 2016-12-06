package br.inf.orion.eSafe.model.mapper.client;

import br.inf.orion.eSafe.model.client.UsuarioExternoTerminalKey;
import br.inf.orion.eSafe.model.client.example.TbUsuarioExternoTerminalExample;
import br.inf.orion.eSafe.service.provider.client.UsuarioExternoTerminalSqlProvider;

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

public interface UsuarioExternoTerminalMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario_externo_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = UsuarioExternoTerminalSqlProvider.class, method = "countByExample")
	long countByExample(TbUsuarioExternoTerminalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario_externo_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@DeleteProvider(type = UsuarioExternoTerminalSqlProvider.class, method = "deleteByExample")
	int deleteByExample(TbUsuarioExternoTerminalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario_externo_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Delete({ "delete from public.tb_usuario_externo_terminal", "where id_usuario = #{idUsuario,jdbcType=INTEGER}",
			"and id_terminal = #{idTerminal,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(UsuarioExternoTerminalKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario_externo_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Insert({ "insert into public.tb_usuario_externo_terminal (id_usuario, id_terminal)",
			"values (#{idUsuario,jdbcType=INTEGER}, #{idTerminal,jdbcType=INTEGER})" })
	int insert(UsuarioExternoTerminalKey record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario_externo_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@InsertProvider(type = UsuarioExternoTerminalSqlProvider.class, method = "insertSelective")
	int insertSelective(UsuarioExternoTerminalKey record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario_externo_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = UsuarioExternoTerminalSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id_usuario", property = "idUsuario", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "id_terminal", property = "idTerminal", jdbcType = JdbcType.INTEGER, id = true) })
	List<UsuarioExternoTerminalKey> selectByExample(TbUsuarioExternoTerminalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario_externo_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = UsuarioExternoTerminalSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") UsuarioExternoTerminalKey record,
			@Param("example") TbUsuarioExternoTerminalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario_externo_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = UsuarioExternoTerminalSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") UsuarioExternoTerminalKey record,
			@Param("example") TbUsuarioExternoTerminalExample example);
}