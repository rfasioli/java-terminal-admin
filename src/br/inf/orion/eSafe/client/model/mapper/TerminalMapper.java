package br.inf.orion.eSafe.client.model.mapper;

import br.inf.orion.eSafe.client.model.Terminal;
import br.inf.orion.eSafe.client.model.example.TerminalExample;
import br.inf.orion.eSafe.client.service.provider.TerminalSqlProvider;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TerminalMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = TerminalSqlProvider.class, method = "countByExample")
	long countByExample(TerminalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@DeleteProvider(type = TerminalSqlProvider.class, method = "deleteByExample")
	int deleteByExample(TerminalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Delete({ "delete from public.tb_terminal", "where id_terminal = #{idTerminal,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer idTerminal);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Insert({ "insert into public.tb_terminal (id_terminal, id_estabelecimento, ", "id_modelo, nr_terminal, ",
			"ds_terminal, ic_ativo)", "values (#{idTerminal,jdbcType=INTEGER}, #{idEstabelecimento,jdbcType=INTEGER}, ",
			"#{idModelo,jdbcType=INTEGER}, #{nrTerminal,jdbcType=VARCHAR}, ",
			"#{dsTerminal,jdbcType=VARCHAR}, #{icAtivo,jdbcType=BIT})" })
	int insert(Terminal record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@InsertProvider(type = TerminalSqlProvider.class, method = "insertSelective")
	int insertSelective(Terminal record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = TerminalSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id_terminal", property = "idTerminal", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "id_estabelecimento", property = "idEstabelecimento", jdbcType = JdbcType.INTEGER),
			@Result(column = "id_modelo", property = "idModelo", jdbcType = JdbcType.INTEGER),
			@Result(column = "nr_terminal", property = "nrTerminal", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ds_terminal", property = "dsTerminal", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ic_ativo", property = "icAtivo", jdbcType = JdbcType.BIT) })
	List<Terminal> selectByExample(TerminalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Select({ "select", "id_terminal, id_estabelecimento, id_modelo, nr_terminal, ds_terminal, ic_ativo",
			"from public.tb_terminal", "where id_terminal = #{idTerminal,jdbcType=INTEGER}" })
	@Results({ @Result(column = "id_terminal", property = "idTerminal", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "id_estabelecimento", property = "idEstabelecimento", jdbcType = JdbcType.INTEGER),
			@Result(column = "id_modelo", property = "idModelo", jdbcType = JdbcType.INTEGER),
			@Result(column = "nr_terminal", property = "nrTerminal", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ds_terminal", property = "dsTerminal", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ic_ativo", property = "icAtivo", jdbcType = JdbcType.BIT) })
	Terminal selectByPrimaryKey(Integer idTerminal);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = TerminalSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") Terminal record, @Param("example") TerminalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = TerminalSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") Terminal record, @Param("example") TerminalExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = TerminalSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Terminal record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Update({ "update public.tb_terminal", "set id_estabelecimento = #{idEstabelecimento,jdbcType=INTEGER},",
			"id_modelo = #{idModelo,jdbcType=INTEGER},", "nr_terminal = #{nrTerminal,jdbcType=VARCHAR},",
			"ds_terminal = #{dsTerminal,jdbcType=VARCHAR},", "ic_ativo = #{icAtivo,jdbcType=BIT}",
			"where id_terminal = #{idTerminal,jdbcType=INTEGER}" })
	int updateByPrimaryKey(Terminal record);
}