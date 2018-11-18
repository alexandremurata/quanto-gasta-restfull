package br.com.quantogasta.domain;

import java.util.List;

public class CalculaConta {

	private RegraTarifacao regraTarifacao;

    /*private static Long calculaConsumoTotal(final List<ConsumoEletro> listaConsumos){
        return listaConsumos.stream().mapToLong(ConsumoEletro::getConsumoTotal).sum();
    }

    private static Double calculaValor(Double consumoTotal) {
        Tarifa tarifa = RegraTarifacao.getTarifa(consumoTotal);
        return calculaConsumoTotal() * tarifa.getTarifacaoFinal();
    }

    public ContaMensal getContaFinal(List<ConsumoEletro> listaConsumos){
        Double consumoTotalCalculado = this.calculaConsumoTotal(listaConsumos);
        Double valor = this.calculaValor(consumoTotalCalculado);
        return new ContaMensal(valor, listaConsumos);
    }*/
}
