package br.com.quantogasta.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaMensal {

	private Long id;
	private String mesAno;
	private Double totalValor;
	private Double totalKWH;
	private String bandeira;
	private List<ConsumoEletro> consumoEletros;
	private String statusContaMensal;
	
	public ContaMensal(final Double totalValor, final List<ConsumoEletro> consumoEletros) {
		this.totalValor = totalValor;
		this.consumoEletros = consumoEletros;
	}
	
	/*private static Double calcularConsumoTotal(List<ConsumoEletro> consumoEletros) {
        return consumoEletros.stream().mapToLong(ConsumoEletro::calcularConsumoDiario()).sum();
    } */
}
