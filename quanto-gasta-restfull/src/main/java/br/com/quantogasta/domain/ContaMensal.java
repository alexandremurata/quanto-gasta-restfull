package br.com.quantogasta.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaMensal {

	private Long id;
	private String mesAno;
	private Double valor;
	private Double totalKWH;
	private String bandeira;
	private Tarifa tarifa;
	private Usuario usuario;
	private List<ConsumoEletrodomestico> consumoEletrodomesticos;
	
}
