package br.inf.orion.eSafe.model.client;

public class AcessoUsuarioFornecedor {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_acesso_usuario_fornecedor.id_usuario
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Integer idUsuario;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_acesso_usuario_fornecedor.id_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Integer idFornecedor;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_acesso_usuario_fornecedor.id_usuario
	 * @return  the value of public.tb_acesso_usuario_fornecedor.id_usuario
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Integer getIdUsuario() {
		return idUsuario;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_acesso_usuario_fornecedor.id_usuario
	 * @param idUsuario  the value for public.tb_acesso_usuario_fornecedor.id_usuario
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_acesso_usuario_fornecedor.id_fornecedor
	 * @return  the value of public.tb_acesso_usuario_fornecedor.id_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Integer getIdFornecedor() {
		return idFornecedor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_acesso_usuario_fornecedor.id_fornecedor
	 * @param idFornecedor  the value for public.tb_acesso_usuario_fornecedor.id_fornecedor
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIdFornecedor(Integer idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
}