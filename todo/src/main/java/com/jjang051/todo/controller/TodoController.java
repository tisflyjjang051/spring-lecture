package com.jjang051.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

  @GetMapping("/index")
  public String home() {
    return "/todo/index";
  }
}
