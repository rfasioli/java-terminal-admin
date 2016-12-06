package br.inf.orion.eSafe.client.model.mapper;

import br.inf.orion.eSafe.client.model.ContatoFilial;
import br.inf.orion.eSafe.client.model.example.ContatoFilialExample;
import br.inf.orion.eSafe.client.service.provider.ContatoFilialSqlProvider;

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

public interface ContatoFilialMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = ContatoFilialSqlProvider.class, method = "countByExample")
	long countByExample(ContatoFilialExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@DeleteProvider(type = ContatoFilialSqlProvider.class, method = "deleteByExample")
	int deleteByExample(ContatoFilialExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Delete({ "delete from public.tb_contato_filial", "where id_contato = #{idContato,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer idContato);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Insert({ "insert into public.tb_contato_filial (id_contato, id_tipo_contato, ", "ds_contato, ds_observacao, ",
			"id_filial)", "values (#{idContato,jdbcType=INTEGER}, #{idTipoContato,jdbcType=INTEGER}, ",
			"#{dsContato,jdbcType=VARCHAR}, #{dsObservacao,jdbcType=VARCHAR}, ", "#{idFilial,jdbcType=INTEGER})" })
	int insert(ContatoFilial record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@InsertProvider(type = ContatoFilialSqlProvider.class, method = "insertSelective")
	int insertSelective(ContatoFilial record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@SelectProvider(type = ContatoFilialSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id_contato", property = "idContato", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "id_tipo_contato", property = "idTipoContato", jdbcType = JdbcType.INTEGER),
			@Result(column = "ds_contato", property = "dsContato", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ds_observacao", property = "dsObservacao", jdbcType = JdbcType.VARCHAR),
			@Result(column = "id_filial", property = "idFilial", jdbcType = JdbcType.INTEGER) })
	List<ContatoFilial> selectByExample(ContatoFilialExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Select({ "select", "id_contato, id_tipo_contato, ds_contato, ds_observacao, id_filial",
			"from public.tb_contato_filial", "where id_contato = #{idContato,jdbcType=INTEGER}" })
	@Results({ @Result(column = "id_contato", property = "idContato", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "id_tipo_contato", property = "idTipoContato", jdbcType = JdbcType.INTEGER),
			@Result(column = "ds_contato", property = "dsContato", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ds_observacao", property = "dsObservacao", jdbcType = JdbcType.VARCHAR),
			@Result(column = "id_filial", property = "idFilial", jdbcType = JdbcType.INTEGER) })
	ContatoFilial selectByPrimaryKey(Integer idContato);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = ContatoFilialSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") ContatoFilial record,
			@Param("example") ContatoFilialExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = ContatoFilialSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") ContatoFilial record, @Param("example") ContatoFilialExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@UpdateProvider(type = ContatoFilialSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(ContatoFilial record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	@Update({ "update public.tb_contato_filial", "set id_tipo_contato = #{idTipoContato,jdbcType=INTEGER},",
			"ds_contato = #{dsContato,jdbcType=VARCHAR},", "ds_observacao = #{dsObservacao,jdbcType=VARCHAR},",
			"id_filial = #{idFilial,jdbcType=INTEGER}", "where id_contato = #{idContato,jdbcType=INTEGER}" })
	int updateByPrimaryKey(ContatoFilial record);
}