package br.techlabz.arquiteturaspring;

import br.techlabz.arquiteturaspring.todos.TodoEntity;
import br.techlabz.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Lazy // instancia o bean somente quando for utilizado. O padrao é NAO LAZY
@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
//@Scope("singleton") // Singleton => Escopo padrão. Uma instancia por toda a aplicação

//@Scope(WebApplicationContext.SCOPE_REQUEST) ou
//@Scope("request") // Request => Nao guarda estado ele existe somente na requisição. usado mais para aplicacoes web

//@Scope("session") // Ativo por toda sessao do usuario

//@Scope("application") // Ativo em toda aplicacao. usado aplicacoes web. mais abrangente que session e compartilhado por todos os usuarios
public class BeanGerenciado {

    @Autowired // via propriedade
    private TodoValidator validator;

    @Autowired
    private AppProperties appProperties;

    @Autowired // via construtor
    public BeanGerenciado(TodoValidator validator){
        this.validator = validator;
    }

    @Autowired // via metodo Set
    public void setValidator(TodoValidator validator){
        this.validator = validator;
    }

    public void imprimirPropriedade(){
        System.out.println("Valor da variavel: " + appProperties.getVariavel());
    }
}
