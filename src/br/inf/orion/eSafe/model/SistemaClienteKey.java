package br.inf.orion.eSafe.model;

public class SistemaClienteKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.tb_sistema_cliente.id_sistema
     *
     * @mbg.generated Thu Dec 22 17:51:58 BRST 2016
     */
    private Integer idSistema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.tb_sistema_cliente.id_cliente
     *
     * @mbg.generated Thu Dec 22 17:51:58 BRST 2016
     */
    private Integer idCliente;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.tb_sistema_cliente.id_sistema
     *
     * @return the value of public.tb_sistema_cliente.id_sistema
     *
     * @mbg.generated Thu Dec 22 17:51:58 BRST 2016
     */
    public Integer getIdSistema() {
        return idSistema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.tb_sistema_cliente.id_sistema
     *
     * @param idSistema the value for public.tb_sistema_cliente.id_sistema
     *
     * @mbg.generated Thu Dec 22 17:51:58 BRST 2016
     */
    public void setIdSistema(Integer idSistema) {
        this.idSistema = idSistema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.tb_sistema_cliente.id_cliente
     *
     * @return the value of public.tb_sistema_cliente.id_cliente
     *
     * @mbg.generated Thu Dec 22 17:51:58 BRST 2016
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.tb_sistema_cliente.id_cliente
     *
     * @param idCliente the value for public.tb_sistema_cliente.id_cliente
     *
     * @mbg.generated Thu Dec 22 17:51:58 BRST 2016
     */
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
}