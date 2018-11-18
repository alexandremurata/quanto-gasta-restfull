package br.com.quantogasta.domain;

public class TarifaBandeiraVermelha implements Tarifa {

	private static final Double TARIFA_ADICIONAL = 0.027;

	@Override
	public Double getTarifaFinal() {
		return this.TARIFA_ADICIONAL * this.TARIFA_POR_CONSUMO;
	}
}
