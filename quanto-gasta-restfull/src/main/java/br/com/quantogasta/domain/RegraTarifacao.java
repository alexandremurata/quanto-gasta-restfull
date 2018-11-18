package br.com.quantogasta.domain;

public class RegraTarifacao {
	
	public static Tarifa getTarifacaoFinal(final Long consumoTotal) {
		if (consumoTotal <= 1000) {
			return new TarifaBandeiraVerde();
		}
		if (consumoTotal <= 2000) {
			return new TarifaBandeiraAmarela();
		}
		return new TarifaBandeiraVermelha();
	}
}
