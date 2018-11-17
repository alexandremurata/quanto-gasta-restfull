package br.com.quantogasta.domain;

import lombok.Getter;
import lombok.Setter;
/**
 * Classe que representa {@link Eletrodomestico}
 */
@Getter
@Setter
public class Eletrodomestico {

	private Long id;
	private String nome;
	private Double potencia;

	/**
	 * Construtor
	 */
	public Eletrodomestico() {
		super();
	}

	/**
	 * Construtor com parâmetros
	 * @param id			do Eletrodoméstico
	 * @param nome			do Eletrodoméstico
	 * @param potencia		do Eletrodoméstico
	 */
	public Eletrodomestico(final Long id, final String nome, final Double potencia) {
		super();
		this.id = id;
		this.nome = nome;
		this.potencia = potencia;
	}

	/**
	 * Método responsável por calcular o consumo por hora do eletrodoméstico
	 * @param qtdHoraMes
	 * @param potencia		do eletrodoméstico
	 * @return				consumo por hora
	 */
	public Double calcularConsumoPorHora(final Double qtdHoraMes, final Double potencia){
		return qtdHoraMes * potencia;
	}
	
	@Override
	public String toString() {
		return "Eletrodomestico [id = " + id + ", nome = " + nome + 
				", potencia = " + potencia + "]";
	}

}

