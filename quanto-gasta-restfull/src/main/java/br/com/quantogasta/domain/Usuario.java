package br.com.quantogasta.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.Getter;
import lombok.Setter;

/**
 * Classe que representa {@link Usuario}
 *
 */
@Getter
@Setter
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @NotNull
	private String nome;
    
    @OneToMany(mappedBy = "usuario")
    @Cascade(CascadeType.ALL)
	private List<ConsumoMensal> consumoMensalLista;
    
    @OneToMany(mappedBy = "usuario")
    @Cascade(CascadeType.ALL)
	private List<Eletrodomestico> eletrodomesticos;
    
    public Usuario() {}

	/**
	 * Método responsável por adicionar um {@link Eletrodomestico} à lista
	 * @param eletrodomestico	Objeto {@link Eletrodomestico}
	 */
	public void resgistrarEletrodomestico(final Eletrodomestico eletrodomestico) {
		if (Objects.isNull(this.eletrodomesticos)) {
			eletrodomesticos = new ArrayList<Eletrodomestico>();
		}
		eletrodomesticos.add(eletrodomestico);
	}

	/**
	 * Método responsável por adicionar o consumo mensal de um {@link Eletrodomestico} à lista
	 * @param consumoMensal		Objeto {@link ConsumoMensal}
	 */
	public void registrarConsumoMensal(final ConsumoMensal consumoMensal) {
		if (Objects.isNull(consumoMensalLista)) {
			consumoMensalLista = new ArrayList<ConsumoMensal>();
		}
		consumoMensalLista.add(consumoMensal);
	}

}

