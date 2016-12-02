package br.inf.orion.eSafe.service.dao.client;

import br.inf.orion.eSafe.model.client.Terminal;
import br.inf.orion.eSafe.model.client.example.TbTerminalExample;
import br.inf.orion.eSafe.model.client.example.TbTerminalExample.Criteria;
import br.inf.orion.eSafe.model.client.example.TbTerminalExample.Criterion;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TbTerminalSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String countByExample(TbTerminalExample example) {
		SQL sql = new SQL();
		sql.SELECT("count(*)").FROM("public.tb_terminal");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String deleteByExample(TbTerminalExample example) {
		SQL sql = new SQL();
		sql.DELETE_FROM("public.tb_terminal");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String insertSelective(Terminal record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("public.tb_terminal");
		if (record.getIdTerminal() != null) {
			sql.VALUES("id_terminal", "#{idTerminal,jdbcType=INTEGER}");
		}
		if (record.getIdEstabelecimento() != null) {
			sql.VALUES("id_estabelecimento", "#{idEstabelecimento,jdbcType=INTEGER}");
		}
		if (record.getIdModelo() != null) {
			sql.VALUES("id_modelo", "#{idModelo,jdbcType=INTEGER}");
		}
		if (record.getNrTerminal() != null) {
			sql.VALUES("nr_terminal", "#{nrTerminal,jdbcType=VARCHAR}");
		}
		if (record.getDsTerminal() != null) {
			sql.VALUES("ds_terminal", "#{dsTerminal,jdbcType=VARCHAR}");
		}
		if (record.getIcAtivo() != null) {
			sql.VALUES("ic_ativo", "#{icAtivo,jdbcType=BIT}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String selectByExample(TbTerminalExample example) {
		SQL sql = new SQL();
		if (example != null && example.isDistinct()) {
			sql.SELECT_DISTINCT("id_terminal");
		} else {
			sql.SELECT("id_terminal");
		}
		sql.SELECT("id_estabelecimento");
		sql.SELECT("id_modelo");
		sql.SELECT("nr_terminal");
		sql.SELECT("ds_terminal");
		sql.SELECT("ic_ativo");
		sql.FROM("public.tb_terminal");
		applyWhere(sql, example, false);
		if (example != null && example.getOrderByClause() != null) {
			sql.ORDER_BY(example.getOrderByClause());
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String updateByExampleSelective(Map<String, Object> parameter) {
		Terminal record = (Terminal) parameter.get("record");
		TbTerminalExample example = (TbTerminalExample) parameter.get("example");
		SQL sql = new SQL();
		sql.UPDATE("public.tb_terminal");
		if (record.getIdTerminal() != null) {
			sql.SET("id_terminal = #{record.idTerminal,jdbcType=INTEGER}");
		}
		if (record.getIdEstabelecimento() != null) {
			sql.SET("id_estabelecimento = #{record.idEstabelecimento,jdbcType=INTEGER}");
		}
		if (record.getIdModelo() != null) {
			sql.SET("id_modelo = #{record.idModelo,jdbcType=INTEGER}");
		}
		if (record.getNrTerminal() != null) {
			sql.SET("nr_terminal = #{record.nrTerminal,jdbcType=VARCHAR}");
		}
		if (record.getDsTerminal() != null) {
			sql.SET("ds_terminal = #{record.dsTerminal,jdbcType=VARCHAR}");
		}
		if (record.getIcAtivo() != null) {
			sql.SET("ic_ativo = #{record.icAtivo,jdbcType=BIT}");
		}
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String updateByExample(Map<String, Object> parameter) {
		SQL sql = new SQL();
		sql.UPDATE("public.tb_terminal");
		sql.SET("id_terminal = #{record.idTerminal,jdbcType=INTEGER}");
		sql.SET("id_estabelecimento = #{record.idEstabelecimento,jdbcType=INTEGER}");
		sql.SET("id_modelo = #{record.idModelo,jdbcType=INTEGER}");
		sql.SET("nr_terminal = #{record.nrTerminal,jdbcType=VARCHAR}");
		sql.SET("ds_terminal = #{record.dsTerminal,jdbcType=VARCHAR}");
		sql.SET("ic_ativo = #{record.icAtivo,jdbcType=BIT}");
		TbTerminalExample example = (TbTerminalExample) parameter.get("example");
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String updateByPrimaryKeySelective(Terminal record) {
		SQL sql = new SQL();
		sql.UPDATE("public.tb_terminal");
		if (record.getIdEstabelecimento() != null) {
			sql.SET("id_estabelecimento = #{idEstabelecimento,jdbcType=INTEGER}");
		}
		if (record.getIdModelo() != null) {
			sql.SET("id_modelo = #{idModelo,jdbcType=INTEGER}");
		}
		if (record.getNrTerminal() != null) {
			sql.SET("nr_terminal = #{nrTerminal,jdbcType=VARCHAR}");
		}
		if (record.getDsTerminal() != null) {
			sql.SET("ds_terminal = #{dsTerminal,jdbcType=VARCHAR}");
		}
		if (record.getIcAtivo() != null) {
			sql.SET("ic_ativo = #{icAtivo,jdbcType=BIT}");
		}
		sql.WHERE("id_terminal = #{idTerminal,jdbcType=INTEGER}");
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	protected void applyWhere(SQL sql, TbTerminalExample example, boolean includeExamplePhrase) {
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