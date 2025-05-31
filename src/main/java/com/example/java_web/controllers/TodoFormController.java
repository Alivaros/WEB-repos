package com.example.java_web.controllers;


import com.example.java_web.models.TodoItem;
import com.example.java_web.repositories.TodoItemRepository;
import com.example.java_web.services.TodoItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoFormController
{
    @Autowired
    private TodoItemRepository todoItemRepository;
    @Autowired
    private TodoItemService todoItemService;

    @GetMapping("/create-todo")
    public String showCreateForm(TodoItem todoItem)
    {
        return "new-todo-item";
    }

    @PostMapping("/todo")
    public String createToDoItem(@Valid TodoItem todoItem, BindingResult bindingResult, Model model)
    {
        TodoItem item = new TodoItem();
        item.setDescription(todoItem.getDescription());
        item.setIsComplete(todoItem.getIsComplete());

        todoItemRepository.save(item);
        return "redirect:/";

    }

    @GetMapping("/delete/{id}")
    public String deleteTodoItem(@PathVariable("id") Long id, Model model)
    {
        TodoItem todoItem = todoItemService.getById(id).orElseThrow(() -> new IllegalArgumentException("TodoItem id: " + id + " not found"));

        todoItemService.delete(todoItem);
        return "redirect:/";

    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model)
    {
        TodoItem todoItem = todoItemService.getById(id).orElseThrow(() -> new IllegalArgumentException("TodoItem id: " + id + " not found"));

        model.addAttribute("todo",todoItem);
        return "edit-todo-item";

    }
    @PostMapping("/todo/{id}")
    public String updateTodoItem(@PathVariable("id") Long id, TodoItem todoItem, BindingResult bindingResult, Model model)
    {
        TodoItem item = todoItemService.getById(id).orElseThrow(() -> new IllegalArgumentException("TodoItem id: " + id + " not found"));

        item.setIsComplete(todoItem.getIsComplete());
        item.setDescription(todoItem.getDescription());

        todoItemRepository.save(item);
        return "redirect:/";
    }

}
