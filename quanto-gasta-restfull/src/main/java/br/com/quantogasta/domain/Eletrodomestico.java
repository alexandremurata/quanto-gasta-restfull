package br.com.quantogasta.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
/**
 * Classe que representa {@link Eletrodomestico}
 */
@Getter
@Setter
@Entity
public class Eletrodomestico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private Double potencia;
	
	@NotNull
	private Double qtdeHoras;
	
	@NotNull
	private Double consumoPorHora;
	
	@ManyToOne(optional = true)
	private Usuario usuario;

	/**
	 * Construtor
	 */
	public Eletrodomestico() {
		super();
	}

	/**
	 * Construtor com parâmetros
	 * @param nome			do Eletrodoméstico
	 * @param potencia		do Eletrodoméstico
	 * @param qtdeHoras		do Eletrodoméstico
	 */
	public Eletrodomestico(final Long id, final String nome, final Double potencia, final Double qtdeHoras) {
		super();
		this.id = id;
		this.nome = nome;
		this.potencia = potencia;
		this.qtdeHoras = qtdeHoras;
		this.consumoPorHora = 0D;
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
				", potencia = " + potencia + ", qtdeHoras = " + qtdeHoras + 
				", consumoPorHora = " + consumoPorHora + "]";
	}

}

