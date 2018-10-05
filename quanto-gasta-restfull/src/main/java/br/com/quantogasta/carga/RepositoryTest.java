package br.com.quantogasta.carga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.quantogasta.domain.Eletrodomestico;
import br.com.quantogasta.repository.EletrodomesticoRepository;

@Component
public class RepositoryTest 
implements ApplicationRunner 
{
	
	private static final Long ID_ELETRO1 = 1L;
	
	@Autowired
	private EletrodomesticoRepository eletrodomesticoRepository;
	
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
    	
    	System.out.println(">>> Iniciando carga de dados...");
    	Eletrodomestico eletro1 = new Eletrodomestico(ID_ELETRO1, "Televisão", 100D, 50D);
    	
    	eletrodomesticoRepository.saveAndFlush(eletro1);
    	System.out.println(">>> Eletrodomestico 1 - Televisão : "+ eletro1);
		
    }
 
}