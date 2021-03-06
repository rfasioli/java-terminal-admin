package br.inf.orion.eSafe.client.model.mapper;

import br.inf.orion.eSafe.client.model.TipoContato;
import br.inf.orion.eSafe.client.model.example.TipoContatoExample;
import br.inf.orion.eSafe.client.service.provider.TipoContatoSqlProvider;

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

public interface TipoContatoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = TipoContatoSqlProvider.class, method = "countByExample")
	long countByExample(TipoContatoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@DeleteProvider(type = TipoContatoSqlProvider.class, method = "deleteByExample")
	int deleteByExample(TipoContatoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Delete({ "delete from public.tb_tipo_contato", "where id_tipo_contato = #{idTipoContato,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer idTipoContato);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Insert({ "insert into public.tb_tipo_contato (id_tipo_contato, ds_tipo_contato, ", "ic_ativo)",
			"values (#{idTipoContato,jdbcType=INTEGER}, #{dsTipoContato,jdbcType=VARCHAR}, ",
			"#{icAtivo,jdbcType=BIT})" })
	int insert(TipoContato record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@InsertProvider(type = TipoContatoSqlProvider.class, method = "insertSelective")
	int insertSelective(TipoContato record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = TipoContatoSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id_tipo_contato", property = "idTipoContato", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "ds_tipo_contato", property = "dsTipoContato", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ic_ativo", property = "icAtivo", jdbcType = JdbcType.BIT) })
	List<TipoContato> selectByExample(TipoContatoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Select({ "select", "id_tipo_contato, ds_tipo_contato, ic_ativo", "from public.tb_tipo_contato",
			"where id_tipo_contato = #{idTipoContato,jdbcType=INTEGER}" })
	@Results({ @Result(column = "id_tipo_contato", property = "idTipoContato", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "ds_tipo_contato", property = "dsTipoContato", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ic_ativo", property = "icAtivo", jdbcType = JdbcType.BIT) })
	TipoContato selectByPrimaryKey(Integer idTipoContato);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = TipoContatoSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") TipoContato record, @Param("example") TipoContatoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = TipoContatoSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") TipoContato record, @Param("example") TipoContatoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = TipoContatoSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(TipoContato record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Update({ "update public.tb_tipo_contato", "set ds_tipo_contato = #{dsTipoContato,jdbcType=VARCHAR},",
			"ic_ativo = #{icAtivo,jdbcType=BIT}", "where id_tipo_contato = #{idTipoContato,jdbcType=INTEGER}" })
	int updateByPrimaryKey(TipoContato record);
}