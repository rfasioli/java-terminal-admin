package br.inf.orion.eSafe.model.client.specialized;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class TotalDeposito implements Serializable {

	private Date data;
	private Double dinheiro;
	private Double envelope;
	private Double cheque;
	
	
	public Date getData(){
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public Double getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(Double dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	public Double getEnvelope() {
		return envelope;
	}
	public void setEnvelope(Double envelope) {
		this.envelope = envelope;
	}
	
	public Double getCheque() {
		return cheque;
	}
	public void setCheque(Double cheque) {
		this.cheque = cheque;
	}
	

	public TotalDeposito(){
		super();
	}

	public TotalDeposito(Date data, Double dinheiro, Double envelope, Double cheque){
		super();
		this.data = data;
		this.dinheiro = dinheiro;
		this.envelope = envelope;
		this.cheque = cheque;
	}
	
	@Override
	public String toString(){
		return new String("TotalDeposito: Data[" + data.toLocalDate() + "], Dinheiro:[" + dinheiro + "]" +
						  		  ", Envelope:[" + envelope + "], Cheque:[" + cheque + "]");
	}
	
}
