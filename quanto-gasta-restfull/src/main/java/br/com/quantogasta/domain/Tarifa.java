package br.com.quantogasta.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Classe que representa {@link Tarifa}
 *
 */
@Getter
@Setter
public class Tarifa {

	private Long id;
	private Double valor;
	
	public Tarifa () {
		super();
	}

	public Tarifa(final Long id, final Double valor) {
		super();
		this.id = id;
		this.valor = valor;
	}
	
	@Override
		public String toString() {
			return "Tarifa [ID = " + id + " VALOR = " + valor + " ]";
		}
	
}