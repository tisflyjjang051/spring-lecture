package com.jjang051.todo.controller;

import com.jjang051.todo.dto.TodoDto;
import com.jjang051.todo.service.TodoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

  @Autowired
  TodoService todoService;

  @GetMapping("/index")
  public String home() {
    return "/todo/index";
  }

  @PostMapping("/insert")
  @ResponseBody
  public List<TodoDto> insertTodo(TodoDto todoDto) {
    int result = todoService.insertTodo(todoDto);
    List<TodoDto> todoList = todoService.getAllTodo(todoDto.getPickedDate());
    return todoList;
  }
}
