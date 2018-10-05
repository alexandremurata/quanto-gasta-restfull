package br.com.quantogasta.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import br.com.quantogasta.utils.ConstantUtils;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ConsumoMensal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private String mesAno;
	
	@NotNull
	private Double valor;
	
	@NotNull
	private Double totalKWH;
	
	@NotNull
	private String bandeira;
	
	@OneToOne
	private Tarifa tarifa;
	
	@ManyToOne(optional = true)
	private Usuario usuario;
	
	private Double consumosPorHora;

	public ConsumoMensal(){
		super();
	}

	public ConsumoMensal(final String mesAno, final Double valor) {
		this.mesAno = mesAno;
		this.valor = valor;
	}

	public Double calcularConsumoMensal(final Tarifa tarifa, final Double totalKWH, final String bandeira) {
		if (ConstantUtils.VERMELHO.equalsIgnoreCase(bandeira)) {
			return totalKWH * tarifa.getValor() + (totalKWH / 100) * 3;
		}
		if (ConstantUtils.AMARELO.equalsIgnoreCase(bandeira)) {
			return totalKWH * tarifa.getValor() + (totalKWH / 100) * 2;
		}

		return totalKWH * tarifa.getValor();
	}

	/**public void registarConsumoPorHora(final Double consumoPorHora) {
		if(Objects.isNull(consumosPorHora)) {
			consumosPorHora = new ArrayList<Double>();
		}
		consumosPorHora.add(consumoPorHora);
	}**/

}

