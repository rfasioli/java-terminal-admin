package br.inf.orion.eSafe.service.provider;

import br.inf.orion.eSafe.model.Sistema;
import br.inf.orion.eSafe.model.example.SistemaExample;
import br.inf.orion.eSafe.model.example.SistemaExample.Criteria;
import br.inf.orion.eSafe.model.example.SistemaExample.Criterion;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SistemaSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public String countByExample(SistemaExample example) {
		SQL sql = new SQL();
		sql.SELECT("count(*)").FROM("public.tb_sistema");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public String deleteByExample(SistemaExample example) {
		SQL sql = new SQL();
		sql.DELETE_FROM("public.tb_sistema");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public String insertSelective(Sistema record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("public.tb_sistema");
		if (record.getDsSistema() != null) {
			sql.VALUES("ds_sistema", "#{dsSistema,jdbcType=VARCHAR}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public String selectByExample(SistemaExample example) {
		SQL sql = new SQL();
		if (example != null && example.isDistinct()) {
			sql.SELECT_DISTINCT("id_sistema");
		} else {
			sql.SELECT("id_sistema");
		}
		sql.SELECT("ds_sistema");
		sql.FROM("public.tb_sistema");
		applyWhere(sql, example, false);
		if (example != null && example.getOrderByClause() != null) {
			sql.ORDER_BY(example.getOrderByClause());
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public String updateByExampleSelective(Map<String, Object> parameter) {
		Sistema record = (Sistema) parameter.get("record");
		SistemaExample example = (SistemaExample) parameter.get("example");
		SQL sql = new SQL();
		sql.UPDATE("public.tb_sistema");
		if (record.getIdSistema() != null) {
			sql.SET("id_sistema = #{record.idSistema,jdbcType=INTEGER}");
		}
		if (record.getDsSistema() != null) {
			sql.SET("ds_sistema = #{record.dsSistema,jdbcType=VARCHAR}");
		}
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public String updateByExample(Map<String, Object> parameter) {
		SQL sql = new SQL();
		sql.UPDATE("public.tb_sistema");
		sql.SET("id_sistema = #{record.idSistema,jdbcType=INTEGER}");
		sql.SET("ds_sistema = #{record.dsSistema,jdbcType=VARCHAR}");
		SistemaExample example = (SistemaExample) parameter.get("example");
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	public String updateByPrimaryKeySelective(Sistema record) {
		SQL sql = new SQL();
		sql.UPDATE("public.tb_sistema");
		if (record.getDsSistema() != null) {
			sql.SET("ds_sistema = #{dsSistema,jdbcType=VARCHAR}");
		}
		sql.WHERE("id_sistema = #{idSistema,jdbcType=INTEGER}");
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_sistema
	 * @mbg.generated  Thu Dec 22 23:43:27 BRST 2016
	 */
	protected void applyWhere(SQL sql, SistemaExample example, boolean includeExamplePhrase) {
		if (example == null) {
			return;
		}
		String parmPhrase1;
		String parmPhrase1_th;
		String parmPhrase2;
		String parmPhrase2_th;
		String parmPhrase3;
		String parmPhrase3_th;
		if (includeExamplePhrase) {
			parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
			parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
			parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
			parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
			parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
			parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
		} else {
			parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
			parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
			parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
			parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
			parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
			parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
		}
		StringBuilder sb = new StringBuilder();
		List<Criteria> oredCriteria = example.getOredCriteria();
		boolean firstCriteria = true;
		for (int i = 0; i < oredCriteria.size(); i++) {
			Criteria criteria = oredCriteria.get(i);
			if (criteria.isValid()) {
				if (firstCriteria) {
					firstCriteria = false;
				} else {
					sb.append(" or ");
				}
				sb.append('(');
				List<Criterion> criterions = criteria.getAllCriteria();
				boolean firstCriterion = true;
				for (int j = 0; j < criterions.size(); j++) {
					Criterion criterion = criterions.get(j);
					if (firstCriterion) {
						firstCriterion = false;
					} else {
						sb.append(" and ");
					}
					if (criterion.isNoValue()) {
						sb.append(criterion.getCondition());
					} else if (criterion.isSingleValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
						} else {
							sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,
									criterion.getTypeHandler()));
						}
					} else if (criterion.isBetweenValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
						} else {
							sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j,
									criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
						}
					} else if (criterion.isListValue()) {
						sb.append(criterion.getCondition());
						sb.append(" (");
						List<?> listItems = (List<?>) criterion.getValue();
						boolean comma = false;
						for (int k = 0; k < listItems.size(); k++) {
							if (comma) {
								sb.append(", ");
							} else {
								comma = true;
							}
							if (criterion.getTypeHandler() == null) {
								sb.append(String.format(parmPhrase3, i, j, k));
							} else {
								sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
							}
						}
						sb.append(')');
					}
				}
				sb.append(')');
			}
		}
		if (sb.length() > 0) {
			sql.WHERE(sb.toString());
		}
	}
}