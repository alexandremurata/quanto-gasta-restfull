package br.com.quantogasta.rules;

import br.com.quantogasta.rules.tarifa.Tarifa;
import br.com.quantogasta.rules.tarifa.TarifaBandeiraAmarela;
import br.com.quantogasta.rules.tarifa.TarifaBandeiraVerde;
import br.com.quantogasta.rules.tarifa.TarifaBandeiraVermelha;

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
