package com.github.juliherms.todo.service;

import com.github.juliherms.todo.entities.Todo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TodoService {
    Mono<Todo> findTodoById(Long id);
    Mono<Todo> searchTodoByTitle(String title);
    Flux<Todo> findAllTodos();
    Mono<Todo> saveTodo(Todo todo);
    Mono<Void> deleteTodoById(Long id);

}
