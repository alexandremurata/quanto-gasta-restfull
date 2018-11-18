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
	private Tarifa tarifa;
	private List<ConsumoEletro> consumoEletros;
	private String statusContaMensal;
	
	
	
	/**public Double calcularConsumoMensal(final Tarifa tarifa, final Double totalKWH, final String bandeira) {
		if (ConstantUtils.VERMELHO.equalsIgnoreCase(bandeira)) {
			return totalKWH * tarifa.getValor() + (totalKWH / 100) * 3;
		}
		if (ConstantUtils.AMARELO.equalsIgnoreCase(bandeira)) {
			return totalKWH * tarifa.getValor() + (totalKWH / 100) * 2;
		}

		return totalKWH * tarifa.getValor();
	}

	public void registarConsumoPorHora(final Double consumoPorHora) {
		if(Objects.isNull(consumosPorHora)) {
			consumosPorHora = new ArrayList<Double>();
		}
		consumosPorHora.add(consumoPorHora);
	}**/
}
