package br.inf.orion.eSafe.model.example;

import java.util.ArrayList;
import java.util.List;

public class SistemaExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public SistemaExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table public.tb_sistema
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

		public Criteria andIdSistemaIsNull() {
			addCriterion("id_sistema is null");
			return (Criteria) this;
		}

		public Criteria andIdSistemaIsNotNull() {
			addCriterion("id_sistema is not null");
			return (Criteria) this;
		}

		public Criteria andIdSistemaEqualTo(Integer value) {
			addCriterion("id_sistema =", value, "idSistema");
			return (Criteria) this;
		}

		public Criteria andIdSistemaNotEqualTo(Integer value) {
			addCriterion("id_sistema <>", value, "idSistema");
			return (Criteria) this;
		}

		public Criteria andIdSistemaGreaterThan(Integer value) {
			addCriterion("id_sistema >", value, "idSistema");
			return (Criteria) this;
		}

		public Criteria andIdSistemaGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_sistema >=", value, "idSistema");
			return (Criteria) this;
		}

		public Criteria andIdSistemaLessThan(Integer value) {
			addCriterion("id_sistema <", value, "idSistema");
			return (Criteria) this;
		}

		public Criteria andIdSistemaLessThanOrEqualTo(Integer value) {
			addCriterion("id_sistema <=", value, "idSistema");
			return (Criteria) this;
		}

		public Criteria andIdSistemaIn(List<Integer> values) {
			addCriterion("id_sistema in", values, "idSistema");
			return (Criteria) this;
		}

		public Criteria andIdSistemaNotIn(List<Integer> values) {
			addCriterion("id_sistema not in", values, "idSistema");
			return (Criteria) this;
		}

		public Criteria andIdSistemaBetween(Integer value1, Integer value2) {
			addCriterion("id_sistema between", value1, value2, "idSistema");
			return (Criteria) this;
		}

		public Criteria andIdSistemaNotBetween(Integer value1, Integer value2) {
			addCriterion("id_sistema not between", value1, value2, "idSistema");
			return (Criteria) this;
		}

		public Criteria andDsSistemaIsNull() {
			addCriterion("ds_sistema is null");
			return (Criteria) this;
		}

		public Criteria andDsSistemaIsNotNull() {
			addCriterion("ds_sistema is not null");
			return (Criteria) this;
		}

		public Criteria andDsSistemaEqualTo(String value) {
			addCriterion("ds_sistema =", value, "dsSistema");
			return (Criteria) this;
		}

		public Criteria andDsSistemaNotEqualTo(String value) {
			addCriterion("ds_sistema <>", value, "dsSistema");
			return (Criteria) this;
		}

		public Criteria andDsSistemaGreaterThan(String value) {
			addCriterion("ds_sistema >", value, "dsSistema");
			return (Criteria) this;
		}

		public Criteria andDsSistemaGreaterThanOrEqualTo(String value) {
			addCriterion("ds_sistema >=", value, "dsSistema");
			return (Criteria) this;
		}

		public Criteria andDsSistemaLessThan(String value) {
			addCriterion("ds_sistema <", value, "dsSistema");
			return (Criteria) this;
		}

		public Criteria andDsSistemaLessThanOrEqualTo(String value) {
			addCriterion("ds_sistema <=", value, "dsSistema");
			return (Criteria) this;
		}

		public Criteria andDsSistemaLike(String value) {
			addCriterion("ds_sistema like", value, "dsSistema");
			return (Criteria) this;
		}

		public Criteria andDsSistemaNotLike(String value) {
			addCriterion("ds_sistema not like", value, "dsSistema");
			return (Criteria) this;
		}

		public Criteria andDsSistemaIn(List<String> values) {
			addCriterion("ds_sistema in", values, "dsSistema");
			return (Criteria) this;
		}

		public Criteria andDsSistemaNotIn(List<String> values) {
			addCriterion("ds_sistema not in", values, "dsSistema");
			return (Criteria) this;
		}

		public Criteria andDsSistemaBetween(String value1, String value2) {
			addCriterion("ds_sistema between", value1, value2, "dsSistema");
			return (Criteria) this;
		}

		public Criteria andDsSistemaNotBetween(String value1, String value2) {
			addCriterion("ds_sistema not between", value1, value2, "dsSistema");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table public.tb_sistema
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
     * This class corresponds to the database table public.tb_sistema
     *
     * @mbg.generated do_not_delete_during_merge Thu Dec 22 23:42:57 BRST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}