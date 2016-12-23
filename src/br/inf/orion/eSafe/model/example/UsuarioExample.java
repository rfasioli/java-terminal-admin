package br.inf.orion.eSafe.model.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsuarioExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public UsuarioExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdUsuarioIsNull() {
			addCriterion("id_usuario is null");
			return (Criteria) this;
		}

		public Criteria andIdUsuarioIsNotNull() {
			addCriterion("id_usuario is not null");
			return (Criteria) this;
		}

		public Criteria andIdUsuarioEqualTo(Integer value) {
			addCriterion("id_usuario =", value, "idUsuario");
			return (Criteria) this;
		}

		public Criteria andIdUsuarioNotEqualTo(Integer value) {
			addCriterion("id_usuario <>", value, "idUsuario");
			return (Criteria) this;
		}

		public Criteria andIdUsuarioGreaterThan(Integer value) {
			addCriterion("id_usuario >", value, "idUsuario");
			return (Criteria) this;
		}

		public Criteria andIdUsuarioGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_usuario >=", value, "idUsuario");
			return (Criteria) this;
		}

		public Criteria andIdUsuarioLessThan(Integer value) {
			addCriterion("id_usuario <", value, "idUsuario");
			return (Criteria) this;
		}

		public Criteria andIdUsuarioLessThanOrEqualTo(Integer value) {
			addCriterion("id_usuario <=", value, "idUsuario");
			return (Criteria) this;
		}

		public Criteria andIdUsuarioIn(List<Integer> values) {
			addCriterion("id_usuario in", values, "idUsuario");
			return (Criteria) this;
		}

		public Criteria andIdUsuarioNotIn(List<Integer> values) {
			addCriterion("id_usuario not in", values, "idUsuario");
			return (Criteria) this;
		}

		public Criteria andIdUsuarioBetween(Integer value1, Integer value2) {
			addCriterion("id_usuario between", value1, value2, "idUsuario");
			return (Criteria) this;
		}

		public Criteria andIdUsuarioNotBetween(Integer value1, Integer value2) {
			addCriterion("id_usuario not between", value1, value2, "idUsuario");
			return (Criteria) this;
		}

		public Criteria andDsLoginIsNull() {
			addCriterion("ds_login is null");
			return (Criteria) this;
		}

		public Criteria andDsLoginIsNotNull() {
			addCriterion("ds_login is not null");
			return (Criteria) this;
		}

		public Criteria andDsLoginEqualTo(String value) {
			addCriterion("ds_login =", value, "dsLogin");
			return (Criteria) this;
		}

		public Criteria andDsLoginNotEqualTo(String value) {
			addCriterion("ds_login <>", value, "dsLogin");
			return (Criteria) this;
		}

		public Criteria andDsLoginGreaterThan(String value) {
			addCriterion("ds_login >", value, "dsLogin");
			return (Criteria) this;
		}

		public Criteria andDsLoginGreaterThanOrEqualTo(String value) {
			addCriterion("ds_login >=", value, "dsLogin");
			return (Criteria) this;
		}

		public Criteria andDsLoginLessThan(String value) {
			addCriterion("ds_login <", value, "dsLogin");
			return (Criteria) this;
		}

		public Criteria andDsLoginLessThanOrEqualTo(String value) {
			addCriterion("ds_login <=", value, "dsLogin");
			return (Criteria) this;
		}

		public Criteria andDsLoginLike(String value) {
			addCriterion("ds_login like", value, "dsLogin");
			return (Criteria) this;
		}

		public Criteria andDsLoginNotLike(String value) {
			addCriterion("ds_login not like", value, "dsLogin");
			return (Criteria) this;
		}

		public Criteria andDsLoginIn(List<String> values) {
			addCriterion("ds_login in", values, "dsLogin");
			return (Criteria) this;
		}

		public Criteria andDsLoginNotIn(List<String> values) {
			addCriterion("ds_login not in", values, "dsLogin");
			return (Criteria) this;
		}

		public Criteria andDsLoginBetween(String value1, String value2) {
			addCriterion("ds_login between", value1, value2, "dsLogin");
			return (Criteria) this;
		}

		public Criteria andDsLoginNotBetween(String value1, String value2) {
			addCriterion("ds_login not between", value1, value2, "dsLogin");
			return (Criteria) this;
		}

		public Criteria andDsEmailIsNull() {
			addCriterion("ds_email is null");
			return (Criteria) this;
		}

		public Criteria andDsEmailIsNotNull() {
			addCriterion("ds_email is not null");
			return (Criteria) this;
		}

		public Criteria andDsEmailEqualTo(String value) {
			addCriterion("ds_email =", value, "dsEmail");
			return (Criteria) this;
		}

		public Criteria andDsEmailNotEqualTo(String value) {
			addCriterion("ds_email <>", value, "dsEmail");
			return (Criteria) this;
		}

		public Criteria andDsEmailGreaterThan(String value) {
			addCriterion("ds_email >", value, "dsEmail");
			return (Criteria) this;
		}

		public Criteria andDsEmailGreaterThanOrEqualTo(String value) {
			addCriterion("ds_email >=", value, "dsEmail");
			return (Criteria) this;
		}

		public Criteria andDsEmailLessThan(String value) {
			addCriterion("ds_email <", value, "dsEmail");
			return (Criteria) this;
		}

		public Criteria andDsEmailLessThanOrEqualTo(String value) {
			addCriterion("ds_email <=", value, "dsEmail");
			return (Criteria) this;
		}

		public Criteria andDsEmailLike(String value) {
			addCriterion("ds_email like", value, "dsEmail");
			return (Criteria) this;
		}

		public Criteria andDsEmailNotLike(String value) {
			addCriterion("ds_email not like", value, "dsEmail");
			return (Criteria) this;
		}

		public Criteria andDsEmailIn(List<String> values) {
			addCriterion("ds_email in", values, "dsEmail");
			return (Criteria) this;
		}

		public Criteria andDsEmailNotIn(List<String> values) {
			addCriterion("ds_email not in", values, "dsEmail");
			return (Criteria) this;
		}

		public Criteria andDsEmailBetween(String value1, String value2) {
			addCriterion("ds_email between", value1, value2, "dsEmail");
			return (Criteria) this;
		}

		public Criteria andDsEmailNotBetween(String value1, String value2) {
			addCriterion("ds_email not between", value1, value2, "dsEmail");
			return (Criteria) this;
		}

		public Criteria andDsSenhaIsNull() {
			addCriterion("ds_senha is null");
			return (Criteria) this;
		}

		public Criteria andDsSenhaIsNotNull() {
			addCriterion("ds_senha is not null");
			return (Criteria) this;
		}

		public Criteria andDsSenhaEqualTo(String value) {
			addCriterion("ds_senha =", value, "dsSenha");
			return (Criteria) this;
		}

		public Criteria andDsSenhaNotEqualTo(String value) {
			addCriterion("ds_senha <>", value, "dsSenha");
			return (Criteria) this;
		}

		public Criteria andDsSenhaGreaterThan(String value) {
			addCriterion("ds_senha >", value, "dsSenha");
			return (Criteria) this;
		}

		public Criteria andDsSenhaGreaterThanOrEqualTo(String value) {
			addCriterion("ds_senha >=", value, "dsSenha");
			return (Criteria) this;
		}

		public Criteria andDsSenhaLessThan(String value) {
			addCriterion("ds_senha <", value, "dsSenha");
			return (Criteria) this;
		}

		public Criteria andDsSenhaLessThanOrEqualTo(String value) {
			addCriterion("ds_senha <=", value, "dsSenha");
			return (Criteria) this;
		}

		public Criteria andDsSenhaLike(String value) {
			addCriterion("ds_senha like", value, "dsSenha");
			return (Criteria) this;
		}

		public Criteria andDsSenhaNotLike(String value) {
			addCriterion("ds_senha not like", value, "dsSenha");
			return (Criteria) this;
		}

		public Criteria andDsSenhaIn(List<String> values) {
			addCriterion("ds_senha in", values, "dsSenha");
			return (Criteria) this;
		}

		public Criteria andDsSenhaNotIn(List<String> values) {
			addCriterion("ds_senha not in", values, "dsSenha");
			return (Criteria) this;
		}

		public Criteria andDsSenhaBetween(String value1, String value2) {
			addCriterion("ds_senha between", value1, value2, "dsSenha");
			return (Criteria) this;
		}

		public Criteria andDsSenhaNotBetween(String value1, String value2) {
			addCriterion("ds_senha not between", value1, value2, "dsSenha");
			return (Criteria) this;
		}

		public Criteria andDsNomeUsuarioIsNull() {
			addCriterion("ds_nome_usuario is null");
			return (Criteria) this;
		}

		public Criteria andDsNomeUsuarioIsNotNull() {
			addCriterion("ds_nome_usuario is not null");
			return (Criteria) this;
		}

		public Criteria andDsNomeUsuarioEqualTo(String value) {
			addCriterion("ds_nome_usuario =", value, "dsNomeUsuario");
			return (Criteria) this;
		}

		public Criteria andDsNomeUsuarioNotEqualTo(String value) {
			addCriterion("ds_nome_usuario <>", value, "dsNomeUsuario");
			return (Criteria) this;
		}

		public Criteria andDsNomeUsuarioGreaterThan(String value) {
			addCriterion("ds_nome_usuario >", value, "dsNomeUsuario");
			return (Criteria) this;
		}

		public Criteria andDsNomeUsuarioGreaterThanOrEqualTo(String value) {
			addCriterion("ds_nome_usuario >=", value, "dsNomeUsuario");
			return (Criteria) this;
		}

		public Criteria andDsNomeUsuarioLessThan(String value) {
			addCriterion("ds_nome_usuario <", value, "dsNomeUsuario");
			return (Criteria) this;
		}

		public Criteria andDsNomeUsuarioLessThanOrEqualTo(String value) {
			addCriterion("ds_nome_usuario <=", value, "dsNomeUsuario");
			return (Criteria) this;
		}

		public Criteria andDsNomeUsuarioLike(String value) {
			addCriterion("ds_nome_usuario like", value, "dsNomeUsuario");
			return (Criteria) this;
		}

		public Criteria andDsNomeUsuarioNotLike(String value) {
			addCriterion("ds_nome_usuario not like", value, "dsNomeUsuario");
			return (Criteria) this;
		}

		public Criteria andDsNomeUsuarioIn(List<String> values) {
			addCriterion("ds_nome_usuario in", values, "dsNomeUsuario");
			return (Criteria) this;
		}

		public Criteria andDsNomeUsuarioNotIn(List<String> values) {
			addCriterion("ds_nome_usuario not in", values, "dsNomeUsuario");
			return (Criteria) this;
		}

		public Criteria andDsNomeUsuarioBetween(String value1, String value2) {
			addCriterion("ds_nome_usuario between", value1, value2, "dsNomeUsuario");
			return (Criteria) this;
		}

		public Criteria andDsNomeUsuarioNotBetween(String value1, String value2) {
			addCriterion("ds_nome_usuario not between", value1, value2, "dsNomeUsuario");
			return (Criteria) this;
		}

		public Criteria andDtCriacaoIsNull() {
			addCriterion("dt_criacao is null");
			return (Criteria) this;
		}

		public Criteria andDtCriacaoIsNotNull() {
			addCriterion("dt_criacao is not null");
			return (Criteria) this;
		}

		public Criteria andDtCriacaoEqualTo(Date value) {
			addCriterion("dt_criacao =", value, "dtCriacao");
			return (Criteria) this;
		}

		public Criteria andDtCriacaoNotEqualTo(Date value) {
			addCriterion("dt_criacao <>", value, "dtCriacao");
			return (Criteria) this;
		}

		public Criteria andDtCriacaoGreaterThan(Date value) {
			addCriterion("dt_criacao >", value, "dtCriacao");
			return (Criteria) this;
		}

		public Criteria andDtCriacaoGreaterThanOrEqualTo(Date value) {
			addCriterion("dt_criacao >=", value, "dtCriacao");
			return (Criteria) this;
		}

		public Criteria andDtCriacaoLessThan(Date value) {
			addCriterion("dt_criacao <", value, "dtCriacao");
			return (Criteria) this;
		}

		public Criteria andDtCriacaoLessThanOrEqualTo(Date value) {
			addCriterion("dt_criacao <=", value, "dtCriacao");
			return (Criteria) this;
		}

		public Criteria andDtCriacaoIn(List<Date> values) {
			addCriterion("dt_criacao in", values, "dtCriacao");
			return (Criteria) this;
		}

		public Criteria andDtCriacaoNotIn(List<Date> values) {
			addCriterion("dt_criacao not in", values, "dtCriacao");
			return (Criteria) this;
		}

		public Criteria andDtCriacaoBetween(Date value1, Date value2) {
			addCriterion("dt_criacao between", value1, value2, "dtCriacao");
			return (Criteria) this;
		}

		public Criteria andDtCriacaoNotBetween(Date value1, Date value2) {
			addCriterion("dt_criacao not between", value1, value2, "dtCriacao");
			return (Criteria) this;
		}

		public Criteria andDtAlteracaoIsNull() {
			addCriterion("dt_alteracao is null");
			return (Criteria) this;
		}

		public Criteria andDtAlteracaoIsNotNull() {
			addCriterion("dt_alteracao is not null");
			return (Criteria) this;
		}

		public Criteria andDtAlteracaoEqualTo(Date value) {
			addCriterion("dt_alteracao =", value, "dtAlteracao");
			return (Criteria) this;
		}

		public Criteria andDtAlteracaoNotEqualTo(Date value) {
			addCriterion("dt_alteracao <>", value, "dtAlteracao");
			return (Criteria) this;
		}

		public Criteria andDtAlteracaoGreaterThan(Date value) {
			addCriterion("dt_alteracao >", value, "dtAlteracao");
			return (Criteria) this;
		}

		public Criteria andDtAlteracaoGreaterThanOrEqualTo(Date value) {
			addCriterion("dt_alteracao >=", value, "dtAlteracao");
			return (Criteria) this;
		}

		public Criteria andDtAlteracaoLessThan(Date value) {
			addCriterion("dt_alteracao <", value, "dtAlteracao");
			return (Criteria) this;
		}

		public Criteria andDtAlteracaoLessThanOrEqualTo(Date value) {
			addCriterion("dt_alteracao <=", value, "dtAlteracao");
			return (Criteria) this;
		}

		public Criteria andDtAlteracaoIn(List<Date> values) {
			addCriterion("dt_alteracao in", values, "dtAlteracao");
			return (Criteria) this;
		}

		public Criteria andDtAlteracaoNotIn(List<Date> values) {
			addCriterion("dt_alteracao not in", values, "dtAlteracao");
			return (Criteria) this;
		}

		public Criteria andDtAlteracaoBetween(Date value1, Date value2) {
			addCriterion("dt_alteracao between", value1, value2, "dtAlteracao");
			return (Criteria) this;
		}

		public Criteria andDtAlteracaoNotBetween(Date value1, Date value2) {
			addCriterion("dt_alteracao not between", value1, value2, "dtAlteracao");
			return (Criteria) this;
		}

		public Criteria andDsTokenIsNull() {
			addCriterion("ds_token is null");
			return (Criteria) this;
		}

		public Criteria andDsTokenIsNotNull() {
			addCriterion("ds_token is not null");
			return (Criteria) this;
		}

		public Criteria andDsTokenEqualTo(String value) {
			addCriterion("ds_token =", value, "dsToken");
			return (Criteria) this;
		}

		public Criteria andDsTokenNotEqualTo(String value) {
			addCriterion("ds_token <>", value, "dsToken");
			return (Criteria) this;
		}

		public Criteria andDsTokenGreaterThan(String value) {
			addCriterion("ds_token >", value, "dsToken");
			return (Criteria) this;
		}

		public Criteria andDsTokenGreaterThanOrEqualTo(String value) {
			addCriterion("ds_token >=", value, "dsToken");
			return (Criteria) this;
		}

		public Criteria andDsTokenLessThan(String value) {
			addCriterion("ds_token <", value, "dsToken");
			return (Criteria) this;
		}

		public Criteria andDsTokenLessThanOrEqualTo(String value) {
			addCriterion("ds_token <=", value, "dsToken");
			return (Criteria) this;
		}

		public Criteria andDsTokenLike(String value) {
			addCriterion("ds_token like", value, "dsToken");
			return (Criteria) this;
		}

		public Criteria andDsTokenNotLike(String value) {
			addCriterion("ds_token not like", value, "dsToken");
			return (Criteria) this;
		}

		public Criteria andDsTokenIn(List<String> values) {
			addCriterion("ds_token in", values, "dsToken");
			return (Criteria) this;
		}

		public Criteria andDsTokenNotIn(List<String> values) {
			addCriterion("ds_token not in", values, "dsToken");
			return (Criteria) this;
		}

		public Criteria andDsTokenBetween(String value1, String value2) {
			addCriterion("ds_token between", value1, value2, "dsToken");
			return (Criteria) this;
		}

		public Criteria andDsTokenNotBetween(String value1, String value2) {
			addCriterion("ds_token not between", value1, value2, "dsToken");
			return (Criteria) this;
		}

		public Criteria andDtGeraTokenIsNull() {
			addCriterion("dt_gera_token is null");
			return (Criteria) this;
		}

		public Criteria andDtGeraTokenIsNotNull() {
			addCriterion("dt_gera_token is not null");
			return (Criteria) this;
		}

		public Criteria andDtGeraTokenEqualTo(Date value) {
			addCriterion("dt_gera_token =", value, "dtGeraToken");
			return (Criteria) this;
		}

		public Criteria andDtGeraTokenNotEqualTo(Date value) {
			addCriterion("dt_gera_token <>", value, "dtGeraToken");
			return (Criteria) this;
		}

		public Criteria andDtGeraTokenGreaterThan(Date value) {
			addCriterion("dt_gera_token >", value, "dtGeraToken");
			return (Criteria) this;
		}

		public Criteria andDtGeraTokenGreaterThanOrEqualTo(Date value) {
			addCriterion("dt_gera_token >=", value, "dtGeraToken");
			return (Criteria) this;
		}

		public Criteria andDtGeraTokenLessThan(Date value) {
			addCriterion("dt_gera_token <", value, "dtGeraToken");
			return (Criteria) this;
		}

		public Criteria andDtGeraTokenLessThanOrEqualTo(Date value) {
			addCriterion("dt_gera_token <=", value, "dtGeraToken");
			return (Criteria) this;
		}

		public Criteria andDtGeraTokenIn(List<Date> values) {
			addCriterion("dt_gera_token in", values, "dtGeraToken");
			return (Criteria) this;
		}

		public Criteria andDtGeraTokenNotIn(List<Date> values) {
			addCriterion("dt_gera_token not in", values, "dtGeraToken");
			return (Criteria) this;
		}

		public Criteria andDtGeraTokenBetween(Date value1, Date value2) {
			addCriterion("dt_gera_token between", value1, value2, "dtGeraToken");
			return (Criteria) this;
		}

		public Criteria andDtGeraTokenNotBetween(Date value1, Date value2) {
			addCriterion("dt_gera_token not between", value1, value2, "dtGeraToken");
			return (Criteria) this;
		}

		public Criteria andIdPerfilIsNull() {
			addCriterion("id_perfil is null");
			return (Criteria) this;
		}

		public Criteria andIdPerfilIsNotNull() {
			addCriterion("id_perfil is not null");
			return (Criteria) this;
		}

		public Criteria andIdPerfilEqualTo(Integer value) {
			addCriterion("id_perfil =", value, "idPerfil");
			return (Criteria) this;
		}

		public Criteria andIdPerfilNotEqualTo(Integer value) {
			addCriterion("id_perfil <>", value, "idPerfil");
			return (Criteria) this;
		}

		public Criteria andIdPerfilGreaterThan(Integer value) {
			addCriterion("id_perfil >", value, "idPerfil");
			return (Criteria) this;
		}

		public Criteria andIdPerfilGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_perfil >=", value, "idPerfil");
			return (Criteria) this;
		}

		public Criteria andIdPerfilLessThan(Integer value) {
			addCriterion("id_perfil <", value, "idPerfil");
			return (Criteria) this;
		}

		public Criteria andIdPerfilLessThanOrEqualTo(Integer value) {
			addCriterion("id_perfil <=", value, "idPerfil");
			return (Criteria) this;
		}

		public Criteria andIdPerfilIn(List<Integer> values) {
			addCriterion("id_perfil in", values, "idPerfil");
			return (Criteria) this;
		}

		public Criteria andIdPerfilNotIn(List<Integer> values) {
			addCriterion("id_perfil not in", values, "idPerfil");
			return (Criteria) this;
		}

		public Criteria andIdPerfilBetween(Integer value1, Integer value2) {
			addCriterion("id_perfil between", value1, value2, "idPerfil");
			return (Criteria) this;
		}

		public Criteria andIdPerfilNotBetween(Integer value1, Integer value2) {
			addCriterion("id_perfil not between", value1, value2, "idPerfil");
			return (Criteria) this;
		}

		public Criteria andIcAtivoIsNull() {
			addCriterion("ic_ativo is null");
			return (Criteria) this;
		}

		public Criteria andIcAtivoIsNotNull() {
			addCriterion("ic_ativo is not null");
			return (Criteria) this;
		}

		public Criteria andIcAtivoEqualTo(Boolean value) {
			addCriterion("ic_ativo =", value, "icAtivo");
			return (Criteria) this;
		}

		public Criteria andIcAtivoNotEqualTo(Boolean value) {
			addCriterion("ic_ativo <>", value, "icAtivo");
			return (Criteria) this;
		}

		public Criteria andIcAtivoGreaterThan(Boolean value) {
			addCriterion("ic_ativo >", value, "icAtivo");
			return (Criteria) this;
		}

		public Criteria andIcAtivoGreaterThanOrEqualTo(Boolean value) {
			addCriterion("ic_ativo >=", value, "icAtivo");
			return (Criteria) this;
		}

		public Criteria andIcAtivoLessThan(Boolean value) {
			addCriterion("ic_ativo <", value, "icAtivo");
			return (Criteria) this;
		}

		public Criteria andIcAtivoLessThanOrEqualTo(Boolean value) {
			addCriterion("ic_ativo <=", value, "icAtivo");
			return (Criteria) this;
		}

		public Criteria andIcAtivoIn(List<Boolean> values) {
			addCriterion("ic_ativo in", values, "icAtivo");
			return (Criteria) this;
		}

		public Criteria andIcAtivoNotIn(List<Boolean> values) {
			addCriterion("ic_ativo not in", values, "icAtivo");
			return (Criteria) this;
		}

		public Criteria andIcAtivoBetween(Boolean value1, Boolean value2) {
			addCriterion("ic_ativo between", value1, value2, "icAtivo");
			return (Criteria) this;
		}

		public Criteria andIcAtivoNotBetween(Boolean value1, Boolean value2) {
			addCriterion("ic_ativo not between", value1, value2, "icAtivo");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table public.tb_usuario
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.tb_usuario
     *
     * @mbg.generated do_not_delete_during_merge Thu Dec 22 23:42:57 BRST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}