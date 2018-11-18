package br.com.quantogasta.rules.tarifa;

public interface Tarifa {
	
	public static final Double TARIFA_POR_CONSUMO = 0.035;

	public Double getTarifaFinal();
}
