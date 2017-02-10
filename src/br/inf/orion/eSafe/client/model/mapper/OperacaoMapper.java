package br.inf.orion.eSafe.client.model.mapper;

import br.inf.orion.eSafe.client.model.Operacao;
import br.inf.orion.eSafe.client.model.example.OperacaoExample;
import br.inf.orion.eSafe.client.service.provider.OperacaoSqlProvider;

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

public interface OperacaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_operacao
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    @SelectProvider(type=OperacaoSqlProvider.class, method="countByExample")
    long countByExample(OperacaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_operacao
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    @DeleteProvider(type=OperacaoSqlProvider.class, method="deleteByExample")
    int deleteByExample(OperacaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_operacao
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    @Delete({
        "delete from public.tb_operacao",
        "where id_operacao = #{idOperacao,jdbcType=OTHER}"
    })
    int deleteByPrimaryKey(Object idOperacao);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_operacao
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    @Insert({
        "insert into public.tb_operacao (id_operacao, dt_operacao, ",
        "id_terminal, id_usuario, ",
        "id_transacao, vl_operacao, ",
        "cd_moeda, tp_operacao)",
        "values (#{idOperacao,jdbcType=OTHER}, #{dtOperacao,jdbcType=TIMESTAMP}, ",
        "#{idTerminal,jdbcType=INTEGER}, #{idUsuario,jdbcType=INTEGER}, ",
        "#{idTransacao,jdbcType=INTEGER}, #{vlOperacao,jdbcType=DOUBLE}, ",
        "#{cdMoeda,jdbcType=INTEGER}, #{tpOperacao,jdbcType=OTHER})"
    })
    int insert(Operacao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_operacao
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    @InsertProvider(type=OperacaoSqlProvider.class, method="insertSelective")
    int insertSelective(Operacao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_operacao
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    @SelectProvider(type=OperacaoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_operacao", property="idOperacao", jdbcType=JdbcType.OTHER, id=true),
        @Result(column="dt_operacao", property="dtOperacao", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="id_terminal", property="idTerminal", jdbcType=JdbcType.INTEGER),
        @Result(column="id_usuario", property="idUsuario", jdbcType=JdbcType.INTEGER),
        @Result(column="id_transacao", property="idTransacao", jdbcType=JdbcType.INTEGER),
        @Result(column="vl_operacao", property="vlOperacao", jdbcType=JdbcType.DOUBLE),
        @Result(column="cd_moeda", property="cdMoeda", jdbcType=JdbcType.INTEGER),
        @Result(column="tp_operacao", property="tpOperacao", jdbcType=JdbcType.OTHER)
    })
    List<Operacao> selectByExample(OperacaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_operacao
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    @Select({
        "select",
        "id_operacao, dt_operacao, id_terminal, id_usuario, id_transacao, vl_operacao, ",
        "cd_moeda, tp_operacao",
        "from public.tb_operacao",
        "where id_operacao = #{idOperacao,jdbcType=OTHER}"
    })
    @Results({
        @Result(column="id_operacao", property="idOperacao", jdbcType=JdbcType.OTHER, id=true),
        @Result(column="dt_operacao", property="dtOperacao", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="id_terminal", property="idTerminal", jdbcType=JdbcType.INTEGER),
        @Result(column="id_usuario", property="idUsuario", jdbcType=JdbcType.INTEGER),
        @Result(column="id_transacao", property="idTransacao", jdbcType=JdbcType.INTEGER),
        @Result(column="vl_operacao", property="vlOperacao", jdbcType=JdbcType.DOUBLE),
        @Result(column="cd_moeda", property="cdMoeda", jdbcType=JdbcType.INTEGER),
        @Result(column="tp_operacao", property="tpOperacao", jdbcType=JdbcType.OTHER)
    })
    Operacao selectByPrimaryKey(Object idOperacao);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_operacao
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    @UpdateProvider(type=OperacaoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Operacao record, @Param("example") OperacaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_operacao
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    @UpdateProvider(type=OperacaoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Operacao record, @Param("example") OperacaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_operacao
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    @UpdateProvider(type=OperacaoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Operacao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_operacao
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    @Update({
        "update public.tb_operacao",
        "set dt_operacao = #{dtOperacao,jdbcType=TIMESTAMP},",
          "id_terminal = #{idTerminal,jdbcType=INTEGER},",
          "id_usuario = #{idUsuario,jdbcType=INTEGER},",
          "id_transacao = #{idTransacao,jdbcType=INTEGER},",
          "vl_operacao = #{vlOperacao,jdbcType=DOUBLE},",
          "cd_moeda = #{cdMoeda,jdbcType=INTEGER},",
          "tp_operacao = #{tpOperacao,jdbcType=OTHER}",
        "where id_operacao = #{idOperacao,jdbcType=OTHER}"
    })
    int updateByPrimaryKey(Operacao record);
}