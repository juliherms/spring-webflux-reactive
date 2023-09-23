package com.github.juliherms.todo.repository;

import com.github.juliherms.todo.entities.Todo;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface TodoRepository extends ReactiveCrudRepository<Todo,Long> {

    Mono<Todo> findTodoByTitle(String title);
}
