package br.techlabz.arquiteturaspring.montadora.configuration;

import br.techlabz.arquiteturaspring.montadora.Motor;
import br.techlabz.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Primary // define este bean como o padrão
    @Bean(name = "motorAspirado")
    public Motor motorAspirado(){
        Motor motor = new Motor();
        motor.setModelo("KC-33");
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        Motor motor = new Motor();
        motor.setModelo("KC-56");
        motor.setCavalos(210);
        motor.setCilindros(4);
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean
    public Motor motorTurbo(){
        Motor motor = new Motor();
        motor.setModelo("KC-99");
        motor.setCavalos(400);
        motor.setCilindros(8);
        motor.setLitragem(4.1);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}
