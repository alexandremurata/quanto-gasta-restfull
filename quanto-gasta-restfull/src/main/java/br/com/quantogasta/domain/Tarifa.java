package br.com.quantogasta.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

/**
 * Classe que representa {@link Tarifa}
 *
 */
@Getter
@Setter
@Entity
public class Tarifa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
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