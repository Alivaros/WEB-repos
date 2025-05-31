package com.example.java_web.repositories;

import com.example.java_web.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TodoItemRepository extends JpaRepository<TodoItem, Long>
{

}
