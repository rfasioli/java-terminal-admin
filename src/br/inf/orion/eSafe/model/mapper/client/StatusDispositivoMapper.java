package br.inf.orion.eSafe.model.mapper.client;

import br.inf.orion.eSafe.model.client.StatusDispositivo;
import br.inf.orion.eSafe.model.client.StatusDispositivoKey;
import br.inf.orion.eSafe.model.client.example.TbStatusDispositivoExample;
import br.inf.orion.eSafe.service.provider.client.StatusDispositivoSqlProvider;

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

public interface StatusDispositivoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_status_dispositivo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = StatusDispositivoSqlProvider.class, method = "countByExample")
	long countByExample(TbStatusDispositivoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_status_dispositivo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@DeleteProvider(type = StatusDispositivoSqlProvider.class, method = "deleteByExample")
	int deleteByExample(TbStatusDispositivoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_status_dispositivo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Delete({ "delete from public.tb_status_dispositivo", "where id_dispositivo = #{idDispositivo,jdbcType=INTEGER}",
			"and cd_status = #{cdStatus,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(StatusDispositivoKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_status_dispositivo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Insert({ "insert into public.tb_status_dispositivo (id_dispositivo, cd_status, ", "ds_status, id_severidade)",
			"values (#{idDispositivo,jdbcType=INTEGER}, #{cdStatus,jdbcType=INTEGER}, ",
			"#{dsStatus,jdbcType=VARCHAR}, #{idSeveridade,jdbcType=INTEGER})" })
	int insert(StatusDispositivo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_status_dispositivo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@InsertProvider(type = StatusDispositivoSqlProvider.class, method = "insertSelective")
	int insertSelective(StatusDispositivo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_status_dispositivo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = StatusDispositivoSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id_dispositivo", property = "idDispositivo", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "cd_status", property = "cdStatus", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "ds_status", property = "dsStatus", jdbcType = JdbcType.VARCHAR),
			@Result(column = "id_severidade", property = "idSeveridade", jdbcType = JdbcType.INTEGER) })
	List<StatusDispositivo> selectByExample(TbStatusDispositivoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_status_dispositivo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Select({ "select", "id_dispositivo, cd_status, ds_status, id_severidade", "from public.tb_status_dispositivo",
			"where id_dispositivo = #{idDispositivo,jdbcType=INTEGER}",
			"and cd_status = #{cdStatus,jdbcType=INTEGER}" })
	@Results({ @Result(column = "id_dispositivo", property = "idDispositivo", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "cd_status", property = "cdStatus", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "ds_status", property = "dsStatus", jdbcType = JdbcType.VARCHAR),
			@Result(column = "id_severidade", property = "idSeveridade", jdbcType = JdbcType.INTEGER) })
	StatusDispositivo selectByPrimaryKey(StatusDispositivoKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_status_dispositivo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = StatusDispositivoSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") StatusDispositivo record,
			@Param("example") TbStatusDispositivoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_status_dispositivo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = StatusDispositivoSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") StatusDispositivo record,
			@Param("example") TbStatusDispositivoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_status_dispositivo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = StatusDispositivoSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(StatusDispositivo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_status_dispositivo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Update({ "update public.tb_status_dispositivo", "set ds_status = #{dsStatus,jdbcType=VARCHAR},",
			"id_severidade = #{idSeveridade,jdbcType=INTEGER}",
			"where id_dispositivo = #{idDispositivo,jdbcType=INTEGER}",
			"and cd_status = #{cdStatus,jdbcType=INTEGER}" })
	int updateByPrimaryKey(StatusDispositivo record);
}