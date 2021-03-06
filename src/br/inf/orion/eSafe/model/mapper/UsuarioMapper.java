package br.inf.orion.eSafe.model.mapper;

import br.inf.orion.eSafe.model.Usuario;
import br.inf.orion.eSafe.model.example.UsuarioExample;
import br.inf.orion.eSafe.service.provider.UsuarioSqlProvider;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface UsuarioMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@SelectProvider(type = UsuarioSqlProvider.class, method = "countByExample")
	long countByExample(UsuarioExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@DeleteProvider(type = UsuarioSqlProvider.class, method = "deleteByExample")
	int deleteByExample(UsuarioExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@Delete({ "delete from public.tb_usuario", "where id_usuario = #{idUsuario,jdbcType=INTEGER}" })
	int deleteByPrimaryKey(Integer idUsuario);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@Insert({ "insert into public.tb_usuario (ds_login, ds_email, ", "ds_senha, ds_nome_usuario, ",
			"dt_criacao, dt_alteracao, ", "ds_token, dt_gera_token, ", "id_perfil, ic_ativo)",
			"values (#{dsLogin,jdbcType=VARCHAR}, #{dsEmail,jdbcType=VARCHAR}, ",
			"#{dsSenha,jdbcType=VARCHAR}, #{dsNomeUsuario,jdbcType=VARCHAR}, ",
			"#{dtCriacao,jdbcType=TIMESTAMP}, #{dtAlteracao,jdbcType=TIMESTAMP}, ",
			"#{dsToken,jdbcType=VARCHAR}, #{dtGeraToken,jdbcType=TIMESTAMP}, ",
			"#{idPerfil,jdbcType=INTEGER}, #{icAtivo,jdbcType=BIT})" })
	@SelectKey(statement = "SELECT currval('tb_usuario_id_usuario_seq')", keyProperty = "idUsuario", before = false, resultType = Integer.class)
	int insert(Usuario record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@InsertProvider(type = UsuarioSqlProvider.class, method = "insertSelective")
	@SelectKey(statement = "SELECT currval('tb_usuario_id_usuario_seq')", keyProperty = "idUsuario", before = false, resultType = Integer.class)
	int insertSelective(Usuario record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@SelectProvider(type = UsuarioSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "id_usuario", property = "idUsuario", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "ds_login", property = "dsLogin", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ds_email", property = "dsEmail", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ds_senha", property = "dsSenha", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ds_nome_usuario", property = "dsNomeUsuario", jdbcType = JdbcType.VARCHAR),
			@Result(column = "dt_criacao", property = "dtCriacao", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "dt_alteracao", property = "dtAlteracao", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ds_token", property = "dsToken", jdbcType = JdbcType.VARCHAR),
			@Result(column = "dt_gera_token", property = "dtGeraToken", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "id_perfil", property = "idPerfil", jdbcType = JdbcType.INTEGER),
			@Result(column = "ic_ativo", property = "icAtivo", jdbcType = JdbcType.BIT) })
	List<Usuario> selectByExample(UsuarioExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@Select({ "select", "id_usuario, ds_login, ds_email, ds_senha, ds_nome_usuario, dt_criacao, dt_alteracao, ",
			"ds_token, dt_gera_token, id_perfil, ic_ativo", "from public.tb_usuario",
			"where id_usuario = #{idUsuario,jdbcType=INTEGER}" })
	@Results({ @Result(column = "id_usuario", property = "idUsuario", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "ds_login", property = "dsLogin", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ds_email", property = "dsEmail", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ds_senha", property = "dsSenha", jdbcType = JdbcType.VARCHAR),
			@Result(column = "ds_nome_usuario", property = "dsNomeUsuario", jdbcType = JdbcType.VARCHAR),
			@Result(column = "dt_criacao", property = "dtCriacao", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "dt_alteracao", property = "dtAlteracao", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "ds_token", property = "dsToken", jdbcType = JdbcType.VARCHAR),
			@Result(column = "dt_gera_token", property = "dtGeraToken", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "id_perfil", property = "idPerfil", jdbcType = JdbcType.INTEGER),
			@Result(column = "ic_ativo", property = "icAtivo", jdbcType = JdbcType.BIT) })
	Usuario selectByPrimaryKey(Integer idUsuario);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@UpdateProvider(type = UsuarioSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") Usuario record, @Param("example") UsuarioExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@UpdateProvider(type = UsuarioSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") Usuario record, @Param("example") UsuarioExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@UpdateProvider(type = UsuarioSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Usuario record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	@Update({ "update public.tb_usuario", "set ds_login = #{dsLogin,jdbcType=VARCHAR},",
			"ds_email = #{dsEmail,jdbcType=VARCHAR},", "ds_senha = #{dsSenha,jdbcType=VARCHAR},",
			"ds_nome_usuario = #{dsNomeUsuario,jdbcType=VARCHAR},", "dt_criacao = #{dtCriacao,jdbcType=TIMESTAMP},",
			"dt_alteracao = #{dtAlteracao,jdbcType=TIMESTAMP},", "ds_token = #{dsToken,jdbcType=VARCHAR},",
			"dt_gera_token = #{dtGeraToken,jdbcType=TIMESTAMP},", "id_perfil = #{idPerfil,jdbcType=INTEGER},",
			"ic_ativo = #{icAtivo,jdbcType=BIT}", "where id_usuario = #{idUsuario,jdbcType=INTEGER}" })
	int updateByPrimaryKey(Usuario record);
}