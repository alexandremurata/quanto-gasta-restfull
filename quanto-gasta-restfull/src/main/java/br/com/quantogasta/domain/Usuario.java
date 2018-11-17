package br.com.quantogasta.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

/**
 * Classe que representa {@link Usuario}
 *
 */
@Getter
@Setter
public class Usuario {

	private Long id;
	
	private String nome;
    
	/*private List<ConsumoMensal> consumoMensalLista;*/
    
	private List<Eletrodomestico> eletrodomesticos;
    
    public Usuario() {}
   /* 
    public Usuario(final String nome, final List<ConsumoMensal> consumoMensalLista, final List<Eletrodomestico> eletrodomesticos) {
    	this.nome = nome;
    	this.consumoMensalLista = new ArrayList<ConsumoMensal>();
    	this.eletrodomesticos = new ArrayList<Eletrodomestico>();
    }*/

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
	/*public void registrarConsumoMensal(final ConsumoMensal consumoMensal) {
		if (Objects.isNull(consumoMensalLista)) {
			consumoMensalLista = new ArrayList<ConsumoMensal>();
		}
		consumoMensalLista.add(consumoMensal);
	}*/

}

