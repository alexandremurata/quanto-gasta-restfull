package br.com.quantogasta.carga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.quantogasta.domain.Eletrodomestico;
import br.com.quantogasta.domain.Tarifa;
import br.com.quantogasta.repository.EletrodomesticoRepository;
import br.com.quantogasta.repository.TarifaRepository;

@Component
public class RepositoryTest 
implements ApplicationRunner 
{
	
	private static final Long ID_ELETRO1 = 1L;
	private static final Long ID_TARIFA1 = 1L;
	
	@Autowired
	private EletrodomesticoRepository eletrodomesticoRepository;
	
	@Autowired
	private TarifaRepository tarifaRepository;
	
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
    	
    	System.out.println(">>> Iniciando carga de dados...");
    	Eletrodomestico eletro1 = new Eletrodomestico(ID_ELETRO1, "Televisão", 100D, 50D);
    	eletrodomesticoRepository.saveAndFlush(eletro1);
    	
//    	Tarifa tarifa1 = new Tarifa(ID_TARIFA1, 5.0);
//    	tarifaRepository.saveAndFlush(tarifa1);
    	
    	System.out.println(">>> Eletrodomestico 1 - Televisão : "+ eletro1);
//    	System.out.println(">>> Tarifa 1 - T1 : "+ tarifa1);
    	
    	
		
    }
 
}