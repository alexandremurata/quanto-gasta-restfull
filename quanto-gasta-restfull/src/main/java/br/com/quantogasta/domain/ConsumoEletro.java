package br.com.quantogasta.domain;

import lombok.Getter;
import lombok.Setter;

/*
 * 
 * Eletrodomestico > Consumo Eletrodomestico > ContaMensal
 * 
 * 
 * 
 * */

@Getter
@Setter
public class ConsumoEletro {

	private Long id;
	private Eletrodomestico eletrodomestico;
	private Double tempoUsoDiario;
	private Integer quantidade;
	
	public ConsumoEletro(Long id, Eletrodomestico eletrodomestico, Double tempoUsoDiario, Integer quantidade) {
		this.id = id;
		this.eletrodomestico = eletrodomestico;
		this.tempoUsoDiario = tempoUsoDiario;
		this.quantidade = quantidade;
	}
	
	public Double calcularConsumoDiario() {
		return quantidade * ((eletrodomestico.getPotencia() * tempoUsoDiario) / 1000);
	}

}
