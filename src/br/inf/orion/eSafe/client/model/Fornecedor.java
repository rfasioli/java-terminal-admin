package br.inf.orion.eSafe.client.model;

public class Fornecedor {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_fornecedor.id_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Integer idFornecedor;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_fornecedor.ds_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private String dsFornecedor;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_fornecedor.ds_cnpj
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private String dsCnpj;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_fornecedor.ic_ativo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Boolean icAtivo;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_fornecedor.id_fornecedor
	 * @return  the value of public.tb_fornecedor.id_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Integer getIdFornecedor() {
		return idFornecedor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_fornecedor.id_fornecedor
	 * @param idFornecedor  the value for public.tb_fornecedor.id_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIdFornecedor(Integer idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_fornecedor.ds_fornecedor
	 * @return  the value of public.tb_fornecedor.ds_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String getDsFornecedor() {
		return dsFornecedor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_fornecedor.ds_fornecedor
	 * @param dsFornecedor  the value for public.tb_fornecedor.ds_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setDsFornecedor(String dsFornecedor) {
		this.dsFornecedor = dsFornecedor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_fornecedor.ds_cnpj
	 * @return  the value of public.tb_fornecedor.ds_cnpj
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public String getDsCnpj() {
		return dsCnpj;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_fornecedor.ds_cnpj
	 * @param dsCnpj  the value for public.tb_fornecedor.ds_cnpj
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setDsCnpj(String dsCnpj) {
		this.dsCnpj = dsCnpj;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_fornecedor.ic_ativo
	 * @return  the value of public.tb_fornecedor.ic_ativo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Boolean getIcAtivo() {
		return icAtivo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_fornecedor.ic_ativo
	 * @param icAtivo  the value for public.tb_fornecedor.ic_ativo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIcAtivo(Boolean icAtivo) {
		this.icAtivo = icAtivo;
	}
}