package br.inf.orion.eSafe.model;

public class TipoContato {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.tb_tipo_contato.tp_contato
     *
     * @mbg.generated Thu Dec 22 17:51:58 BRST 2016
     */
    private Integer tpContato;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.tb_tipo_contato.ds_tipo_contato
     *
     * @mbg.generated Thu Dec 22 17:51:58 BRST 2016
     */
    private String dsTipoContato;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.tb_tipo_contato.tp_contato
     *
     * @return the value of public.tb_tipo_contato.tp_contato
     *
     * @mbg.generated Thu Dec 22 17:51:58 BRST 2016
     */
    public Integer getTpContato() {
        return tpContato;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.tb_tipo_contato.tp_contato
     *
     * @param tpContato the value for public.tb_tipo_contato.tp_contato
     *
     * @mbg.generated Thu Dec 22 17:51:58 BRST 2016
     */
    public void setTpContato(Integer tpContato) {
        this.tpContato = tpContato;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.tb_tipo_contato.ds_tipo_contato
     *
     * @return the value of public.tb_tipo_contato.ds_tipo_contato
     *
     * @mbg.generated Thu Dec 22 17:51:58 BRST 2016
     */
    public String getDsTipoContato() {
        return dsTipoContato;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.tb_tipo_contato.ds_tipo_contato
     *
     * @param dsTipoContato the value for public.tb_tipo_contato.ds_tipo_contato
     *
     * @mbg.generated Thu Dec 22 17:51:58 BRST 2016
     */
    public void setDsTipoContato(String dsTipoContato) {
        this.dsTipoContato = dsTipoContato;
    }
}