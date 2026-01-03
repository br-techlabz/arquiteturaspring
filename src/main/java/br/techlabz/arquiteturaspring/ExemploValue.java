package br.techlabz.arquiteturaspring;

import org.hibernate.sql.ast.tree.expression.JsonObjectAggUniqueKeysBehavior;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExemploValue {

    //Recuperado o valor de uma propriedade Spring
    @Value("${app.config.variavel}")
    private String variavel;

    public void imprimirVariavel(){
        System.out.println(variavel);
    }
}
