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
	private String mesAno;
	private Eletrodomestico eletrodomestico;
	private Double consumoWatt;
	private Double consumoValor;
	private Double tempoUsoDiario;
	private Integer quantidade;
	
	public ConsumoEletro(Long id, String mesAno, Eletrodomestico eletrodomestico, Double consumoWatt,
			Double consumoValor, Double tempoUsoDiario, Integer quantidade) {
		this.id = id;
		this.mesAno = mesAno;
		this.eletrodomestico = eletrodomestico;
		this.consumoWatt = consumoWatt;
		this.consumoValor = consumoValor;
		this.tempoUsoDiario = tempoUsoDiario;
		this.quantidade = quantidade;
	}
	
	public Double calcularConsumoDiario() {
		return (quantidade * eletrodomestico.getPotencia() * tempoUsoDiario) / 1000;
	}


}
