package br.inf.orion.eSafe.model.client.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbMonitoracaoExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public TbMonitoracaoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_monitoracao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table public.tb_monitoracao
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

		public Criteria andIdTerminalIsNull() {
			addCriterion("id_terminal is null");
			return (Criteria) this;
		}

		public Criteria andIdTerminalIsNotNull() {
			addCriterion("id_terminal is not null");
			return (Criteria) this;
		}

		public Criteria andIdTerminalEqualTo(Integer value) {
			addCriterion("id_terminal =", value, "idTerminal");
			return (Criteria) this;
		}

		public Criteria andIdTerminalNotEqualTo(Integer value) {
			addCriterion("id_terminal <>", value, "idTerminal");
			return (Criteria) this;
		}

		public Criteria andIdTerminalGreaterThan(Integer value) {
			addCriterion("id_terminal >", value, "idTerminal");
			return (Criteria) this;
		}

		public Criteria andIdTerminalGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_terminal >=", value, "idTerminal");
			return (Criteria) this;
		}

		public Criteria andIdTerminalLessThan(Integer value) {
			addCriterion("id_terminal <", value, "idTerminal");
			return (Criteria) this;
		}

		public Criteria andIdTerminalLessThanOrEqualTo(Integer value) {
			addCriterion("id_terminal <=", value, "idTerminal");
			return (Criteria) this;
		}

		public Criteria andIdTerminalIn(List<Integer> values) {
			addCriterion("id_terminal in", values, "idTerminal");
			return (Criteria) this;
		}

		public Criteria andIdTerminalNotIn(List<Integer> values) {
			addCriterion("id_terminal not in", values, "idTerminal");
			return (Criteria) this;
		}

		public Criteria andIdTerminalBetween(Integer value1, Integer value2) {
			addCriterion("id_terminal between", value1, value2, "idTerminal");
			return (Criteria) this;
		}

		public Criteria andIdTerminalNotBetween(Integer value1, Integer value2) {
			addCriterion("id_terminal not between", value1, value2, "idTerminal");
			return (Criteria) this;
		}

		public Criteria andDtEnvioIsNull() {
			addCriterion("dt_envio is null");
			return (Criteria) this;
		}

		public Criteria andDtEnvioIsNotNull() {
			addCriterion("dt_envio is not null");
			return (Criteria) this;
		}

		public Criteria andDtEnvioEqualTo(Date value) {
			addCriterion("dt_envio =", value, "dtEnvio");
			return (Criteria) this;
		}

		public Criteria andDtEnvioNotEqualTo(Date value) {
			addCriterion("dt_envio <>", value, "dtEnvio");
			return (Criteria) this;
		}

		public Criteria andDtEnvioGreaterThan(Date value) {
			addCriterion("dt_envio >", value, "dtEnvio");
			return (Criteria) this;
		}

		public Criteria andDtEnvioGreaterThanOrEqualTo(Date value) {
			addCriterion("dt_envio >=", value, "dtEnvio");
			return (Criteria) this;
		}

		public Criteria andDtEnvioLessThan(Date value) {
			addCriterion("dt_envio <", value, "dtEnvio");
			return (Criteria) this;
		}

		public Criteria andDtEnvioLessThanOrEqualTo(Date value) {
			addCriterion("dt_envio <=", value, "dtEnvio");
			return (Criteria) this;
		}

		public Criteria andDtEnvioIn(List<Date> values) {
			addCriterion("dt_envio in", values, "dtEnvio");
			return (Criteria) this;
		}

		public Criteria andDtEnvioNotIn(List<Date> values) {
			addCriterion("dt_envio not in", values, "dtEnvio");
			return (Criteria) this;
		}

		public Criteria andDtEnvioBetween(Date value1, Date value2) {
			addCriterion("dt_envio between", value1, value2, "dtEnvio");
			return (Criteria) this;
		}

		public Criteria andDtEnvioNotBetween(Date value1, Date value2) {
			addCriterion("dt_envio not between", value1, value2, "dtEnvio");
			return (Criteria) this;
		}

		public Criteria andIcStatusTerminalIsNull() {
			addCriterion("ic_status_terminal is null");
			return (Criteria) this;
		}

		public Criteria andIcStatusTerminalIsNotNull() {
			addCriterion("ic_status_terminal is not null");
			return (Criteria) this;
		}

		public Criteria andIcStatusTerminalEqualTo(Integer value) {
			addCriterion("ic_status_terminal =", value, "icStatusTerminal");
			return (Criteria) this;
		}

		public Criteria andIcStatusTerminalNotEqualTo(Integer value) {
			addCriterion("ic_status_terminal <>", value, "icStatusTerminal");
			return (Criteria) this;
		}

		public Criteria andIcStatusTerminalGreaterThan(Integer value) {
			addCriterion("ic_status_terminal >", value, "icStatusTerminal");
			return (Criteria) this;
		}

		public Criteria andIcStatusTerminalGreaterThanOrEqualTo(Integer value) {
			addCriterion("ic_status_terminal >=", value, "icStatusTerminal");
			return (Criteria) this;
		}

		public Criteria andIcStatusTerminalLessThan(Integer value) {
			addCriterion("ic_status_terminal <", value, "icStatusTerminal");
			return (Criteria) this;
		}

		public Criteria andIcStatusTerminalLessThanOrEqualTo(Integer value) {
			addCriterion("ic_status_terminal <=", value, "icStatusTerminal");
			return (Criteria) this;
		}

		public Criteria andIcStatusTerminalIn(List<Integer> values) {
			addCriterion("ic_status_terminal in", values, "icStatusTerminal");
			return (Criteria) this;
		}

		public Criteria andIcStatusTerminalNotIn(List<Integer> values) {
			addCriterion("ic_status_terminal not in", values, "icStatusTerminal");
			return (Criteria) this;
		}

		public Criteria andIcStatusTerminalBetween(Integer value1, Integer value2) {
			addCriterion("ic_status_terminal between", value1, value2, "icStatusTerminal");
			return (Criteria) this;
		}

		public Criteria andIcStatusTerminalNotBetween(Integer value1, Integer value2) {
			addCriterion("ic_status_terminal not between", value1, value2, "icStatusTerminal");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table public.tb_monitoracao
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
     * This class corresponds to the database table public.tb_monitoracao
     *
     * @mbg.generated do_not_delete_during_merge Fri Dec 02 12:03:10 BRST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}