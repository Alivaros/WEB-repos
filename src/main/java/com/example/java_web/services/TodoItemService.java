package com.example.java_web.services;


import com.example.java_web.models.TodoItem;
import com.example.java_web.repositories.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class TodoItemService
{

    @Autowired
    private TodoItemRepository todoItemRepository;

    public Optional<TodoItem> getById(Long id)
    {
        return todoItemRepository.findById(id);
    }

    public Iterable<TodoItem> getAll()
    {
        return todoItemRepository.findAll();
    }

    public TodoItem save(TodoItem todoItem)
    {
        return todoItemRepository.save(todoItem);
    }

    public void delete(TodoItem todoItem)
    {
        todoItemRepository.delete(todoItem);
    }

}