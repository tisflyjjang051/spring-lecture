package com.jjang051.ch02.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// spring

@Controller
@Slf4j
public class HomeController {

  @GetMapping("/")
  public String home(
    Model model,
    @RequestParam(name = "username") String username,
    @RequestParam(name = "age") int age
  ) {
    //System.out.println(username);
    log.info("username={},age={}", username, age);
    model.addAttribute("msg", "메세지를 내려 보냅니다.");
    return "/index/index";
  }
}
