package br.inf.orion.eSafe.client.model;

public class TipoContato {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_tipo_contato.id_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Integer idTipoContato;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_tipo_contato.ds_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private String dsTipoContato;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_tipo_contato.ic_ativo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Boolean icAtivo;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_tipo_contato.id_tipo_contato
	 * @return  the value of public.tb_tipo_contato.id_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Integer getIdTipoContato() {
		return idTipoContato;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_tipo_contato.id_tipo_contato
	 * @param idTipoContato  the value for public.tb_tipo_contato.id_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIdTipoContato(Integer idTipoContato) {
		this.idTipoContato = idTipoContato;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_tipo_contato.ds_tipo_contato
	 * @return  the value of public.tb_tipo_contato.ds_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String getDsTipoContato() {
		return dsTipoContato;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_tipo_contato.ds_tipo_contato
	 * @param dsTipoContato  the value for public.tb_tipo_contato.ds_tipo_contato
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setDsTipoContato(String dsTipoContato) {
		this.dsTipoContato = dsTipoContato;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_tipo_contato.ic_ativo
	 * @return  the value of public.tb_tipo_contato.ic_ativo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Boolean getIcAtivo() {
		return icAtivo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_tipo_contato.ic_ativo
	 * @param icAtivo  the value for public.tb_tipo_contato.ic_ativo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIcAtivo(Boolean icAtivo) {
		this.icAtivo = icAtivo;
	}
}