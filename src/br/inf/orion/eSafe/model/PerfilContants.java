package br.inf.orion.eSafe.model;

import java.io.Serializable;

import javax.validation.constraints.*;


@SuppressWarnings("serial")
public class PerfilContants implements Serializable {

	public enum TipoPerfilEnum{
		MASTER(0, "{{'TIPO_PERFIL_MASTER' | translate}}"),
		CLIENTE(1, "{{'TIPO_PERFIL_CLIENTE' | translate}}");

		private final int valor;
		private final String tag;

		TipoPerfilEnum(int valor, String tag) {
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

	public enum NivelPerfilEnum{
		MASTER(0, "{{'NIVEL_PERFIL_MASTER' | translate}}"),
		CLIENTE(1, "{{'NIVEL_PERFIL_CLIENTE' | translate}}"),
		REGIAO(2, "{{'NIVEL_PERFIL_REGIAO' | translate}}"),
		FILIAL(3, "{{'NIVEL_PERFIL_FILIAL' | translate}}"),
		FORNECEDOR(4, "{{'NIVEL_PERFIL_FORNECEDOR' | translate}}"),
		ESTABELECIMENTO(5, "{{'NIVEL_PERFIL_ESTABELECIMENTO' | translate}}");

		private final int valor;
		private final String tag;

		NivelPerfilEnum(int valor, String tag) {
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
	
}
