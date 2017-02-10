package br.inf.orion.eSafe.client.model.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MoedaExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.tb_moeda
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.tb_moeda
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table public.tb_moeda
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_moeda
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    public MoedaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_moeda
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_moeda
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_moeda
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_moeda
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_moeda
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_moeda
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_moeda
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_moeda
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_moeda
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_moeda
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.tb_moeda
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCdMoedaIsNull() {
            addCriterion("cd_moeda is null");
            return (Criteria) this;
        }

        public Criteria andCdMoedaIsNotNull() {
            addCriterion("cd_moeda is not null");
            return (Criteria) this;
        }

        public Criteria andCdMoedaEqualTo(Integer value) {
            addCriterion("cd_moeda =", value, "cdMoeda");
            return (Criteria) this;
        }

        public Criteria andCdMoedaNotEqualTo(Integer value) {
            addCriterion("cd_moeda <>", value, "cdMoeda");
            return (Criteria) this;
        }

        public Criteria andCdMoedaGreaterThan(Integer value) {
            addCriterion("cd_moeda >", value, "cdMoeda");
            return (Criteria) this;
        }

        public Criteria andCdMoedaGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_moeda >=", value, "cdMoeda");
            return (Criteria) this;
        }

        public Criteria andCdMoedaLessThan(Integer value) {
            addCriterion("cd_moeda <", value, "cdMoeda");
            return (Criteria) this;
        }

        public Criteria andCdMoedaLessThanOrEqualTo(Integer value) {
            addCriterion("cd_moeda <=", value, "cdMoeda");
            return (Criteria) this;
        }

        public Criteria andCdMoedaIn(List<Integer> values) {
            addCriterion("cd_moeda in", values, "cdMoeda");
            return (Criteria) this;
        }

        public Criteria andCdMoedaNotIn(List<Integer> values) {
            addCriterion("cd_moeda not in", values, "cdMoeda");
            return (Criteria) this;
        }

        public Criteria andCdMoedaBetween(Integer value1, Integer value2) {
            addCriterion("cd_moeda between", value1, value2, "cdMoeda");
            return (Criteria) this;
        }

        public Criteria andCdMoedaNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_moeda not between", value1, value2, "cdMoeda");
            return (Criteria) this;
        }

        public Criteria andDsSimboloIsNull() {
            addCriterion("ds_simbolo is null");
            return (Criteria) this;
        }

        public Criteria andDsSimboloIsNotNull() {
            addCriterion("ds_simbolo is not null");
            return (Criteria) this;
        }

        public Criteria andDsSimboloEqualTo(String value) {
            addCriterion("ds_simbolo =", value, "dsSimbolo");
            return (Criteria) this;
        }

        public Criteria andDsSimboloNotEqualTo(String value) {
            addCriterion("ds_simbolo <>", value, "dsSimbolo");
            return (Criteria) this;
        }

        public Criteria andDsSimboloGreaterThan(String value) {
            addCriterion("ds_simbolo >", value, "dsSimbolo");
            return (Criteria) this;
        }

        public Criteria andDsSimboloGreaterThanOrEqualTo(String value) {
            addCriterion("ds_simbolo >=", value, "dsSimbolo");
            return (Criteria) this;
        }

        public Criteria andDsSimboloLessThan(String value) {
            addCriterion("ds_simbolo <", value, "dsSimbolo");
            return (Criteria) this;
        }

        public Criteria andDsSimboloLessThanOrEqualTo(String value) {
            addCriterion("ds_simbolo <=", value, "dsSimbolo");
            return (Criteria) this;
        }

        public Criteria andDsSimboloLike(String value) {
            addCriterion("ds_simbolo like", value, "dsSimbolo");
            return (Criteria) this;
        }

        public Criteria andDsSimboloNotLike(String value) {
            addCriterion("ds_simbolo not like", value, "dsSimbolo");
            return (Criteria) this;
        }

        public Criteria andDsSimboloIn(List<String> values) {
            addCriterion("ds_simbolo in", values, "dsSimbolo");
            return (Criteria) this;
        }

        public Criteria andDsSimboloNotIn(List<String> values) {
            addCriterion("ds_simbolo not in", values, "dsSimbolo");
            return (Criteria) this;
        }

        public Criteria andDsSimboloBetween(String value1, String value2) {
            addCriterion("ds_simbolo between", value1, value2, "dsSimbolo");
            return (Criteria) this;
        }

        public Criteria andDsSimboloNotBetween(String value1, String value2) {
            addCriterion("ds_simbolo not between", value1, value2, "dsSimbolo");
            return (Criteria) this;
        }

        public Criteria andDsSiglaIsNull() {
            addCriterion("ds_sigla is null");
            return (Criteria) this;
        }

        public Criteria andDsSiglaIsNotNull() {
            addCriterion("ds_sigla is not null");
            return (Criteria) this;
        }

        public Criteria andDsSiglaEqualTo(String value) {
            addCriterion("ds_sigla =", value, "dsSigla");
            return (Criteria) this;
        }

        public Criteria andDsSiglaNotEqualTo(String value) {
            addCriterion("ds_sigla <>", value, "dsSigla");
            return (Criteria) this;
        }

        public Criteria andDsSiglaGreaterThan(String value) {
            addCriterion("ds_sigla >", value, "dsSigla");
            return (Criteria) this;
        }

        public Criteria andDsSiglaGreaterThanOrEqualTo(String value) {
            addCriterion("ds_sigla >=", value, "dsSigla");
            return (Criteria) this;
        }

        public Criteria andDsSiglaLessThan(String value) {
            addCriterion("ds_sigla <", value, "dsSigla");
            return (Criteria) this;
        }

        public Criteria andDsSiglaLessThanOrEqualTo(String value) {
            addCriterion("ds_sigla <=", value, "dsSigla");
            return (Criteria) this;
        }

        public Criteria andDsSiglaLike(String value) {
            addCriterion("ds_sigla like", value, "dsSigla");
            return (Criteria) this;
        }

        public Criteria andDsSiglaNotLike(String value) {
            addCriterion("ds_sigla not like", value, "dsSigla");
            return (Criteria) this;
        }

        public Criteria andDsSiglaIn(List<String> values) {
            addCriterion("ds_sigla in", values, "dsSigla");
            return (Criteria) this;
        }

        public Criteria andDsSiglaNotIn(List<String> values) {
            addCriterion("ds_sigla not in", values, "dsSigla");
            return (Criteria) this;
        }

        public Criteria andDsSiglaBetween(String value1, String value2) {
            addCriterion("ds_sigla between", value1, value2, "dsSigla");
            return (Criteria) this;
        }

        public Criteria andDsSiglaNotBetween(String value1, String value2) {
            addCriterion("ds_sigla not between", value1, value2, "dsSigla");
            return (Criteria) this;
        }

        public Criteria andTpConversaoIsNull() {
            addCriterion("tp_conversao is null");
            return (Criteria) this;
        }

        public Criteria andTpConversaoIsNotNull() {
            addCriterion("tp_conversao is not null");
            return (Criteria) this;
        }

        public Criteria andTpConversaoEqualTo(String value) {
            addCriterion("tp_conversao =", value, "tpConversao");
            return (Criteria) this;
        }

        public Criteria andTpConversaoNotEqualTo(String value) {
            addCriterion("tp_conversao <>", value, "tpConversao");
            return (Criteria) this;
        }

        public Criteria andTpConversaoGreaterThan(String value) {
            addCriterion("tp_conversao >", value, "tpConversao");
            return (Criteria) this;
        }

        public Criteria andTpConversaoGreaterThanOrEqualTo(String value) {
            addCriterion("tp_conversao >=", value, "tpConversao");
            return (Criteria) this;
        }

        public Criteria andTpConversaoLessThan(String value) {
            addCriterion("tp_conversao <", value, "tpConversao");
            return (Criteria) this;
        }

        public Criteria andTpConversaoLessThanOrEqualTo(String value) {
            addCriterion("tp_conversao <=", value, "tpConversao");
            return (Criteria) this;
        }

        public Criteria andTpConversaoLike(String value) {
            addCriterion("tp_conversao like", value, "tpConversao");
            return (Criteria) this;
        }

        public Criteria andTpConversaoNotLike(String value) {
            addCriterion("tp_conversao not like", value, "tpConversao");
            return (Criteria) this;
        }

        public Criteria andTpConversaoIn(List<String> values) {
            addCriterion("tp_conversao in", values, "tpConversao");
            return (Criteria) this;
        }

        public Criteria andTpConversaoNotIn(List<String> values) {
            addCriterion("tp_conversao not in", values, "tpConversao");
            return (Criteria) this;
        }

        public Criteria andTpConversaoBetween(String value1, String value2) {
            addCriterion("tp_conversao between", value1, value2, "tpConversao");
            return (Criteria) this;
        }

        public Criteria andTpConversaoNotBetween(String value1, String value2) {
            addCriterion("tp_conversao not between", value1, value2, "tpConversao");
            return (Criteria) this;
        }

        public Criteria andDtExclusaoIsNull() {
            addCriterion("dt_exclusao is null");
            return (Criteria) this;
        }

        public Criteria andDtExclusaoIsNotNull() {
            addCriterion("dt_exclusao is not null");
            return (Criteria) this;
        }

        public Criteria andDtExclusaoEqualTo(Date value) {
            addCriterionForJDBCDate("dt_exclusao =", value, "dtExclusao");
            return (Criteria) this;
        }

        public Criteria andDtExclusaoNotEqualTo(Date value) {
            addCriterionForJDBCDate("dt_exclusao <>", value, "dtExclusao");
            return (Criteria) this;
        }

        public Criteria andDtExclusaoGreaterThan(Date value) {
            addCriterionForJDBCDate("dt_exclusao >", value, "dtExclusao");
            return (Criteria) this;
        }

        public Criteria andDtExclusaoGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dt_exclusao >=", value, "dtExclusao");
            return (Criteria) this;
        }

        public Criteria andDtExclusaoLessThan(Date value) {
            addCriterionForJDBCDate("dt_exclusao <", value, "dtExclusao");
            return (Criteria) this;
        }

        public Criteria andDtExclusaoLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dt_exclusao <=", value, "dtExclusao");
            return (Criteria) this;
        }

        public Criteria andDtExclusaoIn(List<Date> values) {
            addCriterionForJDBCDate("dt_exclusao in", values, "dtExclusao");
            return (Criteria) this;
        }

        public Criteria andDtExclusaoNotIn(List<Date> values) {
            addCriterionForJDBCDate("dt_exclusao not in", values, "dtExclusao");
            return (Criteria) this;
        }

        public Criteria andDtExclusaoBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dt_exclusao between", value1, value2, "dtExclusao");
            return (Criteria) this;
        }

        public Criteria andDtExclusaoNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dt_exclusao not between", value1, value2, "dtExclusao");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.tb_moeda
     *
     * @mbg.generated do_not_delete_during_merge Wed Dec 28 01:55:16 BRST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.tb_moeda
     *
     * @mbg.generated Wed Dec 28 01:55:16 BRST 2016
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
}