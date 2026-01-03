package br.techlabz.arquiteturaspring;

import br.techlabz.arquiteturaspring.todos.TodoEntity;
import br.techlabz.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanGerenciado {

    @Autowired // via propriedade
    private TodoValidator validator;

    @Autowired // via construtor
    public BeanGerenciado(TodoValidator validator){
        this.validator = validator;
    }

    @Autowired // via metodo Set
    public void setValidator(TodoValidator validator){
        this.validator = validator;
    }
}
