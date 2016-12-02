package br.inf.orion.eSafe.model.mapper.client;

import br.inf.orion.eSafe.model.client.Monitoracao;
import br.inf.orion.eSafe.model.client.example.TbMonitoracaoExample;
import br.inf.orion.eSafe.service.dao.client.TbMonitoracaoSqlProvider;

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

public interface MonitoracaoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = TbMonitoracaoSqlProvider.class, method = "countByExample")
	long countByExample(TbMonitoracaoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@DeleteProvider(type = TbMonitoracaoSqlProvider.class, method = "deleteByExample")
	int deleteByExample(TbMonitoracaoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Delete({ "delete from public.tb_monitoracao", "where id_terminal = #{idTerminal,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer idTerminal);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Insert({ "insert into public.tb_monitoracao (id_terminal, dt_envio, ", "ic_status_terminal)",
			"values (#{idTerminal,jdbcType=INTEGER}, #{dtEnvio,jdbcType=TIMESTAMP}, ",
			"#{icStatusTerminal,jdbcType=INTEGER})" })
	int insert(Monitoracao record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@InsertProvider(type = TbMonitoracaoSqlProvider.class, method = "insertSelective")
	int insertSelective(Monitoracao record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = TbMonitoracaoSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id_terminal", property = "idTerminal", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "dt_envio", property = "dtEnvio", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ic_status_terminal", property = "icStatusTerminal", jdbcType = JdbcType.INTEGER) })
	List<Monitoracao> selectByExample(TbMonitoracaoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Select({ "select", "id_terminal, dt_envio, ic_status_terminal", "from public.tb_monitoracao",
			"where id_terminal = #{idTerminal,jdbcType=INTEGER}" })
	@Results({ @Result(column = "id_terminal", property = "idTerminal", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "dt_envio", property = "dtEnvio", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ic_status_terminal", property = "icStatusTerminal", jdbcType = JdbcType.INTEGER) })
	Monitoracao selectByPrimaryKey(Integer idTerminal);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = TbMonitoracaoSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") Monitoracao record, @Param("example") TbMonitoracaoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = TbMonitoracaoSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") Monitoracao record, @Param("example") TbMonitoracaoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = TbMonitoracaoSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Monitoracao record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Update({ "update public.tb_monitoracao", "set dt_envio = #{dtEnvio,jdbcType=TIMESTAMP},",
			"ic_status_terminal = #{icStatusTerminal,jdbcType=INTEGER}",
			"where id_terminal = #{idTerminal,jdbcType=INTEGER}" })
	int updateByPrimaryKey(Monitoracao record);
}