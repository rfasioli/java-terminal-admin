package br.inf.orion.eSafe.client.model;

public class Modelo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.tb_modelo.id_modelo
     *
     * @mbg.generated Tue Dec 06 16:09:58 BRST 2016
     */
    private Integer idModelo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.tb_modelo.id_fabricante
     *
     * @mbg.generated Tue Dec 06 16:09:58 BRST 2016
     */
    private Integer idFabricante;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.tb_modelo.ds_modelo
     *
     * @mbg.generated Tue Dec 06 16:09:58 BRST 2016
     */
    private String dsModelo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.tb_modelo.ic_ativo
     *
     * @mbg.generated Tue Dec 06 16:09:58 BRST 2016
     */
    private Boolean icAtivo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.tb_modelo.id_modelo
     *
     * @return the value of public.tb_modelo.id_modelo
     *
     * @mbg.generated Tue Dec 06 16:09:58 BRST 2016
     */
    public Integer getIdModelo() {
        return idModelo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.tb_modelo.id_modelo
     *
     * @param idModelo the value for public.tb_modelo.id_modelo
     *
     * @mbg.generated Tue Dec 06 16:09:58 BRST 2016
     */
    public void setIdModelo(Integer idModelo) {
        this.idModelo = idModelo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.tb_modelo.id_fabricante
     *
     * @return the value of public.tb_modelo.id_fabricante
     *
     * @mbg.generated Tue Dec 06 16:09:58 BRST 2016
     */
    public Integer getIdFabricante() {
        return idFabricante;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.tb_modelo.id_fabricante
     *
     * @param idFabricante the value for public.tb_modelo.id_fabricante
     *
     * @mbg.generated Tue Dec 06 16:09:58 BRST 2016
     */
    public void setIdFabricante(Integer idFabricante) {
        this.idFabricante = idFabricante;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.tb_modelo.ds_modelo
     *
     * @return the value of public.tb_modelo.ds_modelo
     *
     * @mbg.generated Tue Dec 06 16:09:58 BRST 2016
     */
    public String getDsModelo() {
        return dsModelo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.tb_modelo.ds_modelo
     *
     * @param dsModelo the value for public.tb_modelo.ds_modelo
     *
     * @mbg.generated Tue Dec 06 16:09:58 BRST 2016
     */
    public void setDsModelo(String dsModelo) {
        this.dsModelo = dsModelo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.tb_modelo.ic_ativo
     *
     * @return the value of public.tb_modelo.ic_ativo
     *
     * @mbg.generated Tue Dec 06 16:09:58 BRST 2016
     */
    public Boolean getIcAtivo() {
        return icAtivo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.tb_modelo.ic_ativo
     *
     * @param icAtivo the value for public.tb_modelo.ic_ativo
     *
     * @mbg.generated Tue Dec 06 16:09:58 BRST 2016
     */
    public void setIcAtivo(Boolean icAtivo) {
        this.icAtivo = icAtivo;
    }
}