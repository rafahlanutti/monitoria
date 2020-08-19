package br.com.todo.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.todo.todo.model.Todo;
import br.com.todo.todo.service.TodoService;

@RestController
@RequestMapping({ "/todo" })
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> findAll() {
        return todoService.listaTodos();

    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> findAll(@PathVariable Integer id) {
        Todo todo = todoService.recuperarTodo(id);

        if (todo == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .build();
        }
        return ResponseEntity.status(HttpStatus.OK)
                             .body(todoService.recuperarTodo(id));
    }
    
    @PostMapping
    public ResponseEntity<Todo>  postTodo(@RequestBody Todo todo) {
        return  ResponseEntity.status(HttpStatus.OK)
                .body(todoService.addTodo(todo));
    }

}
