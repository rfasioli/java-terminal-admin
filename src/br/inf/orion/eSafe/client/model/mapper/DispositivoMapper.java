package br.inf.orion.eSafe.client.model.mapper;

import br.inf.orion.eSafe.client.model.Dispositivo;
import br.inf.orion.eSafe.client.model.example.DispositivoExample;
import br.inf.orion.eSafe.client.service.provider.DispositivoSqlProvider;

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

public interface DispositivoMapper {

	@SelectProvider(type = DispositivoSqlProvider.class, method = "countByExample")
	long countByExample(DispositivoExample example);

	@DeleteProvider(type = DispositivoSqlProvider.class, method = "deleteByExample")
	int deleteByExample(DispositivoExample example);

	@Delete({ "delete from public.tb_dispositivo", "where id_dispositivo = #{idDispositivo,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer idDispositivo);

	@Insert({ "insert into public.tb_dispositivo (id_dispositivo, ds_dispositivo)",
			"values (#{idDispositivo,jdbcType=INTEGER}, #{dsDispositivo,jdbcType=VARCHAR})" })
	int insert(Dispositivo record);

	@InsertProvider(type = DispositivoSqlProvider.class, method = "insertSelective")
	int insertSelective(Dispositivo record);

	@SelectProvider(type = DispositivoSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id_dispositivo", property = "idDispositivo", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "ds_dispositivo", property = "dsDispositivo", jdbcType = JdbcType.VARCHAR) })
	List<Dispositivo> selectByExample(DispositivoExample example);

	@Select({ "select", "id_dispositivo, ds_dispositivo", "from public.tb_dispositivo",
			"where id_dispositivo = #{idDispositivo,jdbcType=INTEGER}" })
	@Results({ @Result(column = "id_dispositivo", property = "idDispositivo", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "ds_dispositivo", property = "dsDispositivo", jdbcType = JdbcType.VARCHAR) })
	Dispositivo selectByPrimaryKey(Integer idDispositivo);

	@UpdateProvider(type = DispositivoSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") Dispositivo record, @Param("example") DispositivoExample example);

	@UpdateProvider(type = DispositivoSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") Dispositivo record, @Param("example") DispositivoExample example);

	@UpdateProvider(type = DispositivoSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Dispositivo record);

	@Update({ "update public.tb_dispositivo", "set ds_dispositivo = #{dsDispositivo,jdbcType=VARCHAR}",
			"where id_dispositivo = #{idDispositivo,jdbcType=INTEGER}" })
	int updateByPrimaryKey(Dispositivo record);
}