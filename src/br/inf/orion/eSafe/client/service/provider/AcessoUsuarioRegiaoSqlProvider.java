package br.inf.orion.eSafe.client.service.provider;

import br.inf.orion.eSafe.client.model.AcessoUsuarioRegiao;
import br.inf.orion.eSafe.client.model.example.AcessoUsuarioRegiaoExample;
import br.inf.orion.eSafe.client.model.example.AcessoUsuarioRegiaoExample.Criteria;
import br.inf.orion.eSafe.client.model.example.AcessoUsuarioRegiaoExample.Criterion;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class AcessoUsuarioRegiaoSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_regiao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String countByExample(AcessoUsuarioRegiaoExample example) {
		SQL sql = new SQL();
		sql.SELECT("count(*)").FROM("public.tb_acesso_usuario_regiao");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_regiao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String deleteByExample(AcessoUsuarioRegiaoExample example) {
		SQL sql = new SQL();
		sql.DELETE_FROM("public.tb_acesso_usuario_regiao");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_regiao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String insertSelective(AcessoUsuarioRegiao record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("public.tb_acesso_usuario_regiao");
		if (record.getIdUsuario() != null) {
			sql.VALUES("id_usuario", "#{idUsuario,jdbcType=INTEGER}");
		}
		if (record.getIdRegiao() != null) {
			sql.VALUES("id_regiao", "#{idRegiao,jdbcType=INTEGER}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_regiao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String selectByExample(AcessoUsuarioRegiaoExample example) {
		SQL sql = new SQL();
		if (example != null && example.isDistinct()) {
			sql.SELECT_DISTINCT("id_usuario");
		} else {
			sql.SELECT("id_usuario");
		}
		sql.SELECT("id_regiao");
		sql.FROM("public.tb_acesso_usuario_regiao");
		applyWhere(sql, example, false);
		if (example != null && example.getOrderByClause() != null) {
			sql.ORDER_BY(example.getOrderByClause());
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_regiao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String updateByExampleSelective(Map<String, Object> parameter) {
		AcessoUsuarioRegiao record = (AcessoUsuarioRegiao) parameter.get("record");
		AcessoUsuarioRegiaoExample example = (AcessoUsuarioRegiaoExample) parameter.get("example");
		SQL sql = new SQL();
		sql.UPDATE("public.tb_acesso_usuario_regiao");
		if (record.getIdUsuario() != null) {
			sql.SET("id_usuario = #{record.idUsuario,jdbcType=INTEGER}");
		}
		if (record.getIdRegiao() != null) {
			sql.SET("id_regiao = #{record.idRegiao,jdbcType=INTEGER}");
		}
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_regiao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String updateByExample(Map<String, Object> parameter) {
		SQL sql = new SQL();
		sql.UPDATE("public.tb_acesso_usuario_regiao");
		sql.SET("id_usuario = #{record.idUsuario,jdbcType=INTEGER}");
		sql.SET("id_regiao = #{record.idRegiao,jdbcType=INTEGER}");
		AcessoUsuarioRegiaoExample example = (AcessoUsuarioRegiaoExample) parameter.get("example");
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_acesso_usuario_regiao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	protected void applyWhere(SQL sql, AcessoUsuarioRegiaoExample example, boolean includeExamplePhrase) {
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