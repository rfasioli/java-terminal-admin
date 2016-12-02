package br.inf.orion.eSafe.model.client.bkp;

public class Modelo {
    private Integer idModelo;
    private Integer idFabricante;
    private String dsModelo;
    private Boolean icAtivo;

    public Integer getIdModelo() { return idModelo; }
    public void setIdModelo(Integer idModelo) { this.idModelo = idModelo; }
    public Integer getIdFabricante() { return idFabricante; }
    public void setIdFabricante(Integer idFabricante) { this.idFabricante = idFabricante; }
    public String getDsModelo() { return dsModelo; }
    public void setDsModelo(String dsModelo) { this.dsModelo = dsModelo; }
    public Boolean getIcAtivo() { return icAtivo; }
    public void setIcAtivo(Boolean icAtivo) { this.icAtivo = icAtivo; }
}