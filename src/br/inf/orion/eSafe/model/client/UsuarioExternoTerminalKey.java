package br.inf.orion.eSafe.model.client;

public class UsuarioExternoTerminalKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_usuario_externo_terminal.id_usuario
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Integer idUsuario;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_usuario_externo_terminal.id_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Integer idTerminal;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_usuario_externo_terminal.id_usuario
	 * @return  the value of public.tb_usuario_externo_terminal.id_usuario
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Integer getIdUsuario() {
		return idUsuario;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_usuario_externo_terminal.id_usuario
	 * @param idUsuario  the value for public.tb_usuario_externo_terminal.id_usuario
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_usuario_externo_terminal.id_terminal
	 * @return  the value of public.tb_usuario_externo_terminal.id_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Integer getIdTerminal() {
		return idTerminal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_usuario_externo_terminal.id_terminal
	 * @param idTerminal  the value for public.tb_usuario_externo_terminal.id_terminal
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIdTerminal(Integer idTerminal) {
		this.idTerminal = idTerminal;
	}
}