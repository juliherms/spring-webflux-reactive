package com.github.juliherms.todo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("todos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    @Id
    private Long id;

    @Column("title")
    private String title;

    @Column("description")
    private String description;
}
