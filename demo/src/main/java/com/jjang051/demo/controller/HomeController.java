package com.jjang051.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/home")
  public String home() {
    return "home"; // view page   html, jsp  view Resolver  thymeleaf
  }

  @GetMapping("/introduce")
  public String introduce() {
    return "introduce";
  }
}
