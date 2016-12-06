package br.inf.orion.eSafe.model.client.example;

import java.util.ArrayList;
import java.util.List;

public class TbDispositivoExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public TbDispositivoExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

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

		public Criteria andIdDispositivoIsNull() {
			addCriterion("id_dispositivo is null");
			return (Criteria) this;
		}

		public Criteria andIdDispositivoIsNotNull() {
			addCriterion("id_dispositivo is not null");
			return (Criteria) this;
		}

		public Criteria andIdDispositivoEqualTo(Integer value) {
			addCriterion("id_dispositivo =", value, "idDispositivo");
			return (Criteria) this;
		}

		public Criteria andIdDispositivoNotEqualTo(Integer value) {
			addCriterion("id_dispositivo <>", value, "idDispositivo");
			return (Criteria) this;
		}

		public Criteria andIdDispositivoGreaterThan(Integer value) {
			addCriterion("id_dispositivo >", value, "idDispositivo");
			return (Criteria) this;
		}

		public Criteria andIdDispositivoGreaterThanOrEqualTo(Integer value) {
			addCriterion("id_dispositivo >=", value, "idDispositivo");
			return (Criteria) this;
		}

		public Criteria andIdDispositivoLessThan(Integer value) {
			addCriterion("id_dispositivo <", value, "idDispositivo");
			return (Criteria) this;
		}

		public Criteria andIdDispositivoLessThanOrEqualTo(Integer value) {
			addCriterion("id_dispositivo <=", value, "idDispositivo");
			return (Criteria) this;
		}

		public Criteria andIdDispositivoIn(List<Integer> values) {
			addCriterion("id_dispositivo in", values, "idDispositivo");
			return (Criteria) this;
		}

		public Criteria andIdDispositivoNotIn(List<Integer> values) {
			addCriterion("id_dispositivo not in", values, "idDispositivo");
			return (Criteria) this;
		}

		public Criteria andIdDispositivoBetween(Integer value1, Integer value2) {
			addCriterion("id_dispositivo between", value1, value2, "idDispositivo");
			return (Criteria) this;
		}

		public Criteria andIdDispositivoNotBetween(Integer value1, Integer value2) {
			addCriterion("id_dispositivo not between", value1, value2, "idDispositivo");
			return (Criteria) this;
		}

		public Criteria andDsDispositivoIsNull() {
			addCriterion("ds_dispositivo is null");
			return (Criteria) this;
		}

		public Criteria andDsDispositivoIsNotNull() {
			addCriterion("ds_dispositivo is not null");
			return (Criteria) this;
		}

		public Criteria andDsDispositivoEqualTo(String value) {
			addCriterion("ds_dispositivo =", value, "dsDispositivo");
			return (Criteria) this;
		}

		public Criteria andDsDispositivoNotEqualTo(String value) {
			addCriterion("ds_dispositivo <>", value, "dsDispositivo");
			return (Criteria) this;
		}

		public Criteria andDsDispositivoGreaterThan(String value) {
			addCriterion("ds_dispositivo >", value, "dsDispositivo");
			return (Criteria) this;
		}

		public Criteria andDsDispositivoGreaterThanOrEqualTo(String value) {
			addCriterion("ds_dispositivo >=", value, "dsDispositivo");
			return (Criteria) this;
		}

		public Criteria andDsDispositivoLessThan(String value) {
			addCriterion("ds_dispositivo <", value, "dsDispositivo");
			return (Criteria) this;
		}

		public Criteria andDsDispositivoLessThanOrEqualTo(String value) {
			addCriterion("ds_dispositivo <=", value, "dsDispositivo");
			return (Criteria) this;
		}

		public Criteria andDsDispositivoLike(String value) {
			addCriterion("ds_dispositivo like", value, "dsDispositivo");
			return (Criteria) this;
		}

		public Criteria andDsDispositivoNotLike(String value) {
			addCriterion("ds_dispositivo not like", value, "dsDispositivo");
			return (Criteria) this;
		}

		public Criteria andDsDispositivoIn(List<String> values) {
			addCriterion("ds_dispositivo in", values, "dsDispositivo");
			return (Criteria) this;
		}

		public Criteria andDsDispositivoNotIn(List<String> values) {
			addCriterion("ds_dispositivo not in", values, "dsDispositivo");
			return (Criteria) this;
		}

		public Criteria andDsDispositivoBetween(String value1, String value2) {
			addCriterion("ds_dispositivo between", value1, value2, "dsDispositivo");
			return (Criteria) this;
		}

		public Criteria andDsDispositivoNotBetween(String value1, String value2) {
			addCriterion("ds_dispositivo not between", value1, value2, "dsDispositivo");
			return (Criteria) this;
		}
	}

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

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}