package br.inf.orion.eSafe.client.model;

public class AcessoUsuarioEstabelecimento {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_acesso_usuario_estabelecimento.id_usuario
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Integer idUsuario;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_acesso_usuario_estabelecimento.id_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Integer idEstabelecimento;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_acesso_usuario_estabelecimento.id_usuario
	 * @return  the value of public.tb_acesso_usuario_estabelecimento.id_usuario
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Integer getIdUsuario() {
		return idUsuario;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_acesso_usuario_estabelecimento.id_usuario
	 * @param idUsuario  the value for public.tb_acesso_usuario_estabelecimento.id_usuario
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_acesso_usuario_estabelecimento.id_estabelecimento
	 * @return  the value of public.tb_acesso_usuario_estabelecimento.id_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Integer getIdEstabelecimento() {
		return idEstabelecimento;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_acesso_usuario_estabelecimento.id_estabelecimento
	 * @param idEstabelecimento  the value for public.tb_acesso_usuario_estabelecimento.id_estabelecimento
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIdEstabelecimento(Integer idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}
}