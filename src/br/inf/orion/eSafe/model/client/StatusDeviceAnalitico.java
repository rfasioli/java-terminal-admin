package br.inf.orion.eSafe.model.client;

import java.util.List;

public class StatusDeviceAnalitico {

	public enum DeviceEnum{
		TERMINAL(0, "DEVICE_TERMINAL"),
		VALIDADOR(1, "DEVICE_VALIDADOR"),
		IMPRESSORA(2, "DEVICE_IMPRESSORA"),
		BIOMETRIA(3, "DEVICE_BIOMETRIA"),
		PORTA(4, "DEVICE_PORTA"),
		ENERGIA(5, "DEVICE_ENERGIA"),
		VIBRACAO(6, "DEVICE_VIBRACAO"),
		PORTA_GABINETE(7, "DEVICE_PORTA_GABINETE"),
		PRESENCA_MALOTE(8, "DEVICE_PRESENCA_MALOTE"),
		TEMPERATURA(9, "DEVICE_TEMPERATURA"),
		ENTINTAMENTO(10, "DEVICE_ENTINTAMENTO");
		
		private final int valor;
		private final String tag;

		DeviceEnum(int valor, String tag) {
			this.valor = valor;
			this.tag = tag;
		}

		public int getValor() {
			return this.valor;
		}
		public String getTag() {
			return this.tag;
		}
	}
	
	
	private Integer device;
	private String tag;
	private List<StatusAnalitico> status;

	public Integer getDevice() {
		return device;
	}
	public void setDevice(Integer device) {
		this.device = device;
	}

	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public List<StatusAnalitico> getStatus() {
		return status;
	}
	public void setStatus(List<StatusAnalitico> status) {
		this.status = status;
	}

	public StatusDeviceAnalitico() {
	}	

	public StatusDeviceAnalitico(Integer device, String tag, List<StatusAnalitico> status) {
		this.device = device;
		this.tag = tag;
		this.status = status;
	}	

	public StatusDeviceAnalitico(DeviceEnum device, List<StatusAnalitico> status) {
		this.device = device.getValor();
		this.tag = device.getTag();
		this.status = status;
	}	
	
	@Override
	public String toString() {
		String ret = "StatusDeviceAnalitico - Device[" + this.device + "] - Tag[" + this.tag + "]\n";
		for (StatusAnalitico statusAnalitico : this.status) {
			ret += "\t" + statusAnalitico.toString() + "\n";
		} 
		return ret;
	}
}
