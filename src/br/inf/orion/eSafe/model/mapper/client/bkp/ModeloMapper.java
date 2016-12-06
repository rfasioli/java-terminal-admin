package br.inf.orion.eSafe.model.mapper.client.bkp;

import br.inf.orion.eSafe.model.client.bkp.Modelo;
import br.inf.orion.eSafe.model.client.example.TbModeloExample;
import br.inf.orion.eSafe.service.provider.client.ModeloSqlProvider;

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

public interface ModeloMapper {
    @SelectProvider(type=ModeloSqlProvider.class, method="countByExample")
    long countByExample(TbModeloExample example);

    @DeleteProvider(type=ModeloSqlProvider.class, method="deleteByExample")
    int deleteByExample(TbModeloExample example);

    @Delete({
        "delete from public.tb_modelo",
        "where id_modelo = #{idModelo,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer idModelo);

    @Insert({
        "insert into public.tb_modelo (id_modelo, id_fabricante, ",
        "ds_modelo, ic_ativo)",
        "values (#{idModelo,jdbcType=INTEGER}, #{idFabricante,jdbcType=INTEGER}, ",
        "#{dsModelo,jdbcType=VARCHAR}, #{icAtivo,jdbcType=BIT})"
    })
    int insert(Modelo record);

    @InsertProvider(type=ModeloSqlProvider.class, method="insertSelective")
    int insertSelective(Modelo record);

    @SelectProvider(type=ModeloSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_modelo", property="idModelo", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="id_fabricante", property="idFabricante", jdbcType=JdbcType.INTEGER),
        @Result(column="ds_modelo", property="dsModelo", jdbcType=JdbcType.VARCHAR),
        @Result(column="ic_ativo", property="icAtivo", jdbcType=JdbcType.BIT)
    })
    List<Modelo> selectByExample(TbModeloExample example);

    @Select({
        "select",
        "id_modelo, id_fabricante, ds_modelo, ic_ativo",
        "from public.tb_modelo",
        "where id_modelo = #{idModelo,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id_modelo", property="idModelo", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="id_fabricante", property="idFabricante", jdbcType=JdbcType.INTEGER),
        @Result(column="ds_modelo", property="dsModelo", jdbcType=JdbcType.VARCHAR),
        @Result(column="ic_ativo", property="icAtivo", jdbcType=JdbcType.BIT)
    })
    Modelo selectByPrimaryKey(Integer idModelo);

    @UpdateProvider(type=ModeloSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Modelo record, @Param("example") TbModeloExample example);

    @UpdateProvider(type=ModeloSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Modelo record, @Param("example") TbModeloExample example);

    @UpdateProvider(type=ModeloSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Modelo record);

    @Update({
        "update public.tb_modelo",
        "set id_fabricante = #{idFabricante,jdbcType=INTEGER},",
          "ds_modelo = #{dsModelo,jdbcType=VARCHAR},",
          "ic_ativo = #{icAtivo,jdbcType=BIT}",
        "where id_modelo = #{idModelo,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Modelo record);
}