package br.inf.orion.eSafe.model.client;

public class StatusDispositivoKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_status_dispositivo.id_dispositivo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Integer idDispositivo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.tb_status_dispositivo.cd_status
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	private Integer cdStatus;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_status_dispositivo.id_dispositivo
	 * @return  the value of public.tb_status_dispositivo.id_dispositivo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Integer getIdDispositivo() {
		return idDispositivo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_status_dispositivo.id_dispositivo
	 * @param idDispositivo  the value for public.tb_status_dispositivo.id_dispositivo
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setIdDispositivo(Integer idDispositivo) {
		this.idDispositivo = idDispositivo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.tb_status_dispositivo.cd_status
	 * @return  the value of public.tb_status_dispositivo.cd_status
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public Integer getCdStatus() {
		return cdStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.tb_status_dispositivo.cd_status
	 * @param cdStatus  the value for public.tb_status_dispositivo.cd_status
	 * @mbg.generated  Fri Dec 02 12:03:10 BRST 2016
	 */
	public void setCdStatus(Integer cdStatus) {
		this.cdStatus = cdStatus;
	}
}