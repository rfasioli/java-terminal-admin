package br.inf.orion.eSafe.client.model;

public class Filial {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_filial.id_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Integer idFilial;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_filial.id_regiao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Integer idRegiao;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_filial.ds_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private String dsFilial;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_filial.ic_ativo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Boolean icAtivo;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_filial.id_filial
	 * @return  the value of public.tb_filial.id_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Integer getIdFilial() {
		return idFilial;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_filial.id_filial
	 * @param idFilial  the value for public.tb_filial.id_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIdFilial(Integer idFilial) {
		this.idFilial = idFilial;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_filial.id_regiao
	 * @return  the value of public.tb_filial.id_regiao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Integer getIdRegiao() {
		return idRegiao;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_filial.id_regiao
	 * @param idRegiao  the value for public.tb_filial.id_regiao
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIdRegiao(Integer idRegiao) {
		this.idRegiao = idRegiao;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_filial.ds_filial
	 * @return  the value of public.tb_filial.ds_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String getDsFilial() {
		return dsFilial;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_filial.ds_filial
	 * @param dsFilial  the value for public.tb_filial.ds_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setDsFilial(String dsFilial) {
		this.dsFilial = dsFilial;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_filial.ic_ativo
	 * @return  the value of public.tb_filial.ic_ativo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Boolean getIcAtivo() {
		return icAtivo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_filial.ic_ativo
	 * @param icAtivo  the value for public.tb_filial.ic_ativo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIcAtivo(Boolean icAtivo) {
		this.icAtivo = icAtivo;
	}
}