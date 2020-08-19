package br.com.todo.todo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.todo.todo.model.Todo;

@Service
public class TodoService {

    private List<Todo> cache;
    private Integer proximo = 4;
    public TodoService() {
        cache = new ArrayList<>();
        cache.add(new Todo(1,"Monitor","Aula 01", true));
        cache.add(new Todo(2,"Alunos","Estao na monitoria", true));
        cache.add(new Todo(3,"Professor","Esta dando aula", true));
    
    }
    
    public List<Todo> listaTodos() {
        return cache;
    }

    public Todo recuperarTodo(Integer id) {
        for (Todo todo : cache) {
            if(todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }

    public Todo addTodo(Todo todo) {
      proximo = proximo +1;
      todo.setId(proximo);
      cache.add(todo);
      return todo;
    }
}


