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
	private List<ConsumoEletro> consumoEletros;
	
	public ContaMensal(final Double totalValor, final List<ConsumoEletro> consumoEletros) {
		this.totalValor = totalValor;
		this.consumoEletros = consumoEletros;
	}
	
	/*private static Double calcularConsumoTotal(List<ConsumoEletro> consumoEletros) {
        return consumoEletros.stream().mapToLong(ConsumoEletro::calcularConsumoDiario()).sum();
    } */
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append("ID: ").append(id)
		.append("MES_ANO: ").append(mesAno)
		.append("TOTAL_VALOR: ").append(totalValor)
		.append("TOTAL_KWH: ").append(totalKWH)
		.append("CONSUMO ELETRODOMESTICOS: ").append(consumoEletros).toString();
	}
}
