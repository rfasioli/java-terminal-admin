package br.inf.orion.eSafe.client.model;

public class Regiao {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_regiao.id_regiao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Integer idRegiao;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_regiao.ds_regiao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private String dsRegiao;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_regiao.ic_ativo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Boolean icAtivo;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_regiao.id_regiao
	 * @return  the value of public.tb_regiao.id_regiao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Integer getIdRegiao() {
		return idRegiao;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_regiao.id_regiao
	 * @param idRegiao  the value for public.tb_regiao.id_regiao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIdRegiao(Integer idRegiao) {
		this.idRegiao = idRegiao;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_regiao.ds_regiao
	 * @return  the value of public.tb_regiao.ds_regiao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String getDsRegiao() {
		return dsRegiao;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_regiao.ds_regiao
	 * @param dsRegiao  the value for public.tb_regiao.ds_regiao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setDsRegiao(String dsRegiao) {
		this.dsRegiao = dsRegiao;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_regiao.ic_ativo
	 * @return  the value of public.tb_regiao.ic_ativo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Boolean getIcAtivo() {
		return icAtivo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_regiao.ic_ativo
	 * @param icAtivo  the value for public.tb_regiao.ic_ativo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIcAtivo(Boolean icAtivo) {
		this.icAtivo = icAtivo;
	}
}