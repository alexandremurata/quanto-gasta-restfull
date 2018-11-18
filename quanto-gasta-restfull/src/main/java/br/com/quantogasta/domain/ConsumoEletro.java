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
	private Double tempoUso;
}
