package br.inf.orion.eSafe.client.service.provider;

import br.inf.orion.eSafe.client.model.EnderecoEstabelecimento;
import br.inf.orion.eSafe.client.model.example.EnderecoEstabelecimentoExample;
import br.inf.orion.eSafe.client.model.example.EnderecoEstabelecimentoExample.Criteria;
import br.inf.orion.eSafe.client.model.example.EnderecoEstabelecimentoExample.Criterion;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class EnderecoEstabelecimentoSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_endereco_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String countByExample(EnderecoEstabelecimentoExample example) {
		SQL sql = new SQL();
		sql.SELECT("count(*)").FROM("public.tb_endereco_estabelecimento");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_endereco_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String deleteByExample(EnderecoEstabelecimentoExample example) {
		SQL sql = new SQL();
		sql.DELETE_FROM("public.tb_endereco_estabelecimento");
		applyWhere(sql, example, false);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_endereco_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String insertSelective(EnderecoEstabelecimento record) {
		SQL sql = new SQL();
		sql.INSERT_INTO("public.tb_endereco_estabelecimento");
		if (record.getIdEstabelecimento() != null) {
			sql.VALUES("id_estabelecimento", "#{idEstabelecimento,jdbcType=INTEGER}");
		}
		if (record.getIdEndereco() != null) {
			sql.VALUES("id_endereco", "#{idEndereco,jdbcType=INTEGER}");
		}
		if (record.getTpEndereco() != null) {
			sql.VALUES("tp_endereco", "#{tpEndereco,jdbcType=INTEGER}");
		}
		if (record.getDsLogradouro() != null) {
			sql.VALUES("ds_logradouro", "#{dsLogradouro,jdbcType=VARCHAR}");
		}
		if (record.getDsComplemento() != null) {
			sql.VALUES("ds_complemento", "#{dsComplemento,jdbcType=VARCHAR}");
		}
		if (record.getDsBairro() != null) {
			sql.VALUES("ds_bairro", "#{dsBairro,jdbcType=VARCHAR}");
		}
		if (record.getDsCidade() != null) {
			sql.VALUES("ds_cidade", "#{dsCidade,jdbcType=VARCHAR}");
		}
		if (record.getDsEstado() != null) {
			sql.VALUES("ds_estado", "#{dsEstado,jdbcType=CHAR}");
		}
		if (record.getDsCodigoPostal() != null) {
			sql.VALUES("ds_codigo_postal", "#{dsCodigoPostal,jdbcType=CHAR}");
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_endereco_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String selectByExample(EnderecoEstabelecimentoExample example) {
		SQL sql = new SQL();
		if (example != null && example.isDistinct()) {
			sql.SELECT_DISTINCT("id_estabelecimento");
		} else {
			sql.SELECT("id_estabelecimento");
		}
		sql.SELECT("id_endereco");
		sql.SELECT("tp_endereco");
		sql.SELECT("ds_logradouro");
		sql.SELECT("ds_complemento");
		sql.SELECT("ds_bairro");
		sql.SELECT("ds_cidade");
		sql.SELECT("ds_estado");
		sql.SELECT("ds_codigo_postal");
		sql.FROM("public.tb_endereco_estabelecimento");
		applyWhere(sql, example, false);
		if (example != null && example.getOrderByClause() != null) {
			sql.ORDER_BY(example.getOrderByClause());
		}
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_endereco_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String updateByExampleSelective(Map<String, Object> parameter) {
		EnderecoEstabelecimento record = (EnderecoEstabelecimento) parameter.get("record");
		EnderecoEstabelecimentoExample example = (EnderecoEstabelecimentoExample) parameter.get("example");
		SQL sql = new SQL();
		sql.UPDATE("public.tb_endereco_estabelecimento");
		if (record.getIdEstabelecimento() != null) {
			sql.SET("id_estabelecimento = #{record.idEstabelecimento,jdbcType=INTEGER}");
		}
		if (record.getIdEndereco() != null) {
			sql.SET("id_endereco = #{record.idEndereco,jdbcType=INTEGER}");
		}
		if (record.getTpEndereco() != null) {
			sql.SET("tp_endereco = #{record.tpEndereco,jdbcType=INTEGER}");
		}
		if (record.getDsLogradouro() != null) {
			sql.SET("ds_logradouro = #{record.dsLogradouro,jdbcType=VARCHAR}");
		}
		if (record.getDsComplemento() != null) {
			sql.SET("ds_complemento = #{record.dsComplemento,jdbcType=VARCHAR}");
		}
		if (record.getDsBairro() != null) {
			sql.SET("ds_bairro = #{record.dsBairro,jdbcType=VARCHAR}");
		}
		if (record.getDsCidade() != null) {
			sql.SET("ds_cidade = #{record.dsCidade,jdbcType=VARCHAR}");
		}
		if (record.getDsEstado() != null) {
			sql.SET("ds_estado = #{record.dsEstado,jdbcType=CHAR}");
		}
		if (record.getDsCodigoPostal() != null) {
			sql.SET("ds_codigo_postal = #{record.dsCodigoPostal,jdbcType=CHAR}");
		}
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_endereco_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String updateByExample(Map<String, Object> parameter) {
		SQL sql = new SQL();
		sql.UPDATE("public.tb_endereco_estabelecimento");
		sql.SET("id_estabelecimento = #{record.idEstabelecimento,jdbcType=INTEGER}");
		sql.SET("id_endereco = #{record.idEndereco,jdbcType=INTEGER}");
		sql.SET("tp_endereco = #{record.tpEndereco,jdbcType=INTEGER}");
		sql.SET("ds_logradouro = #{record.dsLogradouro,jdbcType=VARCHAR}");
		sql.SET("ds_complemento = #{record.dsComplemento,jdbcType=VARCHAR}");
		sql.SET("ds_bairro = #{record.dsBairro,jdbcType=VARCHAR}");
		sql.SET("ds_cidade = #{record.dsCidade,jdbcType=VARCHAR}");
		sql.SET("ds_estado = #{record.dsEstado,jdbcType=CHAR}");
		sql.SET("ds_codigo_postal = #{record.dsCodigoPostal,jdbcType=CHAR}");
		EnderecoEstabelecimentoExample example = (EnderecoEstabelecimentoExample) parameter.get("example");
		applyWhere(sql, example, true);
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_endereco_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String updateByPrimaryKeySelective(EnderecoEstabelecimento record) {
		SQL sql = new SQL();
		sql.UPDATE("public.tb_endereco_estabelecimento");
		if (record.getTpEndereco() != null) {
			sql.SET("tp_endereco = #{tpEndereco,jdbcType=INTEGER}");
		}
		if (record.getDsLogradouro() != null) {
			sql.SET("ds_logradouro = #{dsLogradouro,jdbcType=VARCHAR}");
		}
		if (record.getDsComplemento() != null) {
			sql.SET("ds_complemento = #{dsComplemento,jdbcType=VARCHAR}");
		}
		if (record.getDsBairro() != null) {
			sql.SET("ds_bairro = #{dsBairro,jdbcType=VARCHAR}");
		}
		if (record.getDsCidade() != null) {
			sql.SET("ds_cidade = #{dsCidade,jdbcType=VARCHAR}");
		}
		if (record.getDsEstado() != null) {
			sql.SET("ds_estado = #{dsEstado,jdbcType=CHAR}");
		}
		if (record.getDsCodigoPostal() != null) {
			sql.SET("ds_codigo_postal = #{dsCodigoPostal,jdbcType=CHAR}");
		}
		sql.WHERE("id_estabelecimento = #{idEstabelecimento,jdbcType=INTEGER}");
		sql.WHERE("id_endereco = #{idEndereco,jdbcType=INTEGER}");
		return sql.toString();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.tb_endereco_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	protected void applyWhere(SQL sql, EnderecoEstabelecimentoExample example, boolean includeExamplePhrase) {
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