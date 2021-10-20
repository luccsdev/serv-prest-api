package com.example.vendasjv.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("vendasproperty") // ver se precisa de uma depedencia
public class VendasPropertyConfig {
	
	private String originPermitida = "http:/localhost:8080";
	
	public String getOriginPermitida() {
		return originPermitida;
	}

	public void setOriginPermitida(String originPermitida) {
		this.originPermitida = originPermitida;
	}

	private final Seguranca seguranca = new Seguranca(); 
	
	
	public Seguranca getSeguranca() {
		return seguranca;
	}

	public static class Seguranca {
		
		private boolean enbleHttps;

		public boolean isEnbleHttps() {
			return enbleHttps;
		}

		public void setEnbleHttps(boolean enbleHttps) {
			this.enbleHttps = enbleHttps;
		}
		
	}

}
