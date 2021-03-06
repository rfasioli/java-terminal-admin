package br.inf.orion.eSafe.client.service.provider;

import br.inf.orion.eSafe.client.model.Monitoracao;
import br.inf.orion.eSafe.client.model.example.MonitoracaoExample;
import br.inf.orion.eSafe.client.model.example.MonitoracaoExample.Criteria;
import br.inf.orion.eSafe.client.model.example.MonitoracaoExample.Criterion;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MonitoracaoSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_monitoracao
     *
     * @mbg.generated Mon Jan 16 14:30:01 BRST 2017
     */
    public String countByExample(MonitoracaoExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("public.tb_monitoracao");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_monitoracao
     *
     * @mbg.generated Mon Jan 16 14:30:01 BRST 2017
     */
    public String deleteByExample(MonitoracaoExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("public.tb_monitoracao");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_monitoracao
     *
     * @mbg.generated Mon Jan 16 14:30:01 BRST 2017
     */
    public String insertSelective(Monitoracao record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("public.tb_monitoracao");
        
        if (record.getIdTerminal() != null) {
            sql.VALUES("id_terminal", "#{idTerminal,jdbcType=INTEGER}");
        }
        
        if (record.getDtEnvio() != null) {
            sql.VALUES("dt_envio", "#{dtEnvio,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIcStatusTerminal() != null) {
            sql.VALUES("ic_status_terminal", "#{icStatusTerminal,jdbcType=INTEGER}");
        }
        
        if (record.getIdMonitoracao() != null) {
            sql.VALUES("id_monitoracao", "#{idMonitoracao,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_monitoracao
     *
     * @mbg.generated Mon Jan 16 14:30:01 BRST 2017
     */
    public String selectByExample(MonitoracaoExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id_terminal");
        } else {
            sql.SELECT("id_terminal");
        }
        sql.SELECT("dt_envio");
        sql.SELECT("ic_status_terminal");
        sql.SELECT("id_monitoracao");
        sql.FROM("public.tb_monitoracao");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_monitoracao
     *
     * @mbg.generated Mon Jan 16 14:30:01 BRST 2017
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Monitoracao record = (Monitoracao) parameter.get("record");
        MonitoracaoExample example = (MonitoracaoExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("public.tb_monitoracao");
        
        if (record.getIdTerminal() != null) {
            sql.SET("id_terminal = #{record.idTerminal,jdbcType=INTEGER}");
        }
        
        if (record.getDtEnvio() != null) {
            sql.SET("dt_envio = #{record.dtEnvio,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIcStatusTerminal() != null) {
            sql.SET("ic_status_terminal = #{record.icStatusTerminal,jdbcType=INTEGER}");
        }
        
        if (record.getIdMonitoracao() != null) {
            sql.SET("id_monitoracao = #{record.idMonitoracao,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_monitoracao
     *
     * @mbg.generated Mon Jan 16 14:30:01 BRST 2017
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("public.tb_monitoracao");
        
        sql.SET("id_terminal = #{record.idTerminal,jdbcType=INTEGER}");
        sql.SET("dt_envio = #{record.dtEnvio,jdbcType=TIMESTAMP}");
        sql.SET("ic_status_terminal = #{record.icStatusTerminal,jdbcType=INTEGER}");
        sql.SET("id_monitoracao = #{record.idMonitoracao,jdbcType=VARCHAR}");
        
        MonitoracaoExample example = (MonitoracaoExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_monitoracao
     *
     * @mbg.generated Mon Jan 16 14:30:01 BRST 2017
     */
    public String updateByPrimaryKeySelective(Monitoracao record) {
        SQL sql = new SQL();
        sql.UPDATE("public.tb_monitoracao");
        
        if (record.getDtEnvio() != null) {
            sql.SET("dt_envio = #{dtEnvio,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIcStatusTerminal() != null) {
            sql.SET("ic_status_terminal = #{icStatusTerminal,jdbcType=INTEGER}");
        }
        
        if (record.getIdMonitoracao() != null) {
            sql.SET("id_monitoracao = #{idMonitoracao,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id_terminal = #{idTerminal,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.tb_monitoracao
     *
     * @mbg.generated Mon Jan 16 14:30:01 BRST 2017
     */
    protected void applyWhere(SQL sql, MonitoracaoExample example, boolean includeExamplePhrase) {
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
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
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