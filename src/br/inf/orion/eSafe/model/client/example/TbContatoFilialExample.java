package br.inf.orion.eSafe.model.client.example;

import java.util.ArrayList;
import java.util.List;

public class TbContatoFilialExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public TbContatoFilialExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
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

		public Criteria andIdContatoIsNull() {
			addCriterion("id_contato is null");
			return (Criteria) this;
		}

		public Criteria andIdContatoIsNotNull() {
			addCriterion("id_contato is not null");
			return (Criteria) this;
		}

		public Criteria andIdContatoEqualTo(Integer value) {
			addCriterion("id_contato =", value, "idContato");
			return (Criteria) this;
		}

		public Criteria andIdContatoNotEqualTo(Integer value) {
			addCriterion("id_contato <>", value, "idContato");
			return (Criteria) this;
		}

		public Criteria andIdContatoGreaterThan(Integer value) {
			addCriterion("id_contato >", value, "idContato");
			return (Criteria) this;
		}

		public Criteria andIdContatoGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_contato >=", value, "idContato");
			return (Criteria) this;
		}

		public Criteria andIdContatoLessThan(Integer value) {
			addCriterion("id_contato <", value, "idContato");
			return (Criteria) this;
		}

		public Criteria andIdContatoLessThanOrEqualTo(Integer value) {
			addCriterion("id_contato <=", value, "idContato");
			return (Criteria) this;
		}

		public Criteria andIdContatoIn(List<Integer> values) {
			addCriterion("id_contato in", values, "idContato");
			return (Criteria) this;
		}

		public Criteria andIdContatoNotIn(List<Integer> values) {
			addCriterion("id_contato not in", values, "idContato");
			return (Criteria) this;
		}

		public Criteria andIdContatoBetween(Integer value1, Integer value2) {
			addCriterion("id_contato between", value1, value2, "idContato");
			return (Criteria) this;
		}

		public Criteria andIdContatoNotBetween(Integer value1, Integer value2) {
			addCriterion("id_contato not between", value1, value2, "idContato");
			return (Criteria) this;
		}

		public Criteria andIdTipoContatoIsNull() {
			addCriterion("id_tipo_contato is null");
			return (Criteria) this;
		}

		public Criteria andIdTipoContatoIsNotNull() {
			addCriterion("id_tipo_contato is not null");
			return (Criteria) this;
		}

		public Criteria andIdTipoContatoEqualTo(Integer value) {
			addCriterion("id_tipo_contato =", value, "idTipoContato");
			return (Criteria) this;
		}

		public Criteria andIdTipoContatoNotEqualTo(Integer value) {
			addCriterion("id_tipo_contato <>", value, "idTipoContato");
			return (Criteria) this;
		}

		public Criteria andIdTipoContatoGreaterThan(Integer value) {
			addCriterion("id_tipo_contato >", value, "idTipoContato");
			return (Criteria) this;
		}

		public Criteria andIdTipoContatoGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_tipo_contato >=", value, "idTipoContato");
			return (Criteria) this;
		}

		public Criteria andIdTipoContatoLessThan(Integer value) {
			addCriterion("id_tipo_contato <", value, "idTipoContato");
			return (Criteria) this;
		}

		public Criteria andIdTipoContatoLessThanOrEqualTo(Integer value) {
			addCriterion("id_tipo_contato <=", value, "idTipoContato");
			return (Criteria) this;
		}

		public Criteria andIdTipoContatoIn(List<Integer> values) {
			addCriterion("id_tipo_contato in", values, "idTipoContato");
			return (Criteria) this;
		}

		public Criteria andIdTipoContatoNotIn(List<Integer> values) {
			addCriterion("id_tipo_contato not in", values, "idTipoContato");
			return (Criteria) this;
		}

		public Criteria andIdTipoContatoBetween(Integer value1, Integer value2) {
			addCriterion("id_tipo_contato between", value1, value2, "idTipoContato");
			return (Criteria) this;
		}

		public Criteria andIdTipoContatoNotBetween(Integer value1, Integer value2) {
			addCriterion("id_tipo_contato not between", value1, value2, "idTipoContato");
			return (Criteria) this;
		}

		public Criteria andDsContatoIsNull() {
			addCriterion("ds_contato is null");
			return (Criteria) this;
		}

		public Criteria andDsContatoIsNotNull() {
			addCriterion("ds_contato is not null");
			return (Criteria) this;
		}

		public Criteria andDsContatoEqualTo(String value) {
			addCriterion("ds_contato =", value, "dsContato");
			return (Criteria) this;
		}

		public Criteria andDsContatoNotEqualTo(String value) {
			addCriterion("ds_contato <>", value, "dsContato");
			return (Criteria) this;
		}

		public Criteria andDsContatoGreaterThan(String value) {
			addCriterion("ds_contato >", value, "dsContato");
			return (Criteria) this;
		}

		public Criteria andDsContatoGreaterThanOrEqualTo(String value) {
			addCriterion("ds_contato >=", value, "dsContato");
			return (Criteria) this;
		}

		public Criteria andDsContatoLessThan(String value) {
			addCriterion("ds_contato <", value, "dsContato");
			return (Criteria) this;
		}

		public Criteria andDsContatoLessThanOrEqualTo(String value) {
			addCriterion("ds_contato <=", value, "dsContato");
			return (Criteria) this;
		}

		public Criteria andDsContatoLike(String value) {
			addCriterion("ds_contato like", value, "dsContato");
			return (Criteria) this;
		}

		public Criteria andDsContatoNotLike(String value) {
			addCriterion("ds_contato not like", value, "dsContato");
			return (Criteria) this;
		}

		public Criteria andDsContatoIn(List<String> values) {
			addCriterion("ds_contato in", values, "dsContato");
			return (Criteria) this;
		}

		public Criteria andDsContatoNotIn(List<String> values) {
			addCriterion("ds_contato not in", values, "dsContato");
			return (Criteria) this;
		}

		public Criteria andDsContatoBetween(String value1, String value2) {
			addCriterion("ds_contato between", value1, value2, "dsContato");
			return (Criteria) this;
		}

		public Criteria andDsContatoNotBetween(String value1, String value2) {
			addCriterion("ds_contato not between", value1, value2, "dsContato");
			return (Criteria) this;
		}

		public Criteria andDsObservacaoIsNull() {
			addCriterion("ds_observacao is null");
			return (Criteria) this;
		}

		public Criteria andDsObservacaoIsNotNull() {
			addCriterion("ds_observacao is not null");
			return (Criteria) this;
		}

		public Criteria andDsObservacaoEqualTo(String value) {
			addCriterion("ds_observacao =", value, "dsObservacao");
			return (Criteria) this;
		}

		public Criteria andDsObservacaoNotEqualTo(String value) {
			addCriterion("ds_observacao <>", value, "dsObservacao");
			return (Criteria) this;
		}

		public Criteria andDsObservacaoGreaterThan(String value) {
			addCriterion("ds_observacao >", value, "dsObservacao");
			return (Criteria) this;
		}

		public Criteria andDsObservacaoGreaterThanOrEqualTo(String value) {
			addCriterion("ds_observacao >=", value, "dsObservacao");
			return (Criteria) this;
		}

		public Criteria andDsObservacaoLessThan(String value) {
			addCriterion("ds_observacao <", value, "dsObservacao");
			return (Criteria) this;
		}

		public Criteria andDsObservacaoLessThanOrEqualTo(String value) {
			addCriterion("ds_observacao <=", value, "dsObservacao");
			return (Criteria) this;
		}

		public Criteria andDsObservacaoLike(String value) {
			addCriterion("ds_observacao like", value, "dsObservacao");
			return (Criteria) this;
		}

		public Criteria andDsObservacaoNotLike(String value) {
			addCriterion("ds_observacao not like", value, "dsObservacao");
			return (Criteria) this;
		}

		public Criteria andDsObservacaoIn(List<String> values) {
			addCriterion("ds_observacao in", values, "dsObservacao");
			return (Criteria) this;
		}

		public Criteria andDsObservacaoNotIn(List<String> values) {
			addCriterion("ds_observacao not in", values, "dsObservacao");
			return (Criteria) this;
		}

		public Criteria andDsObservacaoBetween(String value1, String value2) {
			addCriterion("ds_observacao between", value1, value2, "dsObservacao");
			return (Criteria) this;
		}

		public Criteria andDsObservacaoNotBetween(String value1, String value2) {
			addCriterion("ds_observacao not between", value1, value2, "dsObservacao");
			return (Criteria) this;
		}

		public Criteria andIdFilialIsNull() {
			addCriterion("id_filial is null");
			return (Criteria) this;
		}

		public Criteria andIdFilialIsNotNull() {
			addCriterion("id_filial is not null");
			return (Criteria) this;
		}

		public Criteria andIdFilialEqualTo(Integer value) {
			addCriterion("id_filial =", value, "idFilial");
			return (Criteria) this;
		}

		public Criteria andIdFilialNotEqualTo(Integer value) {
			addCriterion("id_filial <>", value, "idFilial");
			return (Criteria) this;
		}

		public Criteria andIdFilialGreaterThan(Integer value) {
			addCriterion("id_filial >", value, "idFilial");
			return (Criteria) this;
		}

		public Criteria andIdFilialGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_filial >=", value, "idFilial");
			return (Criteria) this;
		}

		public Criteria andIdFilialLessThan(Integer value) {
			addCriterion("id_filial <", value, "idFilial");
			return (Criteria) this;
		}

		public Criteria andIdFilialLessThanOrEqualTo(Integer value) {
			addCriterion("id_filial <=", value, "idFilial");
			return (Criteria) this;
		}

		public Criteria andIdFilialIn(List<Integer> values) {
			addCriterion("id_filial in", values, "idFilial");
			return (Criteria) this;
		}

		public Criteria andIdFilialNotIn(List<Integer> values) {
			addCriterion("id_filial not in", values, "idFilial");
			return (Criteria) this;
		}

		public Criteria andIdFilialBetween(Integer value1, Integer value2) {
			addCriterion("id_filial between", value1, value2, "idFilial");
			return (Criteria) this;
		}

		public Criteria andIdFilialNotBetween(Integer value1, Integer value2) {
			addCriterion("id_filial not between", value1, value2, "idFilial");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table public.tb_contato_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
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
     * This class corresponds to the database table public.tb_contato_filial
     *
     * @mbg.generated do_not_delete_during_merge Fri Dec 02 12:03:10 BRST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}