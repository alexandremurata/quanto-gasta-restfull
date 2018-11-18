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
	 * Construtor com parâmetros
	 * @param id			do Eletrodoméstico
	 * @param nome			do Eletrodoméstico
	 * @param potencia		do Eletrodoméstico
	 */
	public Eletrodomestico(final Long id, final String nome, final Double potencia) {
		this.id = id;
		this.nome = nome;
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Eletrodomestico [id = " + id + ", nome = " + nome + 
				", potencia = " + potencia + "]";
	}

}

