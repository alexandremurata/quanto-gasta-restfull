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
public class ConsumoEletrodomestico {

	private Long id;
	private String mesAno;
	private Eletrodomestico eletrodomestico;
	private Float consumoWatt;
	private Float consumoValor;
	private Float tempoUso;
}
