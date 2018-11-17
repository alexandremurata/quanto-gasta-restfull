package br.com.quantogasta.domain;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

/*
 * 
 * Eletrodomestico > Consumo Eletrodomestico > ContaMensal
 * 
 * 
 * 
 * */

@Entity
@Getter
@Setter
public class ConsumoEletrodomestico {

	private String mesAno;
	private Eletrodomestico eletrodomestico;
	private Float consumoWatt;
	private Float consumoValor;
}
