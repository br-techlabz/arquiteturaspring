package br.techlabz.arquiteturaspring.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;
    private TodoValidator validator;
    private MailSender mailSender;

    //injeção de dependencia direta usando o construtor
    public TodoService(TodoRepository repository, TodoValidator validator, MailSender mailSender){
        this.repository = repository;
        this.validator = validator;
        this.mailSender = mailSender;
    }

    public TodoEntity salvar (TodoEntity novoTodo){
        validator.validar(novoTodo);
        return repository.save(novoTodo);
    }

    public void atualizarStatus (TodoEntity todo){
        repository.save(todo);
        mailSender.enviar("TODO com a desrição " + todo.getDescricao());
    }

    public TodoEntity buscarPorId(Integer id){
        return repository.findById(id).orElse(null);
    }


}
