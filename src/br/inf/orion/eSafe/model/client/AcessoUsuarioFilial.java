package br.inf.orion.eSafe.model.client;

public class AcessoUsuarioFilial {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_acesso_usuario_filial.id_usuario
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Integer idUsuario;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_acesso_usuario_filial.id_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Integer idFilial;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_acesso_usuario_filial.id_usuario
	 * @return  the value of public.tb_acesso_usuario_filial.id_usuario
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Integer getIdUsuario() {
		return idUsuario;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_acesso_usuario_filial.id_usuario
	 * @param idUsuario  the value for public.tb_acesso_usuario_filial.id_usuario
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_acesso_usuario_filial.id_filial
	 * @return  the value of public.tb_acesso_usuario_filial.id_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Integer getIdFilial() {
		return idFilial;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_acesso_usuario_filial.id_filial
	 * @param idFilial  the value for public.tb_acesso_usuario_filial.id_filial
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIdFilial(Integer idFilial) {
		this.idFilial = idFilial;
	}
}